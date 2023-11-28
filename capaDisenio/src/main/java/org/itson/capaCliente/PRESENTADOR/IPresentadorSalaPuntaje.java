/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import java.util.List;
import org.itson.capadominio.Jugador;

/**
 *
 * @author equipo 1
 */
public interface IPresentadorSalaPuntaje {
    
    public void terminarPartida();
    
    public void abrirPantalla();
    
    public List<Jugador> regresarJugadores();
    
    public void setListaJugadores(List<Jugador> jugadores);
}
