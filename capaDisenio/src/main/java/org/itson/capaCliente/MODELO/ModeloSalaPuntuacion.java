/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.MODELO;

import java.util.ArrayList;
import java.util.List;
import org.itson.capadominio.Jugador;

/**
 *
 * @author equipo 1
 */
public class ModeloSalaPuntuacion {
    
//    private Jugador jugador;
    private List <Jugador> jugadores;
    
    public ModeloSalaPuntuacion() {
        jugadores = new ArrayList<>();
    }

    public List <Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List <Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
