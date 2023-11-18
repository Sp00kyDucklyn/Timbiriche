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
 * @author equipo 1
 */
public class JugadorDTO implements Serializable{
    private String avatar;
    private String color;
    private int puntaje;
    private String nombre;
    
    private List<LineaDTO> lineaDTO;

    public JugadorDTO() {
        puntaje = 0;
        lineaDTO = new ArrayList<>();
    }

    public JugadorDTO(String avatar, String color, int puntaje, String nombre) {
        this.avatar = avatar;
        this.color = color;
        this.puntaje = puntaje;
        this.nombre = nombre;
        lineaDTO = new ArrayList<>();
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

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<LineaDTO> getLineaDTO() {
        return lineaDTO;
    }

    public void setLineaDTO(List<LineaDTO> lineaDTO) {
        this.lineaDTO = lineaDTO;
    }

}
