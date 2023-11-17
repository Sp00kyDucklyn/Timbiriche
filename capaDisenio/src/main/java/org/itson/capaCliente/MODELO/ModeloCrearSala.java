/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.MODELO;

import org.itson.capadominio.Partida;


/**
 *
 * @author equipo 1
 */
public class ModeloCrearSala {
    
    private Partida partida;

    public ModeloCrearSala() {
    }
    
    public void crearPartida(int numero){
       this.partida = new Partida(numero);
    }
    
     public Partida getPartida() {
        return partida;
    }

    
    
   
}
