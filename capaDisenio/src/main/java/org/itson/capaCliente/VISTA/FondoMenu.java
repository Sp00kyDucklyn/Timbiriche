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
 * Clase que representa un panel con un fondo de imagen.
 * Extiende JPanel y sobrescribe el método paintComponent para dibujar el fondo.
 * El fondo se carga desde un archivo de imagen llamado "Backup.png".
 * 
 * @author hoshi
 */
public class FondoMenu extends JPanel {

    /**
     * Sobrescribe el método paintComponent para dibujar el fondo en el panel.
     * @param g Objeto Graphics utilizado para dibujar en el panel.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujarFondo(g);
    }

    /**
     * Método que dibuja el fondo en el panel.
     * @param g Objeto Graphics utilizado para dibujar en el panel.
     */
    public void dibujarFondo(Graphics g) {
        // Carga la imagen de fondo desde el archivo "Backup.png"
        Image fondo = new ImageIcon(getClass().getResource("/Backup.png")).getImage();
        // Dibuja la imagen de fondo, ocupando todo el tamaño del panel
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    }

}
