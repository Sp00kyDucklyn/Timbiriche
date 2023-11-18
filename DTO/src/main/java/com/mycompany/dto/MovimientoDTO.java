/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

import java.io.Serializable;

/**
 *
 * @author equipo 1
 */
public class MovimientoDTO implements Serializable{
    private LineaDTO linea;
    private JugadorDTO jugador;

    public MovimientoDTO() {
    }

    public MovimientoDTO(LineaDTO linea, JugadorDTO jugador) {
        this.linea = linea;
        this.jugador = jugador;
    }
    
    public LineaDTO getLinea() {
        return linea;
    }

    public void setLinea(LineaDTO linea) {
        this.linea = linea;
    }

    public JugadorDTO getJugador() {
        return jugador;
    }

    public void setJugador(JugadorDTO jugador) {
        this.jugador = jugador;
    }

}
