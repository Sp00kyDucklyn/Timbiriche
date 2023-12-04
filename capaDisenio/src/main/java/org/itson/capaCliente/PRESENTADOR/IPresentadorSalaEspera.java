/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import java.util.List;
import org.itson.capadominio.Jugador;


/**
 * Interfaz que define métodos para la lógica de presentación relacionada con la sala de espera en una aplicación de juego.
 * Estos métodos pueden ser implementados por clases concretas que gestionan la lógica de la presentación de la sala de espera.
 * 
 * @author Equipo 1
 */
public interface IPresentadorSalaEspera {

    /**
     * Obtiene el jugador asociado al presentador de la sala de espera.
     * 
     * @return El jugador asociado al presentador de la sala de espera.
     */
    public Jugador regresarJugador();

    /**
     * Realiza acciones relacionadas con la selección de iniciar la partida en la interfaz de sala de espera.
     */
    public void seleccionIniciar();

    /**
     * Verifica la confirmación del jugador en la sala de espera.
     */
    public void verificaConfirmacionJugador();

    /**
     * Verifica si la sala de espera está llena.
     */
    public void verificaSalaLlena();

    /**
     * Abre la interfaz de sala de espera en la aplicación.
     */
    public void abrirPantalla();

    /**
     * Abre la pantalla anterior o realiza acciones necesarias para retroceder en la interfaz.
     */
    public void abrirPantallaAnterior();

    /**
     * Abre la pantalla de juego en la aplicación.
     */
    public void abrirPantallaJuego();

    /**
     * Recibe un jugador para su participación en la sala de espera.
     * 
     * @param jugador El jugador que se une a la sala de espera.
     */
    public void recibirJugador(Jugador jugador);

    /**
     * Obtiene la lista de jugadores actualmente en la sala de espera.
     * 
     * @return La lista de jugadores en la sala de espera.
     */
    public List<Jugador> regresarJugadores();
}
