/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capadominio;

/**
 *
 * @author oscar
 */
public class MovimientoDTO {
    private Linea linea;
    private Jugador jugador;

    public MovimientoDTO() {
    }

    public MovimientoDTO(Linea linea, Jugador jugador) {
        this.linea = linea;
        this.jugador = jugador;
    }

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    
}
