/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.VISTA;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author hoshi
 */
public class FondoMenu extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        dibujarFondo(g);
    }
    
    public void dibujarFondo(Graphics g){
        Image fondo = new ImageIcon(getClass().getResource("/Backup.png")).getImage();
        //Si es fondo es 0, 0 es para que se pinte todo.
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    }
}
