/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;
import java.io.Serializable;
/**
 * Enumeración que representa las posiciones posibles de una línea en el juego.
 * Puede ser utilizada para indicar si una línea se encuentra en posición vertical u horizontal.
 * 
 * Esta enumeración es serializable para facilitar la transferencia de datos.
 * 
 * @author equipo 1
 */
public enum PosicionDTO implements Serializable{
    VERTICAL, HORIZONTAL;
}
