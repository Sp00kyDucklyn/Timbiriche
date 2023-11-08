/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capadominio;

/**
 *
 * @author equipo 1
 */
/**
 * La clase Partida se utiliza para representar y 
 * gestionar una partida en un juego o aplicación, 
 * incluyendo un tablero, un marcador y el número de jugadores en la partida.
 */
public class Partida {
    
    // Tablero asociado con la partida
    private Tablero tablero;

    // Marcador asociado con la partida
    private Marcador marcador;

    // Número de jugadores en la partida
    private int numJugadores;

    /**
     * Constructor de la clase Partida. Inicializa el tablero y el marcador con instancias por defecto.
     */
    public Partida() {
        tablero = new Tablero();
        marcador = new Marcador();
    }

    /**
     * Constructor de la clase Partida con parámetros. Inicializa la partida con un tablero, un marcador y el número de jugadores especificado.
     *
     * @param tablero El tablero asociado con la partida.
     * @param marcador El marcador asociado con la partida.
     * @param numJugadores El número de jugadores en la partida.
     */
    public Partida(Tablero tablero, Marcador marcador, int numJugadores) {
        this.tablero = tablero;
        this.marcador = marcador;
        this.numJugadores = numJugadores;
    }

    /**
     * Obtiene el número de jugadores en la partida.
     *
     * @return El número de jugadores en la partida.
     */
    public int getNumJugadores() {
        return numJugadores;
    }

    /**
     * Establece el número de jugadores en la partida.
     *
     * @param numJugadores El número de jugadores que se va a establecer.
     */
    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    /**
     * Obtiene el tablero asociado con la partida.
     *
     * @return El tablero asociado con la partida.
     */
    public Tablero getTablero() {
        return tablero;
    }

    /**
     * Establece el tablero asociado con la partida.
     *
     * @param tablero El tablero que se va a establecer.
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    /**
     * Obtiene el marcador asociado con la partida.
     *
     * @return El marcador asociado con la partida.
     */
    public Marcador getMarcador() {
        return marcador;
    }

    /**
     * Establece el marcador asociado con la partida.
     *
     * @param marcador El marcador que se va a establecer.
     */
    public void setMarcador(Marcador marcador) {
        this.marcador = marcador;
    }
    
    
}
