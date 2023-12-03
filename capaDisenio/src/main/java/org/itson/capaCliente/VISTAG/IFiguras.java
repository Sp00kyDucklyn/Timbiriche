/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.capaCliente.VISTAG;

import java.awt.Graphics2D;

/**
 * Interfaz IFiguras: Define el contrato para las clases que representan figuras gráficas.
 * Las clases que implementan esta interfaz deben proporcionar la lógica de pintado.
 * 
 * @author equipo 1
 */
public interface IFiguras {

    /**
     * Método pintar: Define la lógica de pintado de la figura gráfica en un contexto gráfico (Graphics2D).
     * 
     * @param g2 Contexto gráfico en el que se pintará la figura.
     */
    void pintar(Graphics2D g2);
}