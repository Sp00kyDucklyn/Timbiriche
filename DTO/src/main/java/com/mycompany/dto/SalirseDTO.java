/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

/**
 *
 * @author oscar
 */
public class SalirseDTO {
    public boolean enPartida;
    public JugadorDTO jugador ;

    public SalirseDTO(boolean enPartida, JugadorDTO jugador) {
        this.enPartida = enPartida;
        this.jugador = jugador;
    }
    
    public boolean isEnPartida() {
        return enPartida;
    }

    public void setEnPartida(boolean enPartida) {
        this.enPartida = enPartida;
    }

    public JugadorDTO getJugador() {
        return jugador;
    }

    public void setJugador(JugadorDTO jugador) {
        this.jugador = jugador;
    }
    
    
}
