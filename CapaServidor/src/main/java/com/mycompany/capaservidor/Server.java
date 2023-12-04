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
 * Clase encargada de gestionar la lógica del servidor del juego, controlando la conexión y comunicación
 * con los clientes para la participación en la partida.
 *
 * @author equipo 1 
 */
public class Server extends Thread{
    /**
     * Número máximo de jugadores permitidos en el servidor.
     */ 
    private int numJugadores=100;
     /**
     * Lista de flujos de salida de objetos para la comunicación con los clientes.
     */
    List<ObjectOutputStream> listaS = new ArrayList<>();
    
    /**
     * Método de ejecución principal del servidor. Gestiona la conexión de los clientes y la interacción
     * con ellos hasta alcanzar el límite de jugadores.
     */
    @Override
    public void run() {
        try {
            ServerSocket socketServidor = new ServerSocket(1542);
            System.out.println("Servidor Iniciado");
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
    
   

    /**
     * Constructor por defecto de la clase.
     */
    public Server() {
        
    }
    
    /**
     * Envía un objeto a todos los clientes conectados.
     * 
     * @param object Objeto a enviar a todos los clientes.
     * @throws IOException Excepción en caso de problemas con la transmisión.
     */
    public void EnviarTodos(Object object) throws IOException {

        for (ObjectOutputStream o : listaS) {
            o.writeObject(object);
            o.flush();
        }
        
    }
    
    /**
     * Establece el número máximo de jugadores permitidos en el servidor.
     * 
     * @param numJugadores Número máximo de jugadores.
     */
    public void validarJugadores(int numJugadores){
        this.numJugadores=numJugadores;
    }
    
    /**
     * Envía un objeto a un cliente específico.
     * 
     * @param obj Objeto a enviar.
     * @param outPut Flujo de salida para el cliente específico.
     */
    public void sendToOne(Object obj, ObjectOutputStream outPut) {
            try {
                outPut.writeObject(obj);
                outPut.flush();
            } catch (IOException e) {
                // Manejar excepciones
            }
    }
    
    public synchronized void desconectarClliente(ObjectOutputStream out) {
        listaS.remove(out); // Elimina el flujo de salida del cliente
    }

}
