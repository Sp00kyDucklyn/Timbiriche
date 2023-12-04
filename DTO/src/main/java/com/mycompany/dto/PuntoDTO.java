/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;
import java.io.Serializable;
/**
 * Esta clase representa un punto en un plano cartesiano con coordenadas x e y.
 * Implementa la interfaz Serializable para soportar serialización.
 *
 * @author equipo 1
 */
public class PuntoDTO implements Serializable{
    /**
     * Coordenada x del punto.
     */
    private int x;

    /**
     * Coordenada y del punto.
     */
    private int y;

    /**
     * Constructor por defecto que inicializa un punto en (0, 0).
     */
    public PuntoDTO() {
    }

    /**
     * Constructor que inicializa un punto con las coordenadas especificadas.
     *
     * @param x Coordenada x del punto.
     * @param y Coordenada y del punto.
     */
    public PuntoDTO(int x, int y) {
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
     * @param x La coordenada x a establecer.
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
     * @param y La coordenada y a establecer.
     */
    public void setY(int y) {
        this.y = y;
    }
    
}
