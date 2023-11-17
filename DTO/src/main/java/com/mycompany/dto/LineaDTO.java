/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

/**
 *
 * @author equipo 1
 */
public class LineaDTO {
   
    private PuntoDTO puntoInicio;
    private PuntoDTO puntoFin;

    // Posición de la línea (posiblemente indicando la orientación o ubicación de la línea)
    private PosicionDTO posicion;

    // Jugador asociado con la línea
    private JugadorDTO jugador;

    public LineaDTO() {
    }

    public LineaDTO(PuntoDTO puntoInicio, PuntoDTO puntoFin, PosicionDTO posicion) {
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
        this.posicion = posicion;
    }

    public PuntoDTO getPuntoInicio() {
        return puntoInicio;
    }

    public void setPuntoInicio(PuntoDTO puntoInicio) {
        this.puntoInicio = puntoInicio;
    }

    public PuntoDTO getPuntoFin() {
        return puntoFin;
    }

    public void setPuntoFin(PuntoDTO puntoFin) {
        this.puntoFin = puntoFin;
    }

    public PosicionDTO getPosicion() {
        return posicion;
    }

    public void setPosicion(PosicionDTO posicion) {
        this.posicion = posicion;
    }

    public JugadorDTO getJugador() {
        return jugador;
    }

    public void setJugador(JugadorDTO jugador) {
        this.jugador = jugador;
    }

}
