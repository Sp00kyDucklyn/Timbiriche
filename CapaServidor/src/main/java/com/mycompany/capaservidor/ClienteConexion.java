/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capaservidor;

import com.mycompany.dto.JugadorDTO;
import com.mycompany.dto.JugadoresDTO;
import com.mycompany.dto.PartidaDTO;
import java.io.IOException;
import java.io.ObjectInputStream;
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

    public ClienteConexion(Server servidor, Socket socket) {
        this.partidaS = PartidaServidor.getInstance();
        this.servidor = servidor;
        this.socket = socket;
    }
    
    @Override
    public void run() {
        try {
            ObjectInputStream obj= new ObjectInputStream(socket.getInputStream());
            while(true){
                Object object= obj.readObject();
                if(object instanceof PartidaDTO){
                    PartidaDTO partidaDTO = (PartidaDTO) object;
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
