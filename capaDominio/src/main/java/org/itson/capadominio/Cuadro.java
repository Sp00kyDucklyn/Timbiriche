/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capadominio;

import static org.itson.capadominio.EstadoCuadro.COMPLETO;
import static org.itson.capadominio.EstadoCuadro.INCOMPLETO;
import static org.itson.capadominio.EstadoCuadro.RECLAMADO;

/**
 *
 * @author hoshi
 */
public class Cuadro {
    
    private Linea lineaIzquierda;
    private Linea lineaDerecha;
    private Linea lineaArriba;
    private Linea lineaAbajo;
    private EstadoCuadro estado;
    
    public Cuadro(Linea lineaIzquierda, Linea lineaDerecha, Linea lineaArriba, Linea lineaAbajo) {
        this.lineaIzquierda = lineaIzquierda;
        this.lineaDerecha = lineaDerecha;
        this.lineaArriba = lineaArriba;
        this.lineaAbajo = lineaAbajo;
    }
    
    public Cuadro() {
        this.lineaIzquierda = new Linea();
        this.lineaDerecha = new Linea();
        this.lineaArriba = new Linea();
        this.lineaAbajo = new Linea();
        this.estado = INCOMPLETO;
    }

    public Linea getLineaIzquierda() {
        return lineaIzquierda;
    }

    public void setLineaIzquierda(Linea lineaIzquierda) {
        this.lineaIzquierda = lineaIzquierda;
    }

    public Linea getLineaDerecha() {
        return lineaDerecha;
    }

    public void setLineaDerecha(Linea lineaDerecha) {
        this.lineaDerecha = lineaDerecha;
    }

    public Linea getLineaArriba() {
        return lineaArriba;
    }

    public void setLineaArriba(Linea lineaArriba) {
        this.lineaArriba = lineaArriba;
    }

    public Linea getLineaAbajo() {
        return lineaAbajo;
    }

    public void setLineaAbajo(Linea lineaAbajo) {
        this.lineaAbajo = lineaAbajo;
    }
    
    public EstadoCuadro getEstado(){
        if(estado != RECLAMADO){
            if (lineaArriba.getJugador() != null && lineaAbajo.getJugador() != null
                    && lineaDerecha.getJugador() != null && lineaIzquierda.getJugador() != null) {
                return COMPLETO;
            }
            return INCOMPLETO;
        }
        
        return RECLAMADO;
    }
    
    public void setEstado(EstadoCuadro estado){
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cuadro{" + "lineaIzquierda=" + lineaIzquierda + ", lineaDerecha=" + lineaDerecha + ", lineaArriba=" + lineaArriba + ", lineaAbajo=" + lineaAbajo + '}';
    }
    
    
}
