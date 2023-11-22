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
 * @author equipo 1 
 */
public class Server extends Thread{
    private int numJugadores=100;
    
    @Override
    public void run() {
        try {
            ServerSocket socketServidor = new ServerSocket(1542);
            System.out.println("Luis pablo");
            while (listaS.size()<numJugadores) {
                Socket conexionS = socketServidor.accept();
                System.out.println(conexionS);
                ObjectOutputStream objOS= new ObjectOutputStream(conexionS.getOutputStream());
                listaS.add(objOS);
                ClienteConexion clienteConexion = new ClienteConexion(this, conexionS, objOS);
                clienteConexion.start();
            }
            socketServidor.close();
            System.out.println("Maximo de jugadores alcanzado");
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
    
    public void validarJugadores(int numJugadores){
        this.numJugadores=numJugadores;
    }
    
    public void sendToOne(Object obj, ObjectOutputStream outPut) {
            try {
                outPut.writeObject(obj);
                outPut.flush();
            } catch (IOException e) {
                // Manejar excepciones
            }
    }

}
