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
 * El enum EstadoCuadro representa los posibles estados de un cuadro en un
 * juego. Puede ser uno de los siguientes estados: INCOMPLETO, COMPLETO o
 * RECLAMADO.
 */
public enum EstadoCuadro {
    /**
     * Estado que indica que el cuadro está incompleto, es decir, no todas las
     * líneas del cuadro están marcadas o completadas.
     */
    INCOMPLETO,
    /**
     * Estado que indica que el cuadro está completo, es decir, todas las líneas
     * del cuadro están marcadas o completadas.
     */
    COMPLETO,
    /**
     * Estado que indica que el cuadro ha sido reclamado por un jugador o
     * proceso, lo que podría tener un significado específico en el contexto del
     * juego.
     */
    RECLAMADO;
}
