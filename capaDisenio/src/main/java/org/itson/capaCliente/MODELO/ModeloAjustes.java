/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.MODELO;

import org.itson.capaCliente.PRESENTADOR.IPresentadorAjustes;
import org.itson.capaCliente.PRESENTADOR.IPresentadorSalaEspera;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Partida;
import org.itson.capadominio.Tablero;

/**
 *
 * @author equipo 1
 */
public class ModeloAjustes {

    private Jugador jugador;
    private Partida partida;

    public ModeloAjustes() {

    }

    public ModeloAjustes(Partida partida) {
        this.partida = partida;
    }

    public void crearJugador(String color, String nombre, String avatar) {
        this.jugador = new Jugador(avatar, color, nombre);
    }

    public Jugador getJugador() {
        return jugador;
    }

    public String obtenerImagen() {
        String imagenSeleccionada = jugador.getAvatar();

        if (imagenSeleccionada != null) {

            return "La imagen ha sido establecida correctamente.";
        } else {
            return "No se encontró ninguna imagen seleccionada.";
        }
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    
    

}
