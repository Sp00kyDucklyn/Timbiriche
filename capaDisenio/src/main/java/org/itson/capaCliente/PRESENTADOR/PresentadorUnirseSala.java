/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import SocketsCliente.Cliente;
import org.itson.capaCliente.VISTA.FrmUnirseSala;

/**
 * Clase que actúa como presentador para la pantalla de Unirse a Sala.
 * Implementa la interfaz IPresentadorUnirseSala y coordina las interacciones del usuario
 * en la pantalla de unirse a una sala existente.
 * 
 * @author equipo 1
 */
public class PresentadorUnirseSala implements IPresentadorUnirseSala{
    
    // Instancias de la vista y otros presentadores asociados
    FrmUnirseSala unirse;
    IPresentadorMenuPrincipal presentadorM;
    IPresentadorAjustes presentadorA;

    /**
     * Constructor que inicializa las instancias de la vista, el presentador del menú principal
     * y el presentador de ajustes.
     * @param presentadorM El presentador asociado al menú principal.
     */
    public PresentadorUnirseSala(IPresentadorMenuPrincipal presentadorM) {
        unirse = new FrmUnirseSala(this);
        this.presentadorM = presentadorM;
        presentadorA = new PresentadorAjustes(null);
    }
    
    /**
     * Método que se ejecuta al intentar ingresar un código para unirse a una sala.
     * (Actualmente no está implementado).
     */
    @Override
    public void ingresarCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Método que se ejecuta al seleccionar continuar hacia la pantalla de ajustes.
     * Abre la pantalla de ajustes y cierra la pantalla de unirse a sala.
     */
    @Override
    public void seleccionSigAjustes() {
        Cliente cliente = Cliente.getInstance();
        if (cliente != null) {
            presentadorA.abrirPantalla();
            unirse.dispose();
        } else {
            System.out.println("No estés chingando, ya se llenó la sala");
        }
    }

    /**
     * Abre la pantalla de unirse a sala.
     */
    @Override
    public void abrirPantalla() {
       unirse.setVisible(true);
    }

    /**
     * Método que se ejecuta al intentar regresar al menú principal desde la pantalla de unirse a sala.
     * (Actualmente no está implementado).
     */
    @Override
    public void regresarMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

