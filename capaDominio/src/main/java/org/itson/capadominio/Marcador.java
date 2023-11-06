/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capadominio;

/**
 *
 * @author hoshi
 */
public class Marcador {
    private Jugador jugador;

    public Marcador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Marcador() {
        jugador = new Jugador();
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    
}
