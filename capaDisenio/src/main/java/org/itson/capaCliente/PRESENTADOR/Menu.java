/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

/**
 * Clase principal que inicia la aplicación del menú. Crea una instancia del
 * presentador del menú principal y abre la vista del menú.
 *
 * @author Equipo 1
 * @version 1.0
 * @since 2023-12-02
 */
public class Menu {

    /**
     * Punto de entrada principal para la aplicación del menú. Crea un objeto
     * PresentadorMenuPrincipal y abre la vista del menú.
     *
     * @param args Argumentos de línea de comandos (no utilizado en este caso).
     */
    public static void main(String[] args) {
        IPresentadorMenuPrincipal menu = new PresentadorMenuPrincipal();
        menu.abrirMenuVista();
    }

}
