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

/**
 *
 * @author equipo 1
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
        if (linea.getPosicion()==Posicion.VERTICAL) {
            g2.drawLine((puntoInicio.getX()-1), puntoInicio.getY() , (puntoFin.getX()-1),puntoFin.getY());    
            g2.drawLine(puntoInicio.getX(), puntoInicio.getY() , puntoFin.getX(), puntoFin.getY());    
            g2.drawLine((puntoInicio.getX()+1), puntoInicio.getY() , (puntoFin.getX()+1),puntoFin.getY());    
        }else{
            g2.drawLine(puntoInicio.getX(), (puntoInicio.getY()-1) , puntoFin.getX(),(puntoFin.getY()-1));    
            g2.drawLine(puntoInicio.getX(), puntoInicio.getY() , puntoFin.getX(), puntoFin.getY());    
            g2.drawLine(puntoInicio.getX(), (puntoInicio.getY()+1) , puntoFin.getX(),(puntoFin.getY()+1)); 
        }
        
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
            return new Rectangle((puntoInicio.getX()-3), puntoInicio.getY(), 7, (puntoFin.getY()-puntoInicio.getY()));
        }
        if(linea.getPosicion() == HORIZONTAL){
            return new Rectangle(puntoInicio.getX(), (puntoInicio.getY()-3), (puntoFin.getX()-puntoInicio.getX()), 7);
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
