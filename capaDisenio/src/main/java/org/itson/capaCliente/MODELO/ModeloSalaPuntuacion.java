/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.MODELO;

import java.util.ArrayList;
import java.util.List;
import org.itson.capadominio.Jugador;

/**
 * La clase ModeloSalaPuntuacion representa el modelo asociado a la sala de puntuación al finalizar una partida.
 * Gestiona la información sobre los jugadores y sus puntuaciones en la sala de puntuación.
 *
 * @author equipo 1
 */
public class ModeloSalaPuntuacion {
     /** Lista de jugadores en la sala de puntuación. */
    private List<Jugador> jugadores;

    /**
     * Constructor por defecto de la clase ModeloSalaPuntuacion.
     * Inicializa la lista de jugadores en la sala de puntuación.
     */
    public ModeloSalaPuntuacion() {
        jugadores = new ArrayList<>();
    }

    /**
     * Obtiene la lista de jugadores en la sala de puntuación.
     *
     * @return La lista de jugadores en la sala de puntuación.
     */
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * Establece la lista de jugadores en la sala de puntuación.
     *
     * @param jugadores La lista de jugadores a establecer.
     */
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
