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
 *
 * @author equipo 1
 */
public class ModeloCrearSala {
    
    private Partida partida;

    public ModeloCrearSala() {
    }
    
    public void crearPartida(int numero){
       this.partida = new Partida(numero);
       Cliente cliente = Cliente.getInstance();
       PartidaDTO p= new PartidaDTO();
       p.setNumJugadores(numero);
        try {
            cliente.enviarServidor(p);
        } catch (IOException ex) {
            Logger.getLogger(ModeloCrearSala.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public Partida getPartida() {
        return partida;
    }

    
    
   
}
