/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.MODELO;

import org.itson.capaCliente.PRESENTADOR.IPresentadorAjustes;
import org.itson.capaCliente.PRESENTADOR.IPresentadorSalaEspera;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Tablero;

/**
 *
 * @author equipo 1
 */
public class ModeloAjustes {

    private Jugador jugador;
    private Tablero tablero;

    public ModeloAjustes() {

    }

    public ModeloAjustes(Tablero tablero) {
        this.tablero = tablero;
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

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    
    

}
