/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capadominio.Jugador;
import org.itson.capadominio.Partida;
import org.itson.capadominio.Tablero;

/**
 *
 * @author equipo 1
 */
public interface IPresentadorJuego {
    
    public void colocaLinea();
    
    public void verificaCuadro();
    
    public void agregaPuntaje();
    
    public void asignaTurnos();
    
    public void iniciarPartida();
    
    public void abrirPantalla();
    
    public void recibirJugador(Jugador jugador);    
    
    public Partida regresarPartida();
    
    public void recibirPartida(Partida partida);
    
    public void enviarPartida();
    
    public Tablero regresarTablero();
    
}
