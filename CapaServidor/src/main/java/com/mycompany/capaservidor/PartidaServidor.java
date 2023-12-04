/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capaservidor;

import com.mycompany.dto.CuadroDTO;
import com.mycompany.dto.JugadorDTO;
import com.mycompany.dto.LineaDTO;
import com.mycompany.dto.PartidaDTO;
import com.mycompany.dto.PosicionDTO;
import com.mycompany.dto.PuntoDTO;
import com.mycompany.dto.TableroDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.itson.capadominio.Cuadro;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Linea;
import org.itson.capadominio.Partida;
import org.itson.capadominio.Posicion;
import org.itson.capadominio.Punto;

/**
 * Clase que representa el servidor de una partida en un juego.
 * Controla la creación, manipulación y transformación de datos de los jugadores,
 * así como la gestión de la partida en curso.
 * 
 * @author equipo 1
 */
public class PartidaServidor {
    
    /**
     * Instancia única del servidor de partida (patrón Singleton).
     */
    private volatile static PartidaServidor instance;
    
    /**
     * Partida en curso.
     */
    private Partida partida;
    
    /**
     * Identificador para los jugadores.
     */
    private int id = 0;

    /**
     * Constructor por defecto.
     */
    public PartidaServidor() {
    }
   
    /**
     * Obtiene la instancia única del servidor de partida (patrón Singleton).
     * 
     * @return La instancia del servidor de partida.
     */
    public static synchronized PartidaServidor getInstance() {
        if (instance == null) {
            instance = new PartidaServidor();
        }
        return instance;
    }
    
    /**
     * Crea una nueva partida utilizando la información proporcionada en un objeto PartidaDTO.
     * 
     * @param partidaDTO Datos de la partida para inicializar.
     */
    public void crearPartida(PartidaDTO partidaDTO){
        partida = new Partida(partidaDTO.getNumJugadores());
    }
    
    /**
     * Obtiene el número de jugadores en la partida actual.
     * 
     * @return Número de jugadores en la partida.
     */
    public Integer numeroJugadores(){
       return partida.getNumJugadores();
    }
    
    /**
     * Transforma un objeto Jugador en un objeto JugadorDTO.
     * 
     * @param jugador Objeto Jugador a transformar.
     * @return Objeto JugadorDTO transformado.
     */
    public JugadorDTO transformarJugador(Jugador jugador){
        JugadorDTO jugadorDTO = new JugadorDTO();
        jugadorDTO.setCodigoExclusivo(jugador.getCodigoExclusivo());
        jugadorDTO.setNombre(jugador.getNombre());
        jugadorDTO.setAvatar(jugador.getAvatar());
        jugadorDTO.setColor(jugador.getColor());
        jugadorDTO.setPuntaje(jugador.getPuntaje());
        jugadorDTO.setLineaDTO(this.transformarLineaLista(jugador.getLineas()));
        
        return jugadorDTO;
    }
    
    /**
     * Transforma una lista de objetos Jugador en una lista de objetos JugadorDTO.
     * 
     * @param listaJugador Lista de Jugadores a transformar.
     * @return Lista de JugadoresDTO transformada.
     */
    public List<JugadorDTO> transformarListaJugadores(List<Jugador> listaJugador){
        List<JugadorDTO> listaDTO = new ArrayList<>();
        for (Jugador jugador : listaJugador) {
            JugadorDTO jugadorDTO = this.transformarJugador(jugador);
            listaDTO.add(jugadorDTO);
        }
        return listaDTO;
    }
    
    /**
     * Agrega un jugador a la partida en curso.
     * 
     * @param jugadorDTO Datos del jugador a agregar.
     * @return Objeto JugadorDTO del jugador agregado.
     */
    public JugadorDTO agregarJugador(JugadorDTO jugadorDTO) {
        Jugador jugador = this.transformarJugadorDTO(jugadorDTO);
        jugador.setCodigoExclusivo(id);
        id++;
        partida.agregarJugador(jugador);
        return transformarJugador(jugador);
    }
    
    /**
     * Remueve un jugador de la partida en curso.
     * 
     * @param jugadorDTO Datos del jugador a remover.
     */
    public void removerJugador(JugadorDTO jugadorDTO){
        Jugador jugador = this.transformarJugadorDTO(jugadorDTO);
        partida.removerJugador(jugador);
    }
    
    /**
     * Obtiene la lista de jugadores en la partida en curso.
     * 
     * @return Lista de objetos JugadorDTO.
     */
    public List<JugadorDTO> getListaJugadores(){
        List<JugadorDTO> listaDTO = this.transformarListaJugadores(partida.getListaJugador());
        return listaDTO;
    }
    
    /**
     * Transforma un objeto JugadorDTO en un objeto Jugador.
     * 
     * @param jugadorDTO Objeto JugadorDTO a transformar.
     * @return Objeto Jugador transformado.
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
    
    /**
     * Transforma un objeto LineaDTO en un objeto Linea.
     * 
     * @param lineaDTO Objeto LineaDTO a transformar.
     * @return Objeto Linea transformado.
     */
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
        linea.setJugador(this.transformarJugadorDTO(lineaDTO.getJugador()));
        return linea;
    }
    
    /**
     * Transforma una lista de objetos LineaDTO en una lista de objetos Linea.
     * 
     * @param listaDTO Lista de LineaDTO a transformar.
     * @return Lista de Linea transformada.
     */
    public List<Linea> transformarListaLineaDTO(List<LineaDTO> listaDTO) {

        List<Linea> listaLinea = new ArrayList<>();

        for (LineaDTO lineaDTO : listaDTO) {
            Linea linea = this.transformarLineaDTO(lineaDTO);
            listaLinea.add(linea);
        }

        return listaLinea;

    }
    
    /**
     * Transforma un objeto Linea en un objeto LineaDTO.
     * 
     * @param linea Objeto Linea a transformar.
     * @return Objeto LineaDTO transformado.
     */
    public LineaDTO transformarLinea(Linea linea) {
        PuntoDTO puntoInicio = new PuntoDTO(linea.getPuntoInicio().getX(), linea.getPuntoInicio().getY());
        PuntoDTO puntoFin = new PuntoDTO(linea.getPuntoFin().getX(), linea.getPuntoFin().getY());
        PosicionDTO posicionDTO;
        if(linea.getPosicion() == Posicion.VERTICAL){
            posicionDTO= PosicionDTO.VERTICAL;
        }else{
            posicionDTO= PosicionDTO.HORIZONTAL;
        }
        
        LineaDTO lineaDTO = new LineaDTO(puntoInicio, puntoFin, posicionDTO);
        
        return lineaDTO;
    }
    
    /**
     * Transforma una lista de objetos Linea en una lista de objetos LineaDTO.
     * 
     * @param listaLinea Lista de Linea a transformar.
     * @return Lista de LineaDTO transformada.
     */
    public List<LineaDTO> transformarLineaLista(List<Linea> listaLinea){
        List<LineaDTO> listaDTO = new ArrayList<>();
      
        for (Linea linea : listaLinea) {
            LineaDTO lineaDTO = this.transformarLinea(linea);
            listaDTO.add(lineaDTO);
        }
        
        return listaDTO;
    }

    /**
     * Verifica si la lista de jugadores está llena en la partida actual.
     * 
     * @return true si la lista de jugadores está llena, false en caso contrario.
     */
    public boolean listaLlena(){
        if(partida.getNumJugadores() == partida.getListaJugador().size()){
            return true;
        }
        return false;
    }
}
