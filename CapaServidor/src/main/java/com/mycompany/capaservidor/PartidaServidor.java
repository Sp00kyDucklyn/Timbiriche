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
 *
 * @author equipo 1
 */
public class PartidaServidor {
    
    private volatile static PartidaServidor instance;
    private Partida partida;
    

    public PartidaServidor() {
    }
   
    public static synchronized PartidaServidor getInstance() {
        if (instance == null) {
            instance = new PartidaServidor();
        }
        return instance;
    }
    
    public void crearPartida(PartidaDTO partidaDTO){
        partida = new Partida(partidaDTO.getNumJugadores());
    }
    
    public Integer numeroJugadores(){
       return partida.getNumJugadores();
    }
    
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
    
    public List<JugadorDTO> transformarListaJugadores(List<Jugador> listaJugador){
        List<JugadorDTO> listaDTO = new ArrayList<>();
        for (Jugador jugador : listaJugador) {
            JugadorDTO jugadorDTO = this.transformarJugador(jugador);
            listaDTO.add(jugadorDTO);
        }
        return listaDTO;
    }
    
    public JugadorDTO agregarJugador(JugadorDTO jugadorDTO) {
        Jugador jugador = this.transformarJugadorDTO(jugadorDTO);
        for (int numero = 0; numero < this.getListaJugadores().size(); numero++) {
            numero++;
            jugador.setCodigoExclusivo(numero);
        }
        partida.agregarJugador(jugador);
        return transformarJugador(jugador);
    }
    
    public List<JugadorDTO> getListaJugadores(){
        List<JugadorDTO> listaDTO = this.transformarListaJugadores(partida.getListaJugador());
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
        linea.setJugador(this.transformarJugadorDTO(lineaDTO.getJugador()));
        return linea;
    }
    
    public List<Linea> transformarListaLineaDTO(List<LineaDTO> listaDTO) {

        List<Linea> listaLinea = new ArrayList<>();

        for (LineaDTO lineaDTO : listaDTO) {
            Linea linea = this.transformarLineaDTO(lineaDTO);
            listaLinea.add(linea);
        }

        return listaLinea;

    }
    
    
    
//    public PartidaDTO getPartidaDTO(){
//        PartidaDTO partidaDTO = new PartidaDTO();
//        
////        tableroDTO.
////                
////        partidaDTO.setTableroDTO(tableroDTO);
//        partidaDTO.setNumJugadores(partida.getNumJugadores());
//        return partidaDTO;
//    }
    
    
    
//    public TableroDTO getTableroDTO(){
//        TableroDTO tableroDTO = new TableroDTO();
//        |
//        tableroDTO.setCuadraditoDTO(this.getCuadradoDTO());
//        tableroDTO.setLineasHDTO(this.getLineaHDTO());
//        tableroDTO.setLineasVDTO(this.getLineaVDTO());
//        tableroDTO.setPuntitosDTO(this.getPuntoDTO());
//        
//        return tableroDTO;
//    }
//    
//    public List<CuadroDTO> getCuadradoDTO(){
//        
//        List<CuadroDTO> listaCuadro = new ArrayList<>();
//        
//        for (Cuadro cuadro : partida.getTablero().getCuadradito()) {
//            LineaDTO lineaArriba = ;
//            LineaDTO lineaAbajo;
//            LineaDTO lineaHorizontal;
//            LineaDTO lineaVertical;
//            
//            CuadroDTO cuadroDTO = new CuadroDTO();
//        }
//        
//        return listaCuadro;
//    }
//    
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
    
    public List<LineaDTO> transformarLineaLista(List<Linea> listaLinea){
        List<LineaDTO> listaDTO = new ArrayList<>();
      
        for (Linea linea : listaLinea) {
            LineaDTO lineaDTO = this.transformarLinea(linea);
            listaDTO.add(lineaDTO);
        }
        
        return listaDTO;
    }
//    
//    public List<LineaDTO> getLineaHDTO(){
//        List<LineaDTO> listaLinea = new ArrayList<>();
//        
//         for (Linea linea : partida.getTablero().getLineasH()) {
//            PuntoDTO puntoInicio = new PuntoDTO(linea.getPuntoInicio().getX(),linea.getPuntoInicio().getY());
//            PuntoDTO puntoFin = new PuntoDTO(linea.getPuntoFin().getX(), linea.getPuntoFin().getY());
//            
//            LineaDTO lineaDTO = new LineaDTO(puntoInicio,puntoFin, PosicionDTO.HORIZONTAL);
//            listaLinea.add(lineaDTO);
//        }
//        
//        return listaLinea;
//    }
//  
//    public List<LineaDTO> getLineaVDTO() {
//        List<LineaDTO> listaLinea = new ArrayList<>();
//        
//        for (Linea linea : partida.getTablero().getLineasV()) {
//            PuntoDTO puntoInicio = new PuntoDTO(linea.getPuntoInicio().getX(),linea.getPuntoInicio().getY());
//            PuntoDTO puntoFin = new PuntoDTO(linea.getPuntoFin().getX(), linea.getPuntoFin().getY());
//            
//            LineaDTO lineaDTO = new LineaDTO(puntoInicio,puntoFin, PosicionDTO.VERTICAL);
//            listaLinea.add(lineaDTO);
//        }
//
//        return listaLinea;
//    }
//    
//    public List<PuntoDTO> getPuntoDTO(){
//        List<PuntoDTO> listaPunto = new ArrayList<>();
//        for (Punto punto : partida.getTablero().getPuntitos()) {
//            PuntoDTO puntoDTO = new PuntoDTO(punto.getX(), punto.getY());
//            listaPunto.add(puntoDTO);
//        }
//        
//        return listaPunto;
//    }
    
    public boolean listaLlena(){
        if(partida.getNumJugadores() == partida.getListaJugador().size()){
            return true;
        }
        return false;
    }
}
