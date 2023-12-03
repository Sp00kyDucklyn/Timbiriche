/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.VISTAG;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase FigurasGraficas: Representa un contenedor para una lista de figuras gráficas.
 * Implementa la interfaz IFiguras para permitir el pintado gráfico.
 * 
 * @author equipo 1
 */
public class FigurasGraficas implements IFiguras {

    private List<IFiguras> figuras;  // Lista de figuras gráficas

    /**
     * Constructor de la clase FigurasGraficas.
     */
    public FigurasGraficas() {
        figuras = new ArrayList<>();
    }

    /**
     * Agrega una figura a la lista de figuras.
     * 
     * @param figura Figura que se agregará a la lista.
     */
    public void agregarLista(IFiguras figura) {
        figuras.add(figura);
    }

    /**
     * Elimina una figura de la lista de figuras.
     * 
     * @param figura Figura que se eliminará de la lista.
     */
    public void eliminarLista(IFiguras figura) {
        figuras.remove(figura);
    }

    /**
     * Pinta todas las figuras en la lista en un contexto gráfico (Graphics2D).
     * 
     * @param g2 Contexto gráfico en el que se pintarán las figuras.
     */
    @Override
    public void pintar(Graphics2D g2) {
        for (IFiguras figura : figuras) {
            figura.pintar(g2);
        }
    }

    // Métodos getters y setters para acceder a las propiedades de la clase

    /**
     * 
     * @return 
     */
    public List<IFiguras> getFiguras() {
        return figuras;
    }

    /**
     * 
     * @param figuras 
     */
    public void setFiguras(List<IFiguras> figuras) {
        this.figuras = figuras;
    }
}
