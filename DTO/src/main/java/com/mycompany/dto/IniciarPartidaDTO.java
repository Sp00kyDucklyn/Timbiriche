/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.dto;

import java.io.Serializable;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para iniciar una partida.
 * Contiene información sobre el número de inicio de la partida.
 * 
 * @author equipo 1
 */
public class IniciarPartidaDTO implements Serializable{

    /**
     * Número asociado al inicio de la partida.
     */
    private int numero;
    
    /**
     * Constructor que inicializa un objeto IniciarPartidaDTO con un número específico.
     * 
     * @param numero Número asociado al inicio de la partida.
     */
    public IniciarPartidaDTO(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene el número asociado al inicio de la partida.
     * 
     * @return Número asociado al inicio de la partida.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establece el número asociado al inicio de la partida.
     * 
     * @param numero Número a establecer para el inicio de la partida.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
   
}
