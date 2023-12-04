/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capadominio.Tablero;
/**
 * Interfaz que define métodos para la gestión de la interfaz de usuario
 * relacionados con la creación y configuración de una partida en una aplicación de juego.
 * Estos métodos pueden ser implementados por clases concretas que gestionan la lógica de la interfaz de usuario.
 *
 * @author equipo 1
 */
public interface IPresentadorCrearSala {
    
    
    /**
     * Método llamado al seleccionar la cantidad de jugadores para la partida.
     * Implementaciones pueden realizar acciones relacionadas con la configuración de la cantidad de jugadores.
     */
    public void seleccionarCantJugadores();

    /**
     * Método llamado al intentar crear una partida con el número especificado de jugadores.
     * 
     * @param numero El número de jugadores para la partida.
     */
    public void crearPartida(int numero);

    /**
     * Método llamado al intentar crear un código para la partida.
     * Implementaciones pueden realizar acciones relacionadas con la generación de un código para la partida.
     */
    public void crearCodigo();

    /**
     * Método llamado al aparecer la siguiente pantalla de ajustes después de la creación de la partida.
     * Implementaciones pueden realizar acciones relacionadas con la navegación a la pantalla de ajustes.
     */
    public void apareceSigAjustes();

    /**
     * Método llamado al abrir la pantalla de creación de partida.
     * Implementaciones pueden realizar acciones relacionadas con la apertura de la pantalla de creación de partida.
     */
    public void abrirPantalla();

    /**
     * Método llamado al hacer clic en el botón "Regresar" para volver al menú principal.
     * Implementaciones pueden realizar acciones relacionadas con la navegación de regreso al menú principal.
     */
    public void regresarMenu();
}
