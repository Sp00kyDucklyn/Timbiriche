/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import java.util.List;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Linea;
import org.itson.capadominio.Partida;
import org.itson.capadominio.Tablero;

 /**
 * Interfaz que define métodos para la lógica de presentación relacionada con el juego en una aplicación de juego.
 * Estos métodos pueden ser implementados por clases concretas que gestionan la lógica de la presentación del juego.
 *
 * @author equipo 1
 */
public interface IPresentadorJuego {
    
  /**
     * Coloca una línea en el tablero del juego en nombre del jugador especificado.
     * 
     * @param linea La línea a colocar en el tablero.
     * @param jugador El jugador que coloca la línea.
     */
    public void colocaLinea(Linea linea, Jugador jugador);

    /**
     * Abre la pantalla asociada al juego.
     * Implementaciones pueden realizar acciones relacionadas con la apertura de la pantalla de juego.
     */
    public void abrirPantalla();

    /**
     * Recibe un jugador para su participación en el juego.
     * 
     * @param jugador El jugador que se une al juego.
     */
    public void recibirJugador(Jugador jugador);

    /**
     * Obtiene la partida asociada al juego.
     * 
     * @return La partida asociada al juego.
     */
    public Partida regresarPartida();

    /**
     * Obtiene el tablero asociado al juego.
     * 
     * @return El tablero asociado al juego.
     */
    public Tablero regresarTablero();

    /**
     * Crea una nueva partida con el número especificado de jugadores.
     * 
     * @param numero El número de jugadores para la nueva partida.
     */
    public void crearPartida(int numero);

    /**
     * Establece la lista de jugadores para la partida.
     * 
     * @param jugadores La lista de jugadores para la partida.
     */
    public void setListaJugadores(List<Jugador> jugadores);

    /**
     * Obtiene la lista de jugadores asociada al juego.
     * 
     * @return La lista de jugadores asociada al juego.
     */
    public List<Jugador> getListaJugadores();

    /**
     * Pasa al siguiente turno en el juego.
     */
    public void pasarTurno();

    /**
     * Muestra la información de los jugadores en la interfaz de usuario.
     */
    public void mostrarJugadores();

    /**
     * Obtiene el jugador cuyo turno es actual.
     * 
     * @return El jugador cuyo turno es actual.
     */
    public Jugador getJugadorTurno();

    /**
     * Verifica si es el turno del jugador actual.
     * 
     * @return true si es el turno del jugador actual, false en caso contrario.
     */
    public boolean esTurno();

    /**
     * Finaliza la partida actual.
     */
    public void terminarPartida();
}
