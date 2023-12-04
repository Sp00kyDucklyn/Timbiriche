/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.VISTA.FrmMenuPrincipal;

/**
 * Interfaz que define métodos para la lógica de presentación relacionada con el
 * menú principal en una aplicación de juego. Estos métodos pueden ser
 * implementados por clases concretas que gestionan la lógica de la presentación
 * del menú principal.
 *
 * @author Equipo 1
 */
public interface IPresentadorMenuPrincipal {

    /**
     * Activa el botón de crear partida en la interfaz de usuario.
     * Implementaciones pueden realizar acciones relacionadas con la activación
     * del botón de crear partida.
     */
    public void activarBtnCrear();

    /**
     * Activa el botón de unirse a partida en la interfaz de usuario.
     * Implementaciones pueden realizar acciones relacionadas con la activación
     * del botón de unirse a partida.
     */
    public void activarBtnUnirse();

    /**
     * Abre la interfaz de usuario asociada al menú principal. Implementaciones
     * pueden realizar acciones relacionadas con la apertura del menú principal.
     */
    public void abrirMenuVista();

    /**
     * Cierra la pantalla actual o realiza acciones necesarias para salir de la
     * aplicación.
     */
    public void salirPantalla();

}
