/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.MODELO;

import org.itson.capadominio.Jugador;
import org.itson.capadominio.Tablero;

/**
 *
 * @author equipo 1
 */
public class ModeloSalaEspera {
    private Jugador jugador;
    private Tablero tablero;
    
    public ModeloSalaEspera() {
    }

    public ModeloSalaEspera(Jugador jugador,Tablero tablero) {
        this.jugador = jugador;
        this.tablero = tablero;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    
    
    
}
