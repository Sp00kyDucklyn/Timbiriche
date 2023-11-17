/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capadominio;

import java.util.ArrayList;
import java.util.List;

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

    private List <Jugador> listaJugador;
    
    private int numJugadores;


    /**
     * Constructor de la clase Partida. Inicializa el tablero y el marcador con instancias por defecto.
     */
    public Partida() {    
        this.tablero = new Tablero();
        this.listaJugador = new ArrayList<>();
    }

    /**
     * Constructor de la clase Partida con parámetros. Inicializa la partida con un tablero, un marcador y el número de jugadores especificado.
     *
     * @param tablero El tablero asociado con la partida.
     * @param listaJugador El marcador asociado con el jugador.
     */
    public Partida(Tablero tablero, List<Jugador> listaJugador) {    
        this.tablero = tablero;
        this.listaJugador = listaJugador;
    }
    
    public Partida(int numero) {    
        this.tablero = new Tablero(numero);
        this.numJugadores = numero;
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

    public List <Jugador> getListaJugador() {
        return listaJugador;
    }

    public void setListaJugador(List <Jugador> listaJugador) {
        this.listaJugador = listaJugador;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }
    
    public void agregarJugador(Jugador jugador){
        listaJugador.add(jugador);
    }
}
