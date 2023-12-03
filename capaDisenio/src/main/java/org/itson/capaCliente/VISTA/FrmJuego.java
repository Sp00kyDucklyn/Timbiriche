/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.capaCliente.VISTA;

import java.awt.Color;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import org.itson.capaCliente.PRESENTADOR.IPresentadorJuego;
import org.itson.capaCliente.VISTAG.TableroGrafico;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Linea;
import org.itson.capadominio.Tablero;

/**
 * Clase FrmJuego: Representa un formulario para la visualización y manipulación
 * del juego en una interfaz gráfica. Permite mostrar el tablero, las líneas
 * colocadas por los jugadores y la información de los jugadores en tiempo real.
 * Implementa la lógica de interacción con la interfaz gráfica y el manejo de
 * eventos. La clase está diseñada para ser utilizada en conjunto con un
 * presentador de juego (IPresentadorJuego).
 *
 * @author equipo 1
 */
public class FrmJuego extends javax.swing.JFrame {

    // Variables para almacenar el tablero gráfico y el presentador de juego
    TableroGrafico tablero;
    IPresentadorJuego presentadorJ;

    /**
     * Constructor de la clase FrmJuego. Inicializa los componentes de la
     * interfaz gráfica y configura el tablero gráfico y el presentador de
     * juego.
     *
     * @param presentadorJ Implementación de la interfaz IPresentadorJuego que
     * manejará la lógica del juego.
     */
    public FrmJuego(IPresentadorJuego presentadorJ) {
        this.presentadorJ = presentadorJ;
        tablero = new TableroGrafico(new Tablero());
        initComponents();

        // Configurar el tablero gráfico
        ELPEPEpanel.add(tablero);
        tablero.setBackground(new Color(153, 204, 255));
        tablero.setSize(ELPEPEpanel.getSize());
    }

    /**
     * Método para establecer el jugador activo en el tablero gráfico.
     *
     * @param jugador Jugador activo a establecer en el tablero gráfico.
     */
    public void setJugador(Jugador jugador) {
        tablero.setJugador(jugador);
    }

    /**
     * Método para enviar el tablero al tablero gráfico.
     */
    public void mandarTablero() {
        Tablero tablerito = presentadorJ.regresarTablero();
        tablero.setTablero(tablerito);
        tablero.crearTableroGrafico();
    }

    /**
     * Método para colocar una línea en el tablero gráfico.
     *
     * @param linea Línea a colocar.
     * @param jugador Jugador que colocó la línea.
     */
    public void colocarLinea(Linea linea, Jugador jugador) {
        tablero.colocarLinea(linea, jugador);
    }

    /**
     * Método para establecer la lista de jugadores en el tablero gráfico.
     *
     * @param jugadores Lista de jugadores a establecer en el tablero gráfico.
     */
    public void setListaJugadores(List<Jugador> jugadores) {
        tablero.setJugadores(jugadores);
    }

    /**
     * Método para mostrar la información de los jugadores en la interfaz
     * gráfica.
     */
    public void MostrarJugadores() {
        List<Jugador> jugadores = presentadorJ.getListaJugadores();
        if (jugadores.isEmpty()) {
            return;
        }

        for (int i = 0; i < jugadores.size(); i++) {
            if (i == 0) {
                lblJugador1.setText(jugadores.get(0).getNombre() + ":" + jugadores.get(i).getCodigoExclusivo());
                if (presentadorJ.getJugadorTurno().getCodigoExclusivo() == jugadores.get(i).getCodigoExclusivo()) {
                    lblJugador1.setForeground(Color.red);
                } else {
                    lblJugador1.setForeground(Color.black);
                }
                ImageIcon icon = new ImageIcon(getClass().getResource("/avatares/" + jugadores.get(0).getAvatar()));
                ImageIcon iconoRedimensionado = new ImageIcon(icon.getImage().getScaledInstance(lblAvatar1.getWidth(), lblAvatar1.getHeight(), Image.SCALE_SMOOTH));
                lblAvatar1.setIcon(iconoRedimensionado);
                lblPuntacion1.setText(String.valueOf(jugadores.get(i).getPuntaje()));
            }
            if (i == 1) {
                if (presentadorJ.getJugadorTurno().getCodigoExclusivo() == jugadores.get(i).getCodigoExclusivo()) {
                    lblJugador2.setForeground(Color.red);
                } else {
                    lblJugador2.setForeground(Color.black);
                }
                lblJugador2.setText(jugadores.get(1).getNombre() + ":" + jugadores.get(i).getCodigoExclusivo());
                ImageIcon icon = new ImageIcon(getClass().getResource("/avatares/" + jugadores.get(1).getAvatar()));
                ImageIcon iconoRedimensionado = new ImageIcon(icon.getImage().getScaledInstance(lblAvatar2.getWidth(), lblAvatar2.getHeight(), Image.SCALE_SMOOTH));
                lblAvatar2.setIcon(iconoRedimensionado);
                lblPuntacion2.setText(String.valueOf(jugadores.get(i).getPuntaje()));
            }
            if (i == 2) {
                if (presentadorJ.getJugadorTurno().getCodigoExclusivo() == jugadores.get(i).getCodigoExclusivo()) {
                    lblJugador3.setForeground(Color.red);
                } else {
                    lblJugador3.setForeground(Color.black);
                }
                lblJugador3.setText(jugadores.get(2).getNombre() + ":" + jugadores.get(i).getCodigoExclusivo());
                ImageIcon icon = new ImageIcon(getClass().getResource("/avatares/" + jugadores.get(2).getAvatar()));
                ImageIcon iconoRedimensionado = new ImageIcon(icon.getImage().getScaledInstance(lblAvatar3.getWidth(), lblAvatar3.getHeight(), Image.SCALE_SMOOTH));
                lblAvatar3.setIcon(iconoRedimensionado);
                lblPuntacion3.setText(String.valueOf(jugadores.get(i).getPuntaje()));
            }
            if (i == 3) {
                if (presentadorJ.getJugadorTurno().getCodigoExclusivo() == jugadores.get(i).getCodigoExclusivo()) {
                    lblJugador4.setForeground(Color.red);
                } else {
                    lblJugador4.setForeground(Color.black);
                }
                lblJugador4.setText(jugadores.get(3).getNombre() + ":" + jugadores.get(i).getCodigoExclusivo());
                ImageIcon icon = new ImageIcon(getClass().getResource("/avatares/" + jugadores.get(3).getAvatar()));
                ImageIcon iconoRedimensionado = new ImageIcon(icon.getImage().getScaledInstance(lblAvatar4.getWidth(), lblAvatar4.getHeight(), Image.SCALE_SMOOTH));
                lblAvatar4.setIcon(iconoRedimensionado);
                lblPuntacion4.setText(String.valueOf(jugadores.get(i).getPuntaje()));
            }
        }
        tablero.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ELPEPEpanel = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();
        jugador3 = new javax.swing.JPanel();
        lblAvatar3 = new javax.swing.JLabel();
        lblPuntacion3 = new javax.swing.JLabel();
        lblJugador3 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JPanel();
        lblAvatar2 = new javax.swing.JLabel();
        lblPuntacion2 = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
        jugador1 = new javax.swing.JPanel();
        lblAvatar1 = new javax.swing.JLabel();
        lblPuntacion1 = new javax.swing.JLabel();
        lblJugador1 = new javax.swing.JLabel();
        jugador4 = new javax.swing.JPanel();
        lblAvatar4 = new javax.swing.JLabel();
        lblPuntacion4 = new javax.swing.JLabel();
        lblJugador4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(682, 402));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ELPEPEpanel.setBackground(new java.awt.Color(153, 204, 255));
        ELPEPEpanel.setPreferredSize(new java.awt.Dimension(650, 570));
        ELPEPEpanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ELPEPEpanelMouseMoved(evt);
            }
        });
        ELPEPEpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ELPEPEpanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ELPEPEpanelLayout = new javax.swing.GroupLayout(ELPEPEpanel);
        ELPEPEpanel.setLayout(ELPEPEpanelLayout);
        ELPEPEpanelLayout.setHorizontalGroup(
            ELPEPEpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        ELPEPEpanelLayout.setVerticalGroup(
            ELPEPEpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(ELPEPEpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 690, 610));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 690, 610));

        jugador3.setPreferredSize(new java.awt.Dimension(150, 200));
        jugador3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAvatar3.setPreferredSize(new java.awt.Dimension(150, 150));
        jugador3.add(lblAvatar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jugador3.add(lblPuntacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 150, 20));
        jugador3.add(lblJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 150, 20));

        getContentPane().add(jugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 150, -1));

        jugador2.setPreferredSize(new java.awt.Dimension(150, 200));
        jugador2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAvatar2.setPreferredSize(new java.awt.Dimension(150, 150));
        jugador2.add(lblAvatar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jugador2.add(lblPuntacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 150, 20));
        jugador2.add(lblJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 150, 20));

        getContentPane().add(jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        jugador1.setPreferredSize(new java.awt.Dimension(150, 200));
        jugador1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAvatar1.setPreferredSize(new java.awt.Dimension(150, 150));
        jugador1.add(lblAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jugador1.add(lblPuntacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 150, 20));
        jugador1.add(lblJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 150, 20));

        getContentPane().add(jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, -1));

        jugador4.setPreferredSize(new java.awt.Dimension(150, 200));
        jugador4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAvatar4.setPreferredSize(new java.awt.Dimension(150, 150));
        jugador4.add(lblAvatar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jugador4.add(lblPuntacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 150, 20));
        jugador4.add(lblJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 150, 20));

        getContentPane().add(jugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt 
     */
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_formMousePressed

    /**
     * 
     * @param evt 
     */
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_formMouseMoved

    /**
     * 
     * @param evt 
     */
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    /**
     * 
     * @param evt 
     */
    private void ELPEPEpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELPEPEpanelMousePressed
        // TODO add your handling code here:
        if (presentadorJ.esTurno()) {
            Linea linea = tablero.verificarLinea(evt);
            if (linea != null) {
                presentadorJ.colocaLinea(linea, tablero.getJugador());
            }
        } else {
            System.out.println("NO usted no va a jugar");
        }
    }//GEN-LAST:event_ELPEPEpanelMousePressed

    /**
     * 
     * @param evt 
     */
    private void ELPEPEpanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELPEPEpanelMouseMoved
        // TODO add your handling code here:
        tablero.pintarLineaPanthom(evt);
    }//GEN-LAST:event_ELPEPEpanelMouseMoved

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmJuego().setVisible(true);
//            }
//        });
//    }

    /**
     * 
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ELPEPEpanel;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel jugador1;
    private javax.swing.JPanel jugador2;
    private javax.swing.JPanel jugador3;
    private javax.swing.JPanel jugador4;
    private javax.swing.JLabel lblAvatar1;
    private javax.swing.JLabel lblAvatar2;
    private javax.swing.JLabel lblAvatar3;
    private javax.swing.JLabel lblAvatar4;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblJugador3;
    private javax.swing.JLabel lblJugador4;
    private javax.swing.JLabel lblPuntacion1;
    private javax.swing.JLabel lblPuntacion2;
    private javax.swing.JLabel lblPuntacion3;
    private javax.swing.JLabel lblPuntacion4;
    // End of variables declaration//GEN-END:variables
}
