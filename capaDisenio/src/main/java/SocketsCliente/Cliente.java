/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketsCliente;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author equipo 1
 */
public class Cliente {

    private Socket socket;
    List<Socket> listaS = new ArrayList<>();
    private volatile static Cliente instance;
    private ClienteHilo clienteConexion;

    public static synchronized Cliente getInstance() {
        if (instance == null) {
            Socket socket;
            
            try {
                socket=new Socket("localhost", 1542);
                instance= new Cliente(socket);
                
            } catch (Exception e) {
                return null;
            }
        }
        return instance;
    }

    public Cliente(Socket socket) throws IOException {
        this.socket = socket;
        clienteConexion= new ClienteHilo(socket);
        clienteConexion.start();
        
    }

    
    public void enviarServidor(Object object) throws IOException{
        clienteConexion.enviarServidor(object);
       
    }
    
}
