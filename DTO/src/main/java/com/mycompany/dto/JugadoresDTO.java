/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo 1
 */
public class JugadoresDTO implements Serializable{
    private List<JugadorDTO> jugadorDTO;

    public JugadoresDTO() {
        this.jugadorDTO = new ArrayList<>();
    }

    public List<JugadorDTO> getJugadorDTO() {
        return jugadorDTO;
    }

    public void setJugadorDTO(List<JugadorDTO> jugadorDTO) {
        this.jugadorDTO = jugadorDTO;
    }
    
    public void añadirJugador(JugadorDTO jugadorDTO){
        this.jugadorDTO.add(jugadorDTO);
    }
}
