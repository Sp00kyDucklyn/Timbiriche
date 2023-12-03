/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import SocketsCliente.Cliente;
import observer.Observer;
import org.itson.capaCliente.MODELO.ModeloAjustes;
import org.itson.capaCliente.VISTA.FrmAjustes;
import org.itson.capadominio.Partida;
import org.itson.capadominio.Tablero;

/**
 * Clase que actúa como presentador para la pantalla de ajustes en una
 * aplicación de juego. Implementa la interfaz IPresentadorAjustes y gestiona la
 * lógica de presentación asociada con la configuración de ajustes. Puede ser
 * utilizado en conjunción con los presentadores IPresentadorCrearSala e
 * IPresentadorUnirseSala.
 *
 * @author Equipo 1
 * @version 1.0
 * @since 2023-12-02
 */
public class PresentadorAjustes implements IPresentadorAjustes {

    private IPresentadorCrearSala presentadorC;
    private IPresentadorUnirseSala presentadorU;
    private IPresentadorSalaEspera presentadorS;
    private FrmAjustes vistaAjustes;
    private ModeloAjustes modeloA;

    /**
     * Constructor que recibe un presentador de crear sala como parámetro.
     * Inicializa los objetos del modelo y la vista, y establece el presentador
     * de sala de espera.
     *
     * @param presentadorC Presentador de crear sala asociado.
     */
    public PresentadorAjustes(IPresentadorCrearSala presentadorC) {
        modeloA = new ModeloAjustes();
        vistaAjustes = new FrmAjustes(this);
        this.presentadorC = presentadorC;
        presentadorS = new PresentadorSalaEspera(this);
    }

    /**
     * Método para avanzar a la pantalla de sala de espera después de
     * seleccionar ajustes.
     */
    @Override
    public void seleccionSigSalaEspera() {
        presentadorS.recibirJugador(modeloA.getJugador());
        presentadorS.abrirPantalla();
        vistaAjustes.dispose();
    }

    /**
     * Método para regresar a la pantalla de crear sala.
     */
    @Override
    public void btnRegresarCrearSala() {
        presentadorC.abrirPantalla();
        vistaAjustes.dispose();
    }

    /**
     * Método para regresar a la pantalla de unirse a sala.
     */
    @Override
    public void btnRegresarUnirseSala() {
        presentadorU.abrirPantalla();
        vistaAjustes.dispose();
    }

    /**
     * Método para abrir la pantalla de ajustes.
     */
    @Override
    public void abrirPantalla() {
        vistaAjustes.setVisible(true);
    }

    /**
     * Método para crear un jugador con los parámetros proporcionados y avanzar
     * a la sala de espera. Agrega el presentador de sala de espera como
     * observador del cliente.
     *
     * @param color Color del jugador.
     * @param nombre Nombre del jugador.
     * @param avatar Avatar del jugador.
     */
    @Override
    public void crearJugador(String color, String nombre, String avatar) {
        Cliente cliente = Cliente.getInstance();
        cliente.agregarObserver((Observer) presentadorS);

        modeloA.crearJugador(color, nombre, avatar);
        this.seleccionSigSalaEspera();
    }
}
