/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author equipo 1
 */
public class PartidaDTO {
    
    private List <JugadorDTO> jugadorDTO;
    private TableroDTO tableroDTO;
    private int numJugadores;

    public PartidaDTO() {
        jugadorDTO = new ArrayList<>();
    }

    public PartidaDTO(List<JugadorDTO> jugadorDTO, TableroDTO tableroDTO, int numJugadores) {
        this.jugadorDTO = jugadorDTO;
        this.tableroDTO = tableroDTO;
        this.numJugadores = numJugadores;
    }

    public List <JugadorDTO> getJugadorDTO() {
        return jugadorDTO;
    }

    public void setJugadorDTO(List <JugadorDTO> jugadorDTO) {
        this.jugadorDTO = jugadorDTO;
    }

    public TableroDTO getTableroDTO() {
        return tableroDTO;
    }

    public void setTableroDTO(TableroDTO tableroDTO) {
        this.tableroDTO = tableroDTO;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }
    
    
    
}
