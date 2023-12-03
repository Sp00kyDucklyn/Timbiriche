/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.VISTA.FrmMenuPrincipal;

/**
 * Clase que actúa como presentador para la pantalla principal del menú.
 * Implementa la interfaz IPresentadorMenuPrincipal. Esta clase maneja las
 * interacciones del usuario y coordina la navegación entre las distintas
 * pantallas del juego.
 *
 * @author equipo 1
 */
public class PresentadorMenuPrincipal implements IPresentadorMenuPrincipal {

    // Instancias de los presentadores asociados y la vista del menú principal
    private IPresentadorCrearSala presentadorC;
    private IPresentadorUnirseSala presentadorU;
    private FrmMenuPrincipal vistaMenu;

    /**
     * Constructor que inicializa las instancias de los presentadores y la vista
     * del menú principal.
     */
    public PresentadorMenuPrincipal() {
        this.vistaMenu = new FrmMenuPrincipal(this);
        this.presentadorC = new PresentadorCrearSala(this);
        this.presentadorU = new PresentadorUnirseSala(this);
    }

    /**
     * Activa la funcionalidad asociada al botón "Crear Sala" en la vista del
     * menú principal. Abre la pantalla de creación de sala y cierra la vista
     * del menú principal.
     */
    @Override
    public void activarBtnCrear() {
        presentadorC.abrirPantalla();
        vistaMenu.dispose();
    }

    /**
     * Abre la vista del menú principal para mostrar las opciones disponibles al
     * usuario.
     */
    @Override
    public void abrirMenuVista() {
        vistaMenu.setVisible(true);
    }

    /**
     * Activa la funcionalidad asociada al botón "Unirse a Sala" en la vista del
     * menú principal. Abre la pantalla de unirse a sala y cierra la vista del
     * menú principal.
     */
    @Override
    public void activarBtnUnirse() {
        presentadorU.abrirPantalla();
        vistaMenu.dispose();
    }

    /**
     * Cierra la vista del menú principal.
     */
    @Override
    public void salirPantalla() {
        vistaMenu.dispose();
    }
}
