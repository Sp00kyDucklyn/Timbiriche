/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.capaservidor;

import java.io.IOException;

/**
 * Clase Principal que inicia el servidor 
 * @author equipo 1 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Server server = new Server();
        server.start();
        
    }
    
}
