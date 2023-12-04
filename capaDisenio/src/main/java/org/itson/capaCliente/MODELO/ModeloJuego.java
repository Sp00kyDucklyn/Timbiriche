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
 * La clase ModeloJuego representa el modelo asociado al desarrollo del juego.
 * Gestiona la información sobre los jugadores, la partida, el turno actual y las acciones relacionadas con el juego.
 * También proporciona métodos para transformar objetos del modelo a objetos de transferencia de datos (DTO) y viceversa.
 *
 * @author equipo 1
 */
public class ModeloJuego {
    private Jugador jugador;
    private Partida partida;
    private List<Jugador> jugadores;
    private int turno;
    private int numMAXJugadores =0;
    
    /**
     * Constructor de la clase
     */
    public ModeloJuego( ) {
        jugadores = new ArrayList<>();
        this.turno=0;
    }
    
    /**
     * 
     * @return 
     */
    public Jugador getJugador() {
        return jugador;
    }
     
    /**
     * 
     * @return 
     */
    public Jugador getJugadorTurno(){   
      return jugadores.get(turno);
    }
    
    /**
     * 
     * @return 
     */
    public boolean esTurno(){
        
       if(jugador.getCodigoExclusivo() == this.getJugadorTurno().getCodigoExclusivo()){
           return true;
       } 
       return false;
    }
    
    /**
     * 
     * @param jugador 
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * 
     * @return 
     */
    public Tablero getTablero() {
        return partida.getTablero();
    }

    /**
     * 
     * @param tablero 
     */
    public void setTablero(Tablero tablero) {
        partida.setTablero(tablero);
    }
    /**
     * 
     * @return 
     */
    public Partida getPartida() {
        return partida;
    }

    /**
     * 
     * @param partida 
     */
    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    
    /**
     * 
     * @param numero 
     */
    public void crearPartida(int numero){
        this.partida = new Partida(numero);
        this.setNumMAXJugadores(numero);
    }
    
    /**
     * 
     */
    public void pasarTurno(){
      turno++;
      if(turno == jugadores.size()){
          turno = 0;
      }  
    }
    
    /**
     * 
     * @return 
     */
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * 
     * @param jugadores 
     */
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * 
     * @return 
     */
    public int getTurno() {
        return turno;
    }

    /**
     * 
     * @param turno 
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }

    /**
     * 
     * @return 
     */
    public int getNumMAXJugadores() {
        return numMAXJugadores;
    }

    /**
     * 
     * @param numMAXJugadores 
     */
    public void setNumMAXJugadores(int numMAXJugadores) {
        this.numMAXJugadores = numMAXJugadores;
    }
    
    /**
     * 
     * @param linea
     * @param jugador 
     */
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

    /**
     * 
     * @param linea
     * @return 
     */
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

    /**
     * 
     * @param jugador
     * @return 
     */
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

    /**
     * 
     * @param listaLinea
     * @return 
     */
    public List<LineaDTO> transformarLineaLista(List<Linea> listaLinea) {
        List<LineaDTO> listaDTO = new ArrayList<>();

        for (Linea linea : listaLinea) {
            LineaDTO lineaDTO = this.transformarLinea(linea);
            listaDTO.add(lineaDTO);
        }

        return listaDTO;
    }
    
    /**
     * 
     * @param jugadorDTO
     * @return 
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
     * 
     * @param lineaDTO
     * @return 
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
        if(lineaDTO.getJugador() != null){
            linea.setJugador(this.transformarJugadorDTO(lineaDTO.getJugador()));
        }
        
        return linea;
    }
    
    public void eliminaJugador(Jugador jugador) {
        int o = 0;
        Jugador jugadorElimino = new Jugador();
        
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getCodigoExclusivo() == jugador.getCodigoExclusivo()) {
                jugadorElimino = jugadores.get(i);
                o=i;
                jugadores.remove(jugadorElimino);
            }
            
        }
        if (o != -1) {
            if (o < turno) {
                // Si el jugador eliminado estaba antes del turno actual, ajustar el turno
                turno=((turno - 1));
            } else if (o == turno) {
                // Si el jugador eliminado estaba en el turno actual, ajustar el turno

                if (turno >= getJugadores().size()) {
                    // Ajustar el turno si es necesario para no exceder el índice máximo de la lista
                    turno=0;
                }
            }
        }
        
    }
}
