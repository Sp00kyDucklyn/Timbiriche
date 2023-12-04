/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

import java.io.Serializable;

/**
 * Clase que representa un movimiento realizado por un jugador en el juego.
 * Contiene información sobre la línea dibujada y el jugador asociado al movimiento.
 * 
 * Esta clase es serializable para facilitar la transferencia de datos.
 * 
 * @author equipo 1
 */
public class MovimientoDTO implements Serializable{
    /**
     * Línea asociada al movimiento realizada por el jugador.
     */
    private LineaDTO linea;
    
    /**
     * Jugador asociado al movimiento.
     */
    private JugadorDTO jugador;

    /**
     * Constructor por defecto de la clase.
     */
    public MovimientoDTO() {
    }

    /**
     * Constructor que recibe una línea y un jugador asociados al movimiento.
     * 
     * @param linea   Línea asociada al movimiento.
     * @param jugador Jugador asociado al movimiento.
     */
    public MovimientoDTO(LineaDTO linea, JugadorDTO jugador) {
        this.linea = linea;
        this.jugador = jugador;
    }
    
    /**
     * Obtiene la línea asociada al movimiento.
     * 
     * @return La línea asociada al movimiento.
     */
    public LineaDTO getLinea() {
        return linea;
    }

    /**
     * Establece la línea asociada al movimiento.
     * 
     * @param linea La nueva línea asociada al movimiento.
     */
    public void setLinea(LineaDTO linea) {
        this.linea = linea;
    }

    /**
     * Obtiene el jugador asociado al movimiento.
     * 
     * @return El jugador asociado al movimiento.
     */
    public JugadorDTO getJugador() {
        return jugador;
    }

    /**
     * Establece el jugador asociado al movimiento.
     * 
     * @param jugador El nuevo jugador asociado al movimiento.
     */
    public void setJugador(JugadorDTO jugador) {
        this.jugador = jugador;
    }

}
