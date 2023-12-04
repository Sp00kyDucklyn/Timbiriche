/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;
import java.io.Serializable;
/**
 * Enumeración que representa el estado de un cuadro en el juego, utilizado en el intercambio de datos.
 * Los estados posibles son: INCOMPLETO, COMPLETO, RECLAMADO.
 * Serializable para permitir su transmisión a través de la red.
 *
 * @author equipo 1
 */
public enum EstadoCuadroDTO implements Serializable{
    INCOMPLETO, COMPLETO, RECLAMADO;
}
