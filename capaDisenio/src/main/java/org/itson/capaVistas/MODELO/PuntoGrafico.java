/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaVistas.MODELO;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import org.itson.capadominio.Punto;

/**
 *
 * @author hoshi
 */
public class PuntoGrafico implements IFiguras{
    
    private int ancho, largo;
    private Punto punto;

    public PuntoGrafico(int ancho, int largo, Punto punto) {
        this.ancho = ancho;
        this.largo = largo;
        this.punto = punto;
    }

    public PuntoGrafico(Punto punto) {
        this.ancho = 2;
        this.largo = 2;
        this.punto = punto;
    }
    
    @Override
    public void pintar(Graphics2D g2) {
        Shape circulite = new Ellipse2D.Double(punto.getX()-2, punto.getY()-2, ancho, largo);
//        g2.setColor(Color.CYAN);
        g2.fill(circulite);
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }
    
}
