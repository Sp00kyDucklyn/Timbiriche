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
 *
 * @author equipo 1
 */
public class ModeloSalaEspera {
    private Jugador jugador;
    private Partida partida;
    private List<Jugador> jugadores;
    
    public ModeloSalaEspera() {
        jugadores = new ArrayList<>();
    }

    public ModeloSalaEspera(Jugador jugador,Partida partida) {
        jugadores = new ArrayList<>();
        this.jugador = jugador;
        this.partida = partida;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public void removerJugador(JugadorDTO jugador){
        for (Jugador jugadore : jugadores) {
            if (jugadore.getCodigoExclusivo()==jugador.getCodigoExclusivo()) {
                jugadores.remove(jugadore);
            }
        }
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
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
