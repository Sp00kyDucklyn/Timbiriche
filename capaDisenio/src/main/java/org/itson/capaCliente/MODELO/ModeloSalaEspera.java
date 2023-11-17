/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.MODELO;

import org.itson.capadominio.Jugador;
import org.itson.capadominio.Partida;

/**
 *
 * @author equipo 1
 */
public class ModeloSalaEspera {
    private Jugador jugador;
    private Partida partida;
    
    public ModeloSalaEspera() {
    }

    public ModeloSalaEspera(Jugador jugador,Partida partida) {
        this.jugador = jugador;
        this.partida = partida;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    
    
    
}
