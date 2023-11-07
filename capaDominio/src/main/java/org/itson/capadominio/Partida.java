/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capadominio;

/**
 *
 * @author equipo 1
 */
public class Partida {
    
    private Tablero tablero;
    private Marcador marcador;
    private int numJugadores;

    public Partida() {
        tablero = new Tablero();
        marcador = new Marcador();
    }

    public Partida(Tablero tablero, Marcador marcador, int numJugadores) {
        this.tablero = tablero;
        this.marcador = marcador;
        this.numJugadores = numJugadores;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Marcador getMarcador() {
        return marcador;
    }

    public void setMarcador(Marcador marcador) {
        this.marcador = marcador;
    }
    
    
    
}
