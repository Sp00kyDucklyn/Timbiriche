/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.dto;

import java.io.Serializable;

/**
 *
 * @author hoshi
 */
public class IniciarPartidaDTO implements Serializable{

    private int numero;
    
    
    
    public IniciarPartidaDTO(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    
}
