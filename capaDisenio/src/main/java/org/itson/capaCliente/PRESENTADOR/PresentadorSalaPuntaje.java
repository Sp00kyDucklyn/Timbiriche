/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import java.util.List;
import org.itson.capaCliente.MODELO.ModeloSalaPuntuacion;
import org.itson.capaCliente.VISTA.FrmSalaPuntuacion;
import org.itson.capadominio.Jugador;

/**
 * Clase que actúa como presentador para la pantalla de Sala de Puntaje.
 * Implementa la interfaz IPresentadorSalaPuntaje y coordina las interacciones del usuario
 * en la pantalla de puntaje al finalizar una partida.
 * 
 * @author equipo 1
 */
public class PresentadorSalaPuntaje implements IPresentadorSalaPuntaje{
    
    // Instancias de la vista y otros presentadores asociados
    FrmSalaPuntuacion vistaS;
    IPresentadorJuego presentadorJ;
    IPresentadorMenuPrincipal presentadorM;
    ModeloSalaPuntuacion modeloSP;

    /**
     * Constructor que inicializa las instancias de la vista, el presentador del juego,
     * el presentador del menú principal y el modelo de la sala de puntaje.
     * @param presentadorJ El presentador asociado al juego.
     */
    public PresentadorSalaPuntaje(IPresentadorJuego presentadorJ) {
        this.presentadorJ = presentadorJ;
        this.presentadorM = presentadorM; // <- Revisar, parece que falta asignación
        vistaS = new FrmSalaPuntuacion(this);
        modeloSP = new ModeloSalaPuntuacion();
    }
 
    /**
     * Método que se ejecuta al terminar una partida.
     * Abre la pantalla del menú principal y cierra la pantalla de puntaje.
     */
    @Override
    public void terminarPartida() {
       presentadorM.abrirMenuVista();
       vistaS.dispose();
    }

    /**
     * Abre la pantalla de puntaje.
     */
    @Override
    public void abrirPantalla() {
        vistaS.setVisible(true);
    }

    /**
     * Retorna la lista de jugadores que participaron en la partida.
     * @return La lista de jugadores que participaron en la partida.
     */
    @Override
    public List<Jugador> regresarJugadores() {
        return modeloSP.getJugadores();
    }

    /**
     * Establece la lista de jugadores en el modelo de la sala de puntaje.
     * @param jugadores La lista de jugadores que participaron en la partida.
     */
    @Override
    public void setListaJugadores(List<Jugador> jugadores) {
        modeloSP.setJugadores(jugadores);
    }
}
