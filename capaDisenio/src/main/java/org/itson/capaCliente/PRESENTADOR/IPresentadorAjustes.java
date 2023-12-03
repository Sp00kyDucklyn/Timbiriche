/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;



/**
 * Interfaz que define métodos para la navegación y la manipulación de la interfaz de usuario
 * relacionados con la sala de espera en una aplicación de juego.
 * Estos métodos pueden ser implementados por clases concretas que gestionan la lógica de la interfaz de usuario.
/**
 *
 * @author equipo 1
 */
public interface IPresentadorAjustes {
    
     /**
     * Método llamado al seleccionar la siguiente sala de espera.
     * Implementaciones pueden realizar acciones relacionadas con la navegación entre salas de espera.
     */
    public void seleccionSigSalaEspera();

    /**
     * Método llamado al hacer clic en el botón "Regresar" en la pantalla de creación de sala.
     * Implementaciones pueden realizar acciones relacionadas con la navegación de regreso desde la creación de sala.
     */
    public void btnRegresarCrearSala();

    /**
     * Método llamado al hacer clic en el botón "Regresar" en la pantalla de unirse a sala.
     * Implementaciones pueden realizar acciones relacionadas con la navegación de regreso desde la unión a sala.
     */
    public void btnRegresarUnirseSala();

    /**
     * Método llamado al abrir la pantalla de sala de espera.
     * Implementaciones pueden realizar acciones relacionadas con la apertura de la pantalla de sala de espera.
     */
    public void abrirPantalla();

    /**
     * Método llamado al intentar crear un jugador con la información proporcionada.
     * 
     * @param color El color del jugador.
     * @param nombre El nombre del jugador.
     * @param avatar El avatar del jugador.
     */
    public void crearJugador(String color, String nombre, String avatar);
   
    
}
