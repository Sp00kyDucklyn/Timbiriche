/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capaservidor;

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
public class Server {

    List<Socket> listaS = new ArrayList<>();

    public Server() throws IOException {
        ServerSocket socketServidor = new ServerSocket(1542);

        while (true) {
            Socket conexionS = socketServidor.accept();
            listaS.add(conexionS);
            ClienteConexion clienteConexion = new ClienteConexion(this, conexionS);
            
        }
    }
    
    public void EnviarTodos(Object object) throws IOException{
        for (Socket socket : listaS) {
            ObjectOutputStream objOS= new ObjectOutputStream(socket.getOutputStream());
            objOS.writeObject(object);
            objOS.flush();
        }
    }

}
