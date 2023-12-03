/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.MODELO.ModeloCrearSala;
import org.itson.capaCliente.VISTA.FrmCrearSala;

/**
 * Clase que actúa como presentador para la pantalla de creación de sala en una aplicación de juego.
 * Implementa la interfaz IPresentadorCrearSala y gestiona la lógica de presentación asociada con la creación de una nueva sala.
 * Puede ser utilizado en conjunción con los presentadores IPresentadorMenuPrincipal e IPresentadorAjustes.
 * 
 * @author Equipo 1
 * @version 1.0
 * @since 2023-12-02
 */
public class PresentadorCrearSala implements IPresentadorCrearSala {

    private FrmCrearSala vistaCrear;
    private IPresentadorMenuPrincipal presentadorM;
    private IPresentadorAjustes presentadorA;
    private ModeloCrearSala modeloC;

    /**
     * Constructor que recibe un presentador de menú principal como parámetro.
     * Inicializa los objetos del modelo y la vista, y establece el presentador de ajustes.
     * 
     * @param presentadorM Presentador de menú principal asociado.
     */
    public PresentadorCrearSala(IPresentadorMenuPrincipal presentadorM) {
        this.presentadorM = presentadorM;
        modeloC = new ModeloCrearSala();
        presentadorA = new PresentadorAjustes(this);
        vistaCrear = new FrmCrearSala(this);
    }
    
    /**
     * Método para seleccionar la cantidad de jugadores en la sala.
     * (Actualmente sin implementación).
     */
    @Override
    public void seleccionarCantJugadores() {
        // Implementación pendiente
    }

    /**
     * Método para crear un código de sala.
     * (Actualmente sin implementación).
     */
    @Override
    public void crearCodigo() {
        // Implementación pendiente
    }

    /**
     * Método para avanzar a la pantalla de ajustes después de crear una sala.
     */
    @Override
    public void apareceSigAjustes() {
        presentadorA.abrirPantalla();
        vistaCrear.dispose();
    }

    /**
     * Método para abrir la pantalla de creación de sala.
     */
    @Override
    public void abrirPantalla() {
        vistaCrear.setVisible(true);
    }

    /**
     * Método para regresar al menú principal desde la pantalla de creación de sala.
     */
    @Override
    public void regresarMenu() {
       presentadorM.abrirMenuVista();
       vistaCrear.dispose();
    }

    /**
     * Método para crear una nueva partida con el número de jugadores especificado.
     * Avanza a la pantalla de ajustes después de crear la sala.
     * 
     * @param numero Número de jugadores en la sala.
     */
    @Override
    public void crearPartida(int numero) {
        modeloC.crearPartida(numero);
        this.apareceSigAjustes();
    }
}
