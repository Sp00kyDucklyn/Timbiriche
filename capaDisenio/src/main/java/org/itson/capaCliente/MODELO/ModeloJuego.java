/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.MODELO;

import SocketsCliente.Cliente;
import com.mycompany.dto.JugadorDTO;
import com.mycompany.dto.LineaDTO;
import com.mycompany.dto.MovimientoDTO;
import com.mycompany.dto.PartidaDTO;
import com.mycompany.dto.PosicionDTO;
import com.mycompany.dto.PuntoDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Linea;
import org.itson.capadominio.Partida;
import org.itson.capadominio.Posicion;
import org.itson.capadominio.Punto;
import org.itson.capadominio.Tablero;

/**
 *
 * @author equipo 1
 */
public class ModeloJuego {
    private Jugador jugador;
    private Partida partida;
    private List<Jugador> jugadores;
    
    public ModeloJuego( ) {
        jugadores = new ArrayList<>();
    }
    
    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Tablero getTablero() {
        return partida.getTablero();
    }

    public void setTablero(Tablero tablero) {
        partida.setTablero(tablero);
    }
    
    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    
    public void crearPartida(int numero){
        this.partida = new Partida(numero);
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public void colocarLinea(Linea linea, Jugador jugador) {
        System.out.println(jugador + "Tilin");
        Cliente cliente = Cliente.getInstance();
        JugadorDTO jugadorDTO = this.transformarJugador(jugador);
        LineaDTO lineaDTO = this.transformarLinea(linea);
        System.out.println(jugadorDTO);
        MovimientoDTO movimientoDTO = new MovimientoDTO(lineaDTO, jugadorDTO);
        
        try {
            cliente.enviarServidor(movimientoDTO);
        } catch (IOException ex) {
            Logger.getLogger(ModeloJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LineaDTO transformarLinea(Linea linea) {
        PuntoDTO puntoInicio = new PuntoDTO(linea.getPuntoInicio().getX(), linea.getPuntoInicio().getY());
        PuntoDTO puntoFin = new PuntoDTO(linea.getPuntoFin().getX(), linea.getPuntoFin().getY());
        PosicionDTO posicionDTO;
        if (linea.getPosicion() == Posicion.VERTICAL) {
            posicionDTO = PosicionDTO.VERTICAL;
        } else {
            posicionDTO = PosicionDTO.HORIZONTAL;
        }

        LineaDTO lineaDTO = new LineaDTO(puntoInicio, puntoFin, posicionDTO);

        return lineaDTO;
    }

    public JugadorDTO transformarJugador(Jugador jugador) {
        JugadorDTO jugadorDTO = new JugadorDTO();
        jugadorDTO.setCodigoExclusivo(jugador.getCodigoExclusivo());
        jugadorDTO.setNombre(jugador.getNombre());
        jugadorDTO.setAvatar(jugador.getAvatar());
        jugadorDTO.setColor(jugador.getColor());
        jugadorDTO.setPuntaje(jugador.getPuntaje());
        jugadorDTO.setLineaDTO(this.transformarLineaLista(jugador.getLineas()));

        return jugadorDTO;
    }

    public List<LineaDTO> transformarLineaLista(List<Linea> listaLinea) {
        List<LineaDTO> listaDTO = new ArrayList<>();

        for (Linea linea : listaLinea) {
            LineaDTO lineaDTO = this.transformarLinea(linea);
            listaDTO.add(lineaDTO);
        }

        return listaDTO;
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
    
    public Linea transformarLineaDTO(LineaDTO lineaDTO){
        Linea linea = new Linea();
        Punto puntoInicio = new Punto(lineaDTO.getPuntoInicio().getX(), lineaDTO.getPuntoInicio().getY());
        Punto puntoFin = new Punto(lineaDTO.getPuntoFin().getX(), lineaDTO.getPuntoFin().getY());
        Posicion posicion;
        
        linea.setPuntoFin(puntoFin);
        linea.setPuntoInicio(puntoInicio);
        if(lineaDTO.getPosicion() == PosicionDTO.VERTICAL){
            posicion= Posicion.VERTICAL;
        }else{
            posicion= Posicion.HORIZONTAL;
        }
        linea.setPosicion(posicion);
        if(lineaDTO.getJugador() != null){
            linea.setJugador(this.transformarJugadorDTO(lineaDTO.getJugador()));
        }
        
        return linea;
    }
}
