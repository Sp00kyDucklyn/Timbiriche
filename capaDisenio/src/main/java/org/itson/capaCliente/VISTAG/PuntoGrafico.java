/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.VISTAG;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import org.itson.capadominio.Punto;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 * Clase PuntoGrafico: Representa gráficamente un punto en un contexto gráfico (Graphics2D).
 * Implementa la interfaz IFiguras para proporcionar la lógica de pintado.
 * 
 * @author equipo 1
 */
public class PuntoGrafico implements IFiguras {

    private int ancho;
    private int largo;
    private Punto punto;

    /**
     * Constructor de la clase PuntoGrafico.
     * 
     * @param ancho Ancho del punto.
     * @param largo Largo del punto.
     * @param punto Objeto Punto que representa las coordenadas del punto.
     */
    public PuntoGrafico(int ancho, int largo, Punto punto) {
        this.ancho = ancho;
        this.largo = largo;
        this.punto = punto;
    }

    /**
     * Constructor alternativo de la clase PuntoGrafico.
     * Crea un punto con un ancho y largo predeterminados.
     * 
     * @param punto Objeto Punto que representa las coordenadas del punto.
     */
    public PuntoGrafico(Punto punto) {
        this.ancho = 2;
        this.largo = 2;
        this.punto = punto;
    }

    /**
     * Método pintar: Implementa la lógica de pintado del punto en un contexto gráfico.
     * 
     * @param g2 Contexto gráfico en el que se pintará el punto.
     */
    @Override
    public void pintar(Graphics2D g2) {
        Shape circulo = new Ellipse2D.Double(punto.getX() - (ancho / 2), punto.getY() - (largo / 2), ancho, largo);
        // Rellenar el círculo en el contexto gráfico
        g2.fill(circulo);
    }

    /**
     * Método getAncho: Retorna el ancho del punto.
     * 
     * @return Ancho del punto.
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * Método setAncho: Establece el ancho del punto.
     * 
     * @param ancho Nuevo ancho del punto.
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * Método getLargo: Retorna el largo del punto.
     * 
     * @return Largo del punto.
     */
    public int getLargo() {
        return largo;
    }

    /**
     * Método setLargo: Establece el largo del punto.
     * 
     * @param largo Nuevo largo del punto.
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }

    /**
     * Método getPunto: Retorna el objeto Punto asociado a PuntoGrafico.
     * 
     * @return Objeto Punto asociado.
     */
    public Punto getPunto() {
        return punto;
    }

    /**
     * Método setPunto: Establece el objeto Punto asociado a PuntoGrafico.
     * 
     * @param punto Nuevo objeto Punto asociado.
     */
    public void setPunto(Punto punto) {
        this.punto = punto;
    }
}
