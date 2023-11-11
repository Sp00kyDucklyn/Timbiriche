/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capadominio.Jugador;

/**
 *
 * @author equipo 1
 */
public interface IPresentadorSalaEspera {
    public Jugador regresarJugador();
    
    public void seleccionIniciar();
    
    public void verificaConfirmacionJugador();
    
    public void verificaSalaLlena();
    
    public void abrirPantalla();
    
    public void abrirPantallaAnterior();
    
    public void abrirPantallaJuego();
    
    public void enviarJugador();
    
    public void recibirJugador(Jugador jugador);
    
}
