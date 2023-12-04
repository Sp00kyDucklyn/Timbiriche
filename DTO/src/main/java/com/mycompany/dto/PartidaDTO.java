/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para la información de una partida en el juego.
 * Contiene datos sobre los jugadores, el tablero y el número total de jugadores en la partida.
 * 
 * Esta clase es serializable para facilitar la transferencia de datos.
 * 
 * @author equipo 1
 */
public class PartidaDTO implements Serializable{
    
    /**
     * Lista de objetos JugadorDTO que contienen información de los jugadores en la partida.
     */
    private List <JugadorDTO> jugadorDTO;
    /**
     * Objeto TableroDTO que representa el tablero de juego.
     */
    private TableroDTO tableroDTO;
    /**
     * Número total de jugadores en la partida.
     */
    private int numJugadores;

    /**
     * Constructor por defecto que inicializa la lista de jugadores.
     */
    public PartidaDTO() {
        jugadorDTO = new ArrayList<>();
    }

    /**
     * Constructor que recibe la lista de jugadores, el objeto TableroDTO y el número de jugadores.
     * 
     * @param jugadorDTO    Lista de objetos JugadorDTO.
     * @param tableroDTO    Objeto TableroDTO.
     * @param numJugadores  Número total de jugadores en la partida.
     */
    public PartidaDTO(List<JugadorDTO> jugadorDTO, TableroDTO tableroDTO, int numJugadores) {
        this.jugadorDTO = jugadorDTO;
        this.tableroDTO = tableroDTO;
        this.numJugadores = numJugadores;
    }

    /**
     * Obtiene la lista de objetos JugadorDTO que contienen información de los jugadores en la partida.
     * 
     * @return La lista de objetos JugadorDTO.
     */
    public List<JugadorDTO> getJugadorDTO() {
        return jugadorDTO;
    }

    /**
     * Establece la lista de objetos JugadorDTO que contienen información de los jugadores en la partida.
     * 
     * @param jugadorDTO La nueva lista de objetos JugadorDTO.
     */
    public void setJugadorDTO(List<JugadorDTO> jugadorDTO) {
        this.jugadorDTO = jugadorDTO;
    }

    /**
     * Obtiene el objeto TableroDTO que representa el tablero de juego.
     * 
     * @return El objeto TableroDTO.
     */
    public TableroDTO getTableroDTO() {
        return tableroDTO;
    }

    /**
     * Establece el objeto TableroDTO que representa el tablero de juego.
     * 
     * @param tableroDTO El nuevo objeto TableroDTO.
     */
    public void setTableroDTO(TableroDTO tableroDTO) {
        this.tableroDTO = tableroDTO;
    }

    /**
     * Obtiene el número total de jugadores en la partida.
     * 
     * @return El número total de jugadores.
     */
    public int getNumJugadores() {
        return numJugadores;
    }

    /**
     * Establece el número total de jugadores en la partida.
     * 
     * @param numJugadores El nuevo número total de jugadores.
     */
    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

}
