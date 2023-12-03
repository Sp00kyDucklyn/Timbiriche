/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import SocketsCliente.Cliente;
import com.mycompany.dto.IniciarPartidaDTO;
import com.mycompany.dto.JugadorDTO;
import com.mycompany.dto.JugadoresDTO;
import com.mycompany.dto.SalirseDTO;
import java.util.ArrayList;
import java.util.List;
import observer.Observer;
import org.itson.capaCliente.MODELO.ModeloSalaEspera;
import org.itson.capaCliente.VISTA.FrmSalaEspera;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Partida;
import org.itson.capadominio.Tablero;

/**
 * Clase que actúa como presentador para la pantalla de Sala de Espera.
 * Implementa la interfaz IPresentadorSalaEspera y Observer para manejar actualizaciones del servidor.
 * Coordina las interacciones del usuario en la sala de espera y comunica con otros presentadores según sea necesario.
 * 
 * @author equipo 1
 */
public class PresentadorSalaEspera implements IPresentadorSalaEspera, Observer{
    
    // Instancias de los presentadores asociados y la vista de la sala de espera
    private IPresentadorJuego presentadorJ;
    private IPresentadorAjustes presentadorA;
    private FrmSalaEspera salaEspera;
    private ModeloSalaEspera modeloSala;

    /**
     * Constructor que inicializa las instancias de los presentadores y la vista de la sala de espera.
     * @param presentadorA Un presentador asociado para la pantalla de ajustes.
     */
    public PresentadorSalaEspera(IPresentadorAjustes presentadorA) {
        
        salaEspera = new FrmSalaEspera(this);
        presentadorJ = new PresentadorJuego(this);
        this.presentadorA = presentadorA;
        modeloSala = new ModeloSalaEspera();
        
    }

    /**
     * Método que se ejecuta al seleccionar la opción "Iniciar Partida".
     * Este método no está completamente implementado y lanza una excepción.
     */
    @Override
    public void seleccionIniciar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Método que se ejecuta al verificar la confirmación de un jugador.
     * Este método no está completamente implementado y lanza una excepción.
     */
    @Override
    public void verificaConfirmacionJugador() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Método que se ejecuta al verificar si la sala está llena.
     * Este método no está completamente implementado y lanza una excepción.
     */
    @Override
    public void verificaSalaLlena() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Abre la pantalla de sala de espera y muestra la información de los jugadores presentes.
     */
    @Override
    public void abrirPantalla() {
       salaEspera.setVisible(true);
       salaEspera.MostrarJugador();
    }

    /**
     * Abre la pantalla anterior, generalmente la pantalla de ajustes.
     */
    @Override
    public void abrirPantallaAnterior() {
      presentadorA.abrirPantalla();
      salaEspera.dispose();
    }

    /**
     * Abre la pantalla del juego y realiza la configuración necesaria.
     */
    @Override
    public void abrirPantallaJuego() {
        presentadorJ.recibirJugador(modeloSala.getJugador());
        presentadorJ.setListaJugadores(modeloSala.getJugadores());
        presentadorJ.mostrarJugadores();
        presentadorJ.abrirPantalla();
        salaEspera.dispose();
    }

    /**
     * Recibe información de un jugador desde el servidor.
     * @param jugador El jugador recibido.
     */
    @Override
    public void recibirJugador(Jugador jugador) {
        modeloSala.setJugador(jugador);
    }

    /**
     * Retorna el jugador asociado a esta sala de espera.
     * @return El jugador en la sala de espera.
     */
    @Override
    public Jugador regresarJugador() {
        return modeloSala.getJugador();
    }

    /**
     * Método de actualización que se ejecuta cuando se recibe una notificación del servidor.
     * Actualiza la lista de jugadores y realiza acciones según la notificación.
     * @param object El objeto de notificación recibido del servidor.
     */
    @Override
    public void update(Object object) {
        // Implementación de la lógica de actualización según el tipo de objeto recibido
        // ...
    }

    /**
     * Retorna la lista de jugadores presentes en la sala de espera.
     * @return La lista de jugadores en la sala de espera.
     */
    @Override
    public List<Jugador> regresarJugadores() {
        return modeloSala.getJugadores();
    }
}
