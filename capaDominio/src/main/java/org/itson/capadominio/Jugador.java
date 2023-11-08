/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capadominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author equipo 1
 */
/**
 * La clase Jugador representa a un jugador en un juego y almacena información
 * relacionada con el jugador, como su avatar, color, puntaje, nombre y las
 * líneas asociadas con el jugador.
 */
public class Jugador {

    // Información del jugador
    private String avatar;
    private String color;
    private int puntaje;
    private String nombre;

    // Líneas asociadas con el jugador
    private List<Linea> lineas;

    /**
     * Constructor de la clase Jugador. Inicializa el puntaje y crea una lista
     * vacía de líneas para el jugador.
     */
    public Jugador() {
        puntaje = 0;
        lineas = new ArrayList<>();
    }

    /**
     * Constructor de la clase Jugador con parámetros. Inicializa el avatar,
     * color, puntaje y crea una lista vacía de líneas para el jugador.
     *
     * @param avatar El avatar del jugador.
     * @param color El color del jugador.
     * @param puntaje El puntaje inicial del jugador.
     */
    public Jugador(String avatar, String color, int puntaje) {
        this.avatar = avatar;
        this.color = color;
        this.puntaje = puntaje;
        lineas = new ArrayList<>();
    }

    /**
     * Obtiene el puntaje actual del jugador.
     *
     * @return El puntaje del jugador.
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * Establece el puntaje del jugador.
     *
     * @param puntaje El puntaje que se va a establecer.
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * Obtiene el avatar del jugador.
     *
     * @return El avatar del jugador.
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Establece el avatar del jugador.
     *
     * @param avatar El avatar que se va a establecer.
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * Obtiene el color del jugador.
     *
     * @return El color del jugador.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del jugador.
     *
     * @param color El color que se va a establecer.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene la lista de líneas asociadas con el jugador.
     *
     * @return La lista de líneas del jugador.
     */
    public List<Linea> getLineas() {
        return lineas;
    }

    /**
     * Establece la lista de líneas asociadas con el jugador.
     *
     * @param lineas La lista de líneas que se va a establecer.
     */
    public void setLineas(List<Linea> lineas) {
        this.lineas = lineas;
    }

    /**
     * Obtiene el nombre del jugador.
     *
     * @return El nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del jugador.
     *
     * @param nombre El nombre que se va a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
