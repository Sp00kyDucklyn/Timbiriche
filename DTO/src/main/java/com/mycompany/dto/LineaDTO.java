/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;
import java.io.Serializable;
/**
 * Clase que representa una línea en el juego, utilizada para transferir información sobre las líneas
 * dibujadas en el tablero entre el cliente y el servidor.
 * 
 * Esta clase es serializable para facilitar la transferencia de datos.
 * 
 * @author equipo 1
 */
public class LineaDTO implements Serializable{
   
    /**
     * Punto de inicio de la línea.
     */
    private PuntoDTO puntoInicio;
    /**
     * Punto final de la línea.
     */
    private PuntoDTO puntoFin;

    /**
     * Posición de la línea (vertical u horizontal).
     */
    private PosicionDTO posicion;

    /**
     * Jugador asociado con la línea.
     */
    private JugadorDTO jugador;

    /**
     * Constructor por defecto de la clase.
     */
    public LineaDTO() {
    }

    /**
     * Constructor que recibe puntos de inicio y fin, así como la posición de la línea.
     * 
     * @param puntoInicio Punto de inicio de la línea.
     * @param puntoFin    Punto final de la línea.
     * @param posicion    Posición de la línea.
     */
    public LineaDTO(PuntoDTO puntoInicio, PuntoDTO puntoFin, PosicionDTO posicion) {
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
        this.posicion = posicion;
    }

    /**
     * Obtiene el punto de inicio de la línea.
     * 
     * @return El punto de inicio de la línea.
     */
    public PuntoDTO getPuntoInicio() {
        return puntoInicio;
    }

    /**
     * Establece el punto de inicio de la línea.
     * 
     * @param puntoInicio El nuevo punto de inicio de la línea.
     */
    public void setPuntoInicio(PuntoDTO puntoInicio) {
        this.puntoInicio = puntoInicio;
    }

    /**
     * Obtiene el punto final de la línea.
     * 
     * @return El punto final de la línea.
     */
    public PuntoDTO getPuntoFin() {
        return puntoFin;
    }

    /**
     * Establece el punto final de la línea.
     * 
     * @param puntoFin El nuevo punto final de la línea.
     */
    public void setPuntoFin(PuntoDTO puntoFin) {
        this.puntoFin = puntoFin;
    }

    /**
     * Obtiene la posición de la línea (vertical u horizontal).
     * 
     * @return La posición de la línea.
     */
    public PosicionDTO getPosicion() {
        return posicion;
    }

    /**
     * Establece la posición de la línea (vertical u horizontal).
     * 
     * @param posicion La nueva posición de la línea.
     */
    public void setPosicion(PosicionDTO posicion) {
        this.posicion = posicion;
    }

    /**
     * Obtiene el jugador asociado con la línea.
     * 
     * @return El jugador asociado con la línea.
     */
    public JugadorDTO getJugador() {
        return jugador;
    }

    /**
     * Establece el jugador asociado con la línea.
     * 
     * @param jugador El nuevo jugador asociado con la línea.
     */
    public void setJugador(JugadorDTO jugador) {
        this.jugador = jugador;
    }

}
