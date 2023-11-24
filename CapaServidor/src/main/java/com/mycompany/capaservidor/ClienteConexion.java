/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capaservidor;

import com.mycompany.dto.IniciarPartidaDTO;
import com.mycompany.dto.JugadorDTO;
import com.mycompany.dto.JugadoresDTO;
import com.mycompany.dto.MovimientoDTO;
import com.mycompany.dto.PartidaDTO;
import com.mycompany.dto.PosicionDTO;
import com.mycompany.dto.SalirseDTO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author equipo 1
 */
public class ClienteConexion extends Thread{
    private boolean partidaIniciada=false;
    private JugadorDTO jugador;
    private PartidaServidor partidaS;
    private Server servidor;
    private Socket socket;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    

    public ClienteConexion(Server servidor, Socket socket, ObjectOutputStream salida) {
        try {
            
            entrada = new ObjectInputStream(socket.getInputStream());
            this.salida = salida;
//           s salida = new ObjectOutputStream(socket.getOutputStream());
            this.partidaS = PartidaServidor.getInstance();
            this.servidor = servidor;
            this.socket = socket;
        } catch (IOException ex) {
            Logger.getLogger(ClienteConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run() {
        
        try {
            while(true){
                Object object= entrada.readObject();
                if(object instanceof PartidaDTO){
                    PartidaDTO partidaDTO = (PartidaDTO) object;
                    servidor.validarJugadores(partidaDTO.getNumJugadores());
                    System.out.println("skibidi");
                    partidaS.crearPartida(partidaDTO);    
                }
                if(object instanceof JugadorDTO){
                    JugadorDTO jugadorDTO = (JugadorDTO) object;
                    JugadorDTO jugadorcito = partidaS.agregarJugador(jugadorDTO);
                    
                    servidor.sendToOne(jugadorcito, salida);
                    JugadoresDTO jugadoresDTO = new JugadoresDTO();
                    jugadoresDTO.setJugadorDTO(partidaS.getListaJugadores());
                    servidor.EnviarTodos(jugadoresDTO);
                    jugador=jugadorcito;
                    if (partidaS.listaLlena()) {
                        IniciarPartidaDTO iniciar = new IniciarPartidaDTO(partidaS.numeroJugadores());
                        servidor.EnviarTodos(iniciar);
                        partidaIniciada=true;
                    }
                }
                if(object instanceof MovimientoDTO){
                    MovimientoDTO movimientoDTO = (MovimientoDTO) object;
                    System.out.println(movimientoDTO.getJugador());
                    //Deberia actualizar el server?
                    servidor.EnviarTodos(movimientoDTO);
                }
            }
        } catch (IOException ex) {
            System.out.println("Se salio1");
            SalirseDTO salirse = new SalirseDTO(partidaIniciada,jugador);
            partidaS.removerJugador(jugador);
            try {
                servidor.EnviarTodos(salirse);
            } catch (IOException ex1) {
                Logger.getLogger(ClienteConexion.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Se salio2");
        }catch (Exception e){
            System.out.println("Se salio3");
        }
        
        
        
    }
    
    

    

    
}
