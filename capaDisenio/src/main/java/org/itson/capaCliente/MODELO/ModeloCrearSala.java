/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.MODELO;

import SocketsCliente.Cliente;
import com.mycompany.dto.PartidaDTO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.capadominio.Partida;

/**
 * La clase ModeloCrearSala representa el modelo asociado a la creación de una nueva sala de juego.
 * Proporciona un método para crear una nueva partida con el número de jugadores especificado.
 *
 * @author equipo 1
 */
public class ModeloCrearSala {
    
     /**
     * Constructor por defecto de la clase ModeloCrearSala.
     */
    public ModeloCrearSala() {
    }
    
    /**
     * Crea una nueva partida con el número de jugadores especificado y la envía al servidor.
     *
     * @param numero El número de jugadores que participarán en la partida.
     */
    public void crearPartida(int numero){
    
       // Obtiene la instancia única del cliente
       Cliente cliente = Cliente.getInstance();
       
       // Crea un objeto PartidaDTO con la información de la nueva partida
       PartidaDTO p = new PartidaDTO();
       p.setNumJugadores(numero);
       
       // Envía la información de la nueva partida al servidor
        try {
            cliente.enviarServidor(p);
        } catch (IOException ex) {
            Logger.getLogger(ModeloCrearSala.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   
}
