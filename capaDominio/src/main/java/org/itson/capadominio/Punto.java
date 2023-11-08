/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capadominio;

/**
 *
 * @author equipo 1
 */
/**
 * La clase Punto representa un punto en un plano cartesiano con coordenadas x e y.
 */
public class Punto {
    // Coordenada x del punto
    private int x;
    
    // Coordenada y del punto
    private int y;

    /**
     * Constructor por defecto de la clase Punto. Inicializa las coordenadas x e y con valores por defecto (0).
     */
    public Punto() {
    }

    /**
     * Constructor de la clase Punto con parámetros. Inicializa el punto con las coordenadas x e y especificadas.
     *
     * @param x La coordenada x del punto.
     * @param y La coordenada y del punto.
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Obtiene la coordenada x del punto.
     *
     * @return La coordenada x del punto.
     */
    public int getX() {
        return x;
    }

    /**
     * Establece la coordenada x del punto.
     *
     * @param x La coordenada x que se va a establecer.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Obtiene la coordenada y del punto.
     *
     * @return La coordenada y del punto.
     */
    public int getY() {
        return y;
    }

    /**
     * Establece la coordenada y del punto.
     *
     * @param y La coordenada y que se va a establecer.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Devuelve una representación en cadena del punto, que incluye las coordenadas x e y.
     *
     * @return Una cadena que representa el punto en formato "x = [valor de x] y = [valor de y]".
     */
    @Override
    public String toString() {
        return "x = " + x + " y = " + y;
    }
}
