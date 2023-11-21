/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capaservidor;

import com.mycompany.dto.JugadorDTO;
import com.mycompany.dto.JugadoresDTO;
import com.mycompany.dto.PartidaDTO;
import com.mycompany.dto.PosicionDTO;
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
    private PartidaServidor partidaS;
    private Server servidor;
    private Socket socket;
    private ObjectInputStream entrada;
  
    

    public ClienteConexion(Server servidor, Socket socket) {
        try {
            
            entrada = new ObjectInputStream(socket.getInputStream());
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
                    partidaS.agregarJugador(jugadorDTO);
                    JugadoresDTO jugadoresDTO = new JugadoresDTO();
                    jugadoresDTO.setJugadorDTO(partidaS.getListaJugadores());
                    servidor.EnviarTodos(jugadoresDTO);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ClienteConexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    

    

    
}
