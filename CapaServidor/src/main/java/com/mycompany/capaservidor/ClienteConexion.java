/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capaservidor;

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
    
    private Server servidor;
    private Socket socket;

    public ClienteConexion(Server servidor, Socket socket) {
        this.servidor = servidor;
        this.socket = socket;
    }
    
    @Override
    public void run() {
        try {
            ObjectInputStream obj= new ObjectInputStream(socket.getInputStream());
            while(true){
                Object object= obj.readObject();
//                if(object instanceof movimientoDTO){
//                    //Aqui se hace algo y luego se envia a todos
//                    servidor.EnviarTodos(movimientoDTO);
//                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(ClienteConexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    

    

    
}
