/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una colección de objetos JugadorDTO.
 * Permite gestionar una lista de jugadores en el contexto del juego.
 * 
 * Esta clase es serializable para facilitar la transferencia de datos.
 * 
 * @author Equipo 1
 */
public class JugadoresDTO implements Serializable{
    private List<JugadorDTO> jugadorDTO;

    /**
     * Constructor por defecto que inicializa la lista de jugadores.
     */
    public JugadoresDTO() {
        this.jugadorDTO = new ArrayList<>();
    }

    /**
     * Obtiene la lista de jugadores.
     * 
     * @return La lista de jugadores.
     */
    public List<JugadorDTO> getJugadorDTO() {
        return jugadorDTO;
    }

    /**
     * Establece la lista de jugadores.
     * 
     * @param jugadorDTO La nueva lista de jugadores a establecer.
     */
    public void setJugadorDTO(List<JugadorDTO> jugadorDTO) {
        this.jugadorDTO = jugadorDTO;
    }
    
    /**
     * Añade un jugador a la lista de jugadores.
     * 
     * @param jugadorDTO El jugador a añadir a la lista.
     */
    public void añadirJugador(JugadorDTO jugadorDTO){
        this.jugadorDTO.add(jugadorDTO);
    }
}
