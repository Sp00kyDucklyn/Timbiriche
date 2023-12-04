/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

import java.io.Serializable;

/**
 * Esta clase representa un objeto SalirseDTO que contiene información sobre
 * la intención de un jugador de abandonar una partida.
 *
 * @author Equipo 1
 */
public class SalirseDTO implements Serializable{
    /**
     * Booleano que indica si el jugador está en una partida o no.
     */
    public boolean enPartida;
    
    /**
     * Objeto JugadorDTO que representa al jugador que desea salirse.
     */
    public JugadorDTO jugador;

    /**
     * Constructor de SalirseDTO que inicializa los valores enPartida y jugador.
     *
     * @param enPartida Booleano que indica si el jugador está en una partida.
     * @param jugador   Objeto JugadorDTO del jugador que desea salirse.
     */
    public SalirseDTO(boolean enPartida, JugadorDTO jugador) {
        this.enPartida = enPartida;
        this.jugador = jugador;
    }

    /**
     * Obtiene el estado enPartida del objeto SalirseDTO.
     *
     * @return Booleano que indica si el jugador está en una partida.
     */
    public boolean isEnPartida() {
        return enPartida;
    }

    /**
     * Establece el estado enPartida del objeto SalirseDTO.
     *
     * @param enPartida Nuevo estado de enPartida a establecer.
     */
    public void setEnPartida(boolean enPartida) {
        this.enPartida = enPartida;
    }

    /**
     * Obtiene el objeto JugadorDTO asociado al objeto SalirseDTO.
     *
     * @return Objeto JugadorDTO del jugador asociado.
     */
    public JugadorDTO getJugador() {
        return jugador;
    }

    /**
     * Establece el objeto JugadorDTO asociado al objeto SalirseDTO.
     *
     * @param jugador Nuevo objeto JugadorDTO a establecer.
     */
    public void setJugador(JugadorDTO jugador) {
        this.jugador = jugador;
    }
 
}
