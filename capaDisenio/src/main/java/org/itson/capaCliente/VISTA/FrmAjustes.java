/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.capaCliente.VISTA;


import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import org.itson.capaCliente.PRESENTADOR.IPresentadorAjustes;

/**
 *
 * @author equipo 1
 */
public class FrmAjustes extends javax.swing.JFrame {

    /**
     * Creates new form FrmAjustes
     */
    private String color;
    
    
    private String[] imagenes;
    IPresentadorAjustes presentadorA;
    
    public FrmAjustes(IPresentadorAjustes presentadorA) {
        initComponents();
        mostrar(posicion);
        imagenes = obtenerImg();
        this.presentadorA = presentadorA;
    }
    private int posicion = 0;
    //Esto cambiara a uno de tipo jugador, que va a estar guardando el avatar
    private String imagen = null;
    private String imagenSeleccionada = null;
    
    public String[] obtenerImg(){
        File f = new File(getClass().getResource("/avatares").getFile());
        String[] Imagenes = f.list();
        return Imagenes;
    }
    
    public void mostrar(int index){
        String[] Imagen = obtenerImg();
        
        imagen = Imagen[index];
        System.out.println(imagen);
        ImageIcon icon = new ImageIcon(getClass().getResource("/avatares/"+imagen));
        Image image = icon.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
        lblImagen.setIcon(new ImageIcon(image));
    }
    
    public void moverAbajo(){
        new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmAjustes.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p = this.lblImagen.getX();
        if(p>-1){
            posicion++;
            if(posicion >= obtenerImg().length){
                posicion = 0;
            } 
            mostrar(posicion);
        }
    }
    
    public void moverArriba(){
        new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmAjustes.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p = this.lblImagen.getX();
        if(p>-1){
            posicion--;
            if(posicion >= obtenerImg().length){
                posicion = 0;
            } 
            mostrar(posicion);
        }
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReturn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnSeleccion = new javax.swing.JButton();
        btnFlechaAbajo = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ColorRojo = new javax.swing.JPanel();
        colorAzul = new javax.swing.JPanel();
        colorAmarillo = new javax.swing.JPanel();
        colorVerde = new javax.swing.JPanel();
        checkRojo = new javax.swing.JCheckBox();
        checkAzul = new javax.swing.JCheckBox();
        checkAmarillo = new javax.swing.JCheckBox();
        checkVerde = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/return.png"))); // NOI18N
        btnReturn.setContentAreaFilled(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 73, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSiguiente.setText("sig");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, -1, -1));

        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        btnFlechaAbajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Flecha abajo (1).png"))); // NOI18N
        btnFlechaAbajo.setContentAreaFilled(false);
        btnFlechaAbajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFlechaAbajoMousePressed(evt);
            }
        });
        btnFlechaAbajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFlechaAbajoKeyPressed(evt);
            }
        });
        jPanel1.add(btnFlechaAbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 80, 80));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 680));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 710, 680));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 150, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese Nombre:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        ColorRojo.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.add(ColorRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 50));

        colorAzul.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.add(colorAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 90, 50));

        colorAmarillo.setBackground(new java.awt.Color(153, 0, 153));
        jPanel2.add(colorAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 90, 50));

        colorVerde.setBackground(new java.awt.Color(0, 255, 0));
        jPanel2.add(colorVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 100, 50));

        checkRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRojoActionPerformed(evt);
            }
        });
        jPanel2.add(checkRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        checkAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAzulActionPerformed(evt);
            }
        });
        jPanel2.add(checkAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        checkAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAmarilloActionPerformed(evt);
            }
        });
        jPanel2.add(checkAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        checkVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVerdeActionPerformed(evt);
            }
        });
        jPanel2.add(checkVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        presentadorA.btnRegresarCrearSala();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnFlechaAbajoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFlechaAbajoMousePressed
        // TODO add your handling code here:
        moverAbajo();
    }//GEN-LAST:event_btnFlechaAbajoMousePressed

    private void btnFlechaAbajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFlechaAbajoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
             moverAbajo();
        }else if(evt.getKeyCode() == KeyEvent.VK_UP){
            moverArriba();
        }
    }//GEN-LAST:event_btnFlechaAbajoKeyPressed

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed
        // TODO add your handling code here:
           if(imagenSeleccionada != null){
               imagenSeleccionada = null;
               btnSeleccion.setIcon(null); 
           }else{
               imagenSeleccionada= imagen;
               btnSeleccion.setIcon(new ImageIcon(getClass().getResource("/iconos/heart.png")));
           }
    }//GEN-LAST:event_btnSeleccionActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        
        presentadorA.crearJugador(color, this.txtNombre.getText(),imagenSeleccionada);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void checkRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRojoActionPerformed
        if(checkRojo.isSelected()){
            checkAzul.setEnabled(false);
            checkAmarillo.setEnabled(false);
            checkVerde.setEnabled(false);
        }else{
            checkAzul.setEnabled(true);
            checkAmarillo.setEnabled(true);
            checkVerde.setEnabled(true);
        }
    }//GEN-LAST:event_checkRojoActionPerformed

    private void checkAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAzulActionPerformed
        if(checkAzul.isSelected()){
            checkRojo.setEnabled(false);
            checkAmarillo.setEnabled(false);
            checkVerde.setEnabled(false);
        }else{
            checkRojo.setEnabled(true);
            checkAmarillo.setEnabled(true);
            checkVerde.setEnabled(true);
        }
    }//GEN-LAST:event_checkAzulActionPerformed

    private void checkAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAmarilloActionPerformed
        if(checkAmarillo.isSelected()){
            checkAzul.setEnabled(false);
            checkRojo.setEnabled(false);
            checkVerde.setEnabled(false);
        }else{
            checkAzul.setEnabled(true);
            checkRojo.setEnabled(true);
            checkVerde.setEnabled(true);
        }
    }//GEN-LAST:event_checkAmarilloActionPerformed

    private void checkVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVerdeActionPerformed
        if(checkVerde.isSelected()){
            checkAzul.setEnabled(false);
            checkAmarillo.setEnabled(false);
            checkRojo.setEnabled(false);
        }else{
            checkAzul.setEnabled(true);
            checkAmarillo.setEnabled(true);
            checkRojo.setEnabled(true);
        }
    }//GEN-LAST:event_checkVerdeActionPerformed

    public String getImagenSeleccionada() {
        return imagen;
    }
    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(FrmAjustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmAjustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmAjustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmAjustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmAjustes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ColorRojo;
    private javax.swing.JButton btnFlechaAbajo;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSeleccion;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JCheckBox checkAmarillo;
    private javax.swing.JCheckBox checkAzul;
    private javax.swing.JCheckBox checkRojo;
    private javax.swing.JCheckBox checkVerde;
    private javax.swing.JPanel colorAmarillo;
    private javax.swing.JPanel colorAzul;
    private javax.swing.JPanel colorVerde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
