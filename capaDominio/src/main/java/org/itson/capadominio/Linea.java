/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capadominio;

/**
 *
 * @author hoshi
 */
public class Linea {
    
    private Punto puntoInicio;
    private Punto puntoFin;
    private Posicion posicion;
    private Jugador jugador;

    public Linea() {
        puntoInicio = new Punto();
        puntoFin = new Punto();
    }

    public Linea(Punto puntoInicio, Punto puntoFin, Posicion posicion) {
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
        this.posicion = posicion;
    }

    public Punto getPuntoInicio() {
        return puntoInicio;
    }

    public void setPuntoInicio(Punto puntoInicio) {
        this.puntoInicio = puntoInicio;
    }

    public Punto getPuntoFin() {
        return puntoFin;
    }

    public void setPuntoFin(Punto puntoFin) {
        this.puntoFin = puntoFin;
    }
  
    @Override
    public String toString() {
        return "Lineas{" + "puntoInicio " + puntoInicio + ", puntoFin " + puntoFin + '}';
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
}
