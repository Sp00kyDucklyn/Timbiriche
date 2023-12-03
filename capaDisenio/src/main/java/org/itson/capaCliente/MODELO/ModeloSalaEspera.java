/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.MODELO;

import com.mycompany.dto.JugadorDTO;
import java.util.ArrayList;
import java.util.List;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Partida;

/**
 * La clase ModeloSalaEspera representa el modelo asociado a la sala de espera de jugadores antes de iniciar una partida.
 * Gestiona la información sobre los jugadores en espera y su relación con la partida.
 * También proporciona métodos para transformar objetos del modelo a objetos de transferencia de datos (DTO).
 *
 * @author equipo 1
 */
public class ModeloSalaEspera {
    
    /** Jugador asociado al modelo. */
    private Jugador jugador;

    /** Partida asociada al modelo. */
    private Partida partida;

    /** Lista de jugadores en espera. */
    private List<Jugador> jugadores;

    /**
     * Constructor por defecto de la clase ModeloSalaEspera.
     * Inicializa la lista de jugadores en espera.
     */
    public ModeloSalaEspera() {
        jugadores = new ArrayList<>();
    }

    /**
     * Constructor de la clase ModeloSalaEspera con parámetros.
     *
     * @param jugador El jugador asociado al modelo.
     * @param partida La partida asociada al modelo.
     */
    public ModeloSalaEspera(Jugador jugador, Partida partida) {
        jugadores = new ArrayList<>();
        this.jugador = jugador;
        this.partida = partida;
    }

    /**
     * Obtiene el jugador asociado al modelo.
     *
     * @return El jugador asociado al modelo.
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Establece el jugador asociado al modelo.
     *
     * @param jugador El jugador a establecer.
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * Obtiene la partida asociada al modelo.
     *
     * @return La partida asociada al modelo.
     */
    public Partida getPartida() {
        return partida;
    }

    /**
     * Establece la partida asociada al modelo.
     *
     * @param partida La partida a establecer.
     */
    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    /**
     * Obtiene la lista de jugadores en espera.
     *
     * @return La lista de jugadores en espera.
     */
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * Remueve un jugador de la lista de jugadores en espera.
     *
     * @param jugador El jugador a remover.
     */
    public void removerJugador(JugadorDTO jugador) {
        for (Jugador jugadore : jugadores) {
            if (jugadore.getCodigoExclusivo() == jugador.getCodigoExclusivo()) {
                jugadores.remove(jugadore);
                break;  // Importante: salir del bucle después de remover un jugador.
            }
        }
    }

    /**
     * Establece la lista de jugadores en espera.
     *
     * @param jugadores La lista de jugadores en espera a establecer.
     */
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    /**
     * Transforma un objeto JugadorDTO a un objeto Jugador del modelo.
     *
     * @param jugadorDTO El objeto JugadorDTO que se va a transformar.
     * @return El objeto Jugador correspondiente al jugadorDTO.
     */
    public Jugador transformarJugadorDTO(JugadorDTO jugadorDTO){
        Jugador jugador = new Jugador();
        jugador.setCodigoExclusivo(jugadorDTO.getCodigoExclusivo());
        jugador.setNombre(jugadorDTO.getNombre());
        jugador.setAvatar(jugadorDTO.getAvatar());
        jugador.setColor(jugadorDTO.getColor());
//        jugador.setLineas(this.);
        
        return jugador;
    }

    
    
    
}
