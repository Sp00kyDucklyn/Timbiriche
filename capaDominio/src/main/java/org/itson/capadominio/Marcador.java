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
 * La clase Marcador se utiliza para realizar
 * un seguimiento de la información de un jugador
 * en un juego o aplicación, incluyendo el jugador asociado.
 */
public class Marcador {
    // Jugador asociado con el marcador
    private Jugador jugador;

    /**
     * Constructor de la clase Marcador con un jugador proporcionado. Inicializa el marcador con el jugador especificado.
     *
     * @param jugador El jugador asociado con el marcador.
     */
    public Marcador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * Constructor de la clase Marcador sin un jugador proporcionado. Crea un nuevo jugador y lo asocia con el marcador.
     */
    public Marcador() {
        jugador = new Jugador();
    }

    /**
     * Obtiene el jugador asociado con el marcador.
     *
     * @return El jugador asociado con el marcador.
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Establece el jugador asociado con el marcador.
     *
     * @param jugador El jugador que se va a asociar con el marcador.
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    
}
