/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para un jugador en el juego.
 * Contiene información básica y relevante sobre un jugador.
 * 
 * Permite la serialización para facilitar la transferencia de datos.
 * 
 * @author equipo 1
 */
public class JugadorDTO implements Serializable{
    private String avatar;
    private String color;
    private int puntaje;
    private String nombre;
    private int codigoExclusivo;
    
    private List<LineaDTO> lineaDTO;

    /**
     * Constructor por defecto que inicializa el puntaje del jugador en 0 y crea una lista para las líneas.
     */
    public JugadorDTO() {
        puntaje = 0;
        lineaDTO = new ArrayList<>();
    }

    /**
     * Constructor que permite establecer el avatar, color, puntaje y nombre del jugador.
     * También inicializa la lista para las líneas.
     * 
     * @param avatar  Avatar del jugador.
     * @param color   Color del jugador.
     * @param puntaje Puntaje del jugador.
     * @param nombre  Nombre del jugador.
     */
    public JugadorDTO(String avatar, String color, int puntaje, String nombre) {
        this.avatar = avatar;
        this.color = color;
        this.puntaje = puntaje;
        this.nombre = nombre;
        lineaDTO = new ArrayList<>();
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
     * @param avatar El nuevo avatar del jugador.
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
     * @param color El nuevo color del jugador.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene el puntaje del jugador.
     * 
     * @return El puntaje del jugador.
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * Establece el puntaje del jugador.
     * 
     * @param puntaje El nuevo puntaje del jugador.
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
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
     * @param nombre El nuevo nombre del jugador.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la lista de objetos LineaDTO asociados al jugador.
     * 
     * @return La lista de objetos LineaDTO.
     */
    public List<LineaDTO> getLineaDTO() {
        return lineaDTO;
    }

    /**
     * Establece la lista de objetos LineaDTO asociados al jugador.
     * 
     * @param lineaDTO La nueva lista de objetos LineaDTO.
     */
    public void setLineaDTO(List<LineaDTO> lineaDTO) {
        this.lineaDTO = lineaDTO;
    }

    /**
     * Obtiene el código exclusivo del jugador.
     * 
     * @return El código exclusivo del jugador.
     */
    public int getCodigoExclusivo() {
        return codigoExclusivo;
    }

    /**
     * Establece el código exclusivo del jugador.
     * 
     * @param codigoExclusivo El nuevo código exclusivo del jugador.
     */
    public void setCodigoExclusivo(int codigoExclusivo) {
        this.codigoExclusivo = codigoExclusivo;
    }

}
