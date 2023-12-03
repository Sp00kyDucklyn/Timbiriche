/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.VISTAG;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import org.itson.capadominio.Linea;
import org.itson.capadominio.Posicion;
import static org.itson.capadominio.Posicion.HORIZONTAL;
import static org.itson.capadominio.Posicion.VERTICAL;
import org.itson.capadominio.Punto;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Clase LineaGrafica: Representa gráficamente una línea en un contexto gráfico (Graphics2D).
 * Implementa la interfaz IFiguras para proporcionar la lógica de pintado.
 * 
 * @author equipo 1
 */
public class LineaGrafica implements IFiguras {

    private Linea linea;
    private Color color;

    /**
     * Constructor de la clase LineaGrafica.
     * 
     * @param linea Objeto Linea que representa la línea lógica.
     */
    public LineaGrafica(Linea linea) {
        this.linea = linea;
    }

    /**
     * Método pintar: Implementa la lógica de pintado de la línea en un contexto gráfico.
     * 
     * @param g2 Contexto gráfico en el que se pintará la línea.
     */
    @Override
    public void pintar(Graphics2D g2) {
        Punto puntoInicio = linea.getPuntoInicio();
        Punto puntoFin = linea.getPuntoFin();
        g2.setColor(color);
        
        // Dibujar la línea con un contorno de tres píxeles para resaltarla
        if (linea.getPosicion() == Posicion.VERTICAL) {
            g2.drawLine((puntoInicio.getX() - 1), puntoInicio.getY(), (puntoFin.getX() - 1), puntoFin.getY());
            g2.drawLine(puntoInicio.getX(), puntoInicio.getY(), puntoFin.getX(), puntoFin.getY());
            g2.drawLine((puntoInicio.getX() + 1), puntoInicio.getY(), (puntoFin.getX() + 1), puntoFin.getY());
        } else {
            g2.drawLine(puntoInicio.getX(), (puntoInicio.getY() - 1), puntoFin.getX(), (puntoFin.getY() - 1));
            g2.drawLine(puntoInicio.getX(), puntoInicio.getY(), puntoFin.getX(), puntoFin.getY());
            g2.drawLine(puntoInicio.getX(), (puntoInicio.getY() + 1), puntoFin.getX(), (puntoFin.getY() + 1));
        }

        // Restaurar el color a negro después de pintar la línea
        g2.setColor(Color.BLACK);
    }

    /**
     * Método hitBox: Retorna un objeto Rectangle que representa la región de colisión de la línea.
     * 
     * @return Objeto Rectangle que representa la región de colisión.
     */
    public Rectangle hitBox() {
        Punto puntoInicio = linea.getPuntoInicio();
        Punto puntoFin = linea.getPuntoFin();
        if (linea.getPosicion() == Posicion.VERTICAL) {
            return new Rectangle((puntoInicio.getX() - 3), puntoInicio.getY(), 7, (puntoFin.getY() - puntoInicio.getY()));
        }
        if (linea.getPosicion() == Posicion.HORIZONTAL) {
            return new Rectangle(puntoInicio.getX(), (puntoInicio.getY() - 3), (puntoFin.getX() - puntoInicio.getX()), 7);
        }
        return null;
    }

    /**
     * Método getColor: Retorna el color de la línea.
     * 
     * @return Color de la línea.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Método setColor: Establece el color de la línea.
     * 
     * @param color Nuevo color de la línea.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Método getLinea: Retorna el objeto Linea asociado a la LineaGrafica.
     * 
     * @return Objeto Linea asociado.
     */
    public Linea getLinea() {
        return linea;
    }

    /**
     * Método setLinea: Establece el objeto Linea asociado a la LineaGrafica.
     * 
     * @param linea Nuevo objeto Linea asociado.
     */
    public void setLinea(Linea linea) {
        this.linea = linea;
    }
}
