/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capadominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoshi
 */
public class Jugador {
    
    private String avatar;
    private String color;
    private int puntaje;
    private String nombre;
    private List <Linea> lineas;
    
    public Jugador() {
        lineas = new ArrayList<>();
    }

    public Jugador(String avatar, String color, int puntaje) {
        this.avatar = avatar;
        this.color = color;
        this.puntaje = puntaje;
        lineas = new ArrayList<>();
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List <Linea> getLineas() {
        return lineas;
    }

    public void setLineas(List <Linea> lineas) {
        this.lineas = lineas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
