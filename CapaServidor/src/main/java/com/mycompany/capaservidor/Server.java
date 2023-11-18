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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ivan tapia
 */
public class Server extends Thread{

    @Override
    public void run() {
        try {
            ServerSocket socketServidor = new ServerSocket(1542);
            System.out.println("Luis pablo");
            while (true) {
                Socket conexionS = socketServidor.accept();
                System.out.println(conexionS);
                ObjectOutputStream objOS= new ObjectOutputStream(conexionS.getOutputStream());
                listaS.add(objOS);
                ClienteConexion clienteConexion = new ClienteConexion(this, conexionS);
                clienteConexion.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    List<ObjectOutputStream> listaS = new ArrayList<>();

    public Server() {
        
    }
    
    public void EnviarTodos(Object object) throws IOException {

        for (ObjectOutputStream o : listaS) {
            o.writeObject(object);
            o.flush();
        }
        
    }
    

}
