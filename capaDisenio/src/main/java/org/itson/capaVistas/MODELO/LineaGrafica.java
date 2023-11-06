/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaVistas.MODELO;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import org.itson.capadominio.Linea;
import static org.itson.capadominio.Posicion.HORIZONTAL;
import static org.itson.capadominio.Posicion.VERTICAL;
import org.itson.capadominio.Punto;

/**
 *
 * @author hoshi
 */
public class LineaGrafica implements IFiguras{
    
    private Linea linea;
    private Color color;

    public LineaGrafica(Linea linea) {
        this.linea = linea;
    }

    @Override
    public void pintar(Graphics2D g2) {
        Punto puntoInicio = linea.getPuntoInicio();
        Punto puntoFin = linea.getPuntoFin();
        g2.setColor(color);
        g2.drawLine(puntoInicio.getX(), puntoInicio.getY(), puntoFin.getX(), puntoFin.getY());
        g2.setColor(Color.BLACK);
    }

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
    }
    
    public Rectangle hitBox(){
        Punto puntoInicio = linea.getPuntoInicio();
        Punto puntoFin = linea.getPuntoFin();
        if(linea.getPosicion() == VERTICAL){
            return new Rectangle(puntoInicio.getX(), puntoInicio.getY(), 5, (puntoFin.getY()-puntoInicio.getY()));
        }
        if(linea.getPosicion() == HORIZONTAL){
            return new Rectangle(puntoInicio.getX(), puntoInicio.getY(), (puntoFin.getX()-puntoInicio.getX()), 5);
        }
        return null;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
