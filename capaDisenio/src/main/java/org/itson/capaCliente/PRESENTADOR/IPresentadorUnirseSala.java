/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

/**
 * Interfaz que define métodos para la lógica de presentación relacionada con la funcionalidad de unirse a una sala en una aplicación de juego.
 * Estos métodos pueden ser implementados por clases concretas que gestionan la lógica de la presentación para unirse a una sala.
 * 
 * @author Equipo 1
 */
public interface IPresentadorUnirseSala {

    /**
     * Realiza acciones relacionadas con el ingreso de un código para unirse a una sala.
     */
    public void ingresarCodigo();

    /**
     * Realiza acciones relacionadas con la selección para avanzar a la pantalla de ajustes.
     */
    public void seleccionSigAjustes();

    /**
     * Abre la interfaz de unirse a sala en la aplicación.
     */
    public void abrirPantalla();

    /**
     * Regresa al menú principal o realiza acciones necesarias para retroceder en la interfaz.
     */
    public void regresarMenu();
}
