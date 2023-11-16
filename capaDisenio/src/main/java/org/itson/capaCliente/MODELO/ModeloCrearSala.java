/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.MODELO;

import org.itson.capadominio.Tablero;

/**
 *
 * @author equipo 1
 */
public class ModeloCrearSala {
    
    private Tablero tablero;

    public ModeloCrearSala() {
    }
    
    public void crearTablero(int numero){
       this.tablero = new Tablero(numero);
    }
    
     public Tablero getTablero() {
        return tablero;
    }

    
    
   
}
