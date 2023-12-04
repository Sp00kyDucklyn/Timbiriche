/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import java.util.List;
import org.itson.capadominio.Jugador;

/**
 * Interfaz que define métodos para la lógica de presentación relacionada con la sala de puntuación en una aplicación de juego.
 * Estos métodos pueden ser implementados por clases concretas que gestionan la lógica de la presentación de la sala de puntuación.
 * 
 * @author Equipo 1
 */
public interface IPresentadorSalaPuntaje {

    /**
     * Realiza acciones relacionadas con la terminación de la partida en la sala de puntuación.
     */
    public void terminarPartida();

    /**
     * Abre la interfaz de sala de puntuación en la aplicación.
     */
    public void abrirPantalla();

    /**
     * Obtiene la lista de jugadores actualmente en la sala de puntuación.
     * 
     * @return La lista de jugadores en la sala de puntuación.
     */
    public List<Jugador> regresarJugadores();

    /**
     * Establece la lista de jugadores para la sala de puntuación.
     * 
     * @param jugadores La lista de jugadores para la sala de puntuación.
     */
    public void setListaJugadores(List<Jugador> jugadores);
}

