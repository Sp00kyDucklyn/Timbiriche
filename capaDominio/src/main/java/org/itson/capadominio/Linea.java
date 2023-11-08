/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capadominio;

/**
 *
 * @author equipo 1
 */
/**
 * La clase Linea representa una línea en algún contexto de un juego o
 * aplicación.
 */
public class Linea {
    // Puntos de inicio y fin de la línea

    private Punto puntoInicio;
    private Punto puntoFin;

    // Posición de la línea (posiblemente indicando la orientación o ubicación de la línea)
    private Posicion posicion;

    // Jugador asociado con la línea
    private Jugador jugador;

    /**
     * Constructor de la clase Linea. Inicializa los puntos de inicio y fin de
     * la línea con objetos Punto por defecto.
     */
    public Linea() {
        puntoInicio = new Punto();
        puntoFin = new Punto();
    }

    /**
     * Constructor de la clase Linea con parámetros. Inicializa los puntos de
     * inicio y fin de la línea y la posición.
     *
     * @param puntoInicio El punto de inicio de la línea.
     * @param puntoFin El punto de fin de la línea.
     * @param posicion La posición de la línea.
     */
    public Linea(Punto puntoInicio, Punto puntoFin, Posicion posicion) {
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
        this.posicion = posicion;
    }

    /**
     * Obtiene el punto de inicio de la línea.
     *
     * @return El punto de inicio de la línea.
     */
    public Punto getPuntoInicio() {
        return puntoInicio;
    }

    /**
     * Establece el punto de inicio de la línea.
     *
     * @param puntoInicio El punto de inicio que se va a establecer.
     */
    public void setPuntoInicio(Punto puntoInicio) {
        this.puntoInicio = puntoInicio;
    }

    /**
     * Obtiene el punto de fin de la línea.
     *
     * @return El punto de fin de la línea.
     */
    public Punto getPuntoFin() {
        return puntoFin;
    }

    /**
     * Establece el punto de fin de la línea.
     *
     * @param puntoFin El punto de fin que se va a establecer.
     */
    public void setPuntoFin(Punto puntoFin) {
        this.puntoFin = puntoFin;
    }

    /**
     * Obtiene la posición de la línea (posiblemente indicando la orientación o
     * ubicación de la línea).
     *
     * @return La posición de la línea.
     */
    public Posicion getPosicion() {
        return posicion;
    }

    /**
     * Establece la posición de la línea.
     *
     * @param posicion La posición que se va a establecer.
     */
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    /**
     * Obtiene el jugador asociado con la línea.
     *
     * @return El jugador asociado con la línea.
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Establece el jugador asociado con la línea.
     *
     * @param jugador El jugador que se va a establecer.
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * Devuelve una representación en cadena de la línea, que incluye
     * información sobre los puntos de inicio y fin de la línea.
     *
     * @return Una cadena que representa la línea.
     */
    @Override
    public String toString() {
        return "Linea{" + "puntoInicio=" + puntoInicio + ", puntoFin=" + puntoFin + '}';
    }

}
