/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.capadisenio;

import javax.swing.ImageIcon;

/**
 *
 * @author hoshi
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuPrincipal
     */
    public FrmMenuPrincipal() {
        initComponents();
//        botonCrearSala = new ImageIcon("BotonCrear2.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        PanelBotones = new javax.swing.JPanel();
        btnCrearSala = new javax.swing.JButton();
        btnUnirseSala = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        lblTitulo4 = new javax.swing.JLabel();
        lblTitulo5 = new javax.swing.JLabel();
        lblTitulo6 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1209, 680));
        setResizable(false);

        Panel1.setMinimumSize(new java.awt.Dimension(1280, 729));
        Panel1.setPreferredSize(new java.awt.Dimension(1209, 680));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBotones.setOpaque(false);
        PanelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botón Crear Sala.png"))); // NOI18N
        btnCrearSala.setContentAreaFilled(false);
        btnCrearSala.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botón Crear Sala.png"))); // NOI18N
        btnCrearSala.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BotonCrear2.png"))); // NOI18N
        btnCrearSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearSalaMouseEntered(evt);
            }
        });
        btnCrearSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearSalaActionPerformed(evt);
            }
        });
        PanelBotones.add(btnCrearSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 440, 110));

        btnUnirseSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botón Unirse Sala.png"))); // NOI18N
        btnUnirseSala.setContentAreaFilled(false);
        btnUnirseSala.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botón Unirse Sala.png"))); // NOI18N
        btnUnirseSala.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BotonUnirse2.png"))); // NOI18N
        btnUnirseSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirseSalaActionPerformed(evt);
            }
        });
        PanelBotones.add(btnUnirseSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 410, 100));

        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botón Ajustes.png"))); // NOI18N
        btnAjustes.setContentAreaFilled(false);
        btnAjustes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botón Ajustes.png"))); // NOI18N
        btnAjustes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BotonAjustes2.png"))); // NOI18N
        btnAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustesActionPerformed(evt);
            }
        });
        PanelBotones.add(btnAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 390, 100));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botón Quit.png"))); // NOI18N
        btnSalir.setContentAreaFilled(false);
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botón Quit.png"))); // NOI18N
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BotonQuit2.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelBotones.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 370, 100));

        Panel1.add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 540, 450));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setFont(new java.awt.Font("Britannic Bold", 1, 96)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("GUERRA");
        jPanel1.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 380, 80));

        lblTitulo2.setFont(new java.awt.Font("Britannic Bold", 1, 96)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo2.setText("PUNTOS");
        jPanel1.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        lblTitulo3.setFont(new java.awt.Font("Britannic Bold", 1, 64)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo3.setText("DE");
        jPanel1.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lblTitulo4.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo4.setFont(new java.awt.Font("Britannic Bold", 1, 96)); // NOI18N
        lblTitulo4.setText("GUERRA");
        jPanel1.add(lblTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 380, 80));

        lblTitulo5.setFont(new java.awt.Font("Britannic Bold", 1, 96)); // NOI18N
        lblTitulo5.setText("PUNTOS");
        jPanel1.add(lblTitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        lblTitulo6.setFont(new java.awt.Font("Britannic Bold", 1, 64)); // NOI18N
        lblTitulo6.setText("DE");
        jPanel1.add(lblTitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        Panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 470, 180));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondoModif.png"))); // NOI18N
        Panel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1209, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearSalaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearSalaMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCrearSalaMouseEntered

    private void btnCrearSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearSalaActionPerformed
        // TODO add your handling code here:
        FrmCrearSala crearSala = new FrmCrearSala();
        crearSala.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearSalaActionPerformed

    private void btnUnirseSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirseSalaActionPerformed
        // TODO add your handling code here:
        FrmUnirseSala unirSala = new FrmUnirseSala();
        unirSala.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUnirseSalaActionPerformed

    private void btnAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustesActionPerformed
        // TODO add your handling code here:
        FrmAjustes ajustes = new FrmAjustes();
        ajustes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAjustesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnCrearSala;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUnirseSala;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lblTitulo6;
    // End of variables declaration//GEN-END:variables
}
