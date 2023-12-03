/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.MODELO;

import SocketsCliente.Cliente;
import com.mycompany.dto.JugadorDTO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.capaCliente.PRESENTADOR.IPresentadorAjustes;
import org.itson.capaCliente.PRESENTADOR.IPresentadorSalaEspera;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Partida;
import org.itson.capadominio.Tablero;

/**
 * La clase ModeloAjustes representa el modelo asociado a la configuración de un
 * jugador y su participación en una partida. Gestiona la creación de un jugador
 * con atributos específicos, su envío al servidor y proporciona métodos para
 * obtener información sobre el jugador y la partida.
 *
 * @author equipo 1
 */
public class ModeloAjustes {

    /**
     * Jugador asociado al modelo.
     */
    private Jugador jugador;

    /**
     * Partida asociada al modelo.
     */
    private Partida partida;

    /**
     * Constructor por defecto de la clase ModeloAjustes.
     */
    public ModeloAjustes() {

    }

    /**
     * Constructor que permite asociar una partida al modelo desde su creación.
     *
     * @param partida La partida asociada al modelo.
     */
    public ModeloAjustes(Partida partida) {
        this.partida = partida;
    }

    /**
     * Crea un nuevo jugador con los atributos especificados y lo envía al
     * servidor.
     *
     * @param color El color seleccionado para el jugador.
     * @param nombre El nombre del jugador.
     * @param avatar La ruta o identificador del avatar seleccionado por el
     * jugador.
     */
    public void crearJugador(String color, String nombre, String avatar) {
        this.jugador = new Jugador(avatar, color, nombre);
        JugadorDTO jugadordto = new JugadorDTO();
        jugadordto.setNombre(this.jugador.getNombre());
        jugadordto.setColor(this.jugador.getColor());
        jugadordto.setAvatar(this.jugador.getAvatar());
        Cliente cliente = Cliente.getInstance();
        try {
            cliente.enviarServidor(jugadordto);
        } catch (IOException ex) {
            Logger.getLogger(ModeloAjustes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene el jugador asociado al modelo.
     *
     * @return El jugador asociado al modelo.
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Obtiene la información sobre la imagen seleccionada por el jugador.
     *
     * @return Un mensaje indicando si la imagen ha sido establecida
     * correctamente o no.
     */
    public String obtenerImagen() {
        String imagenSeleccionada = jugador.getAvatar();

        if (imagenSeleccionada != null) {
            return "La imagen ha sido establecida correctamente.";
        } else {
            return "No se encontró ninguna imagen seleccionada.";
        }
    }

    /**
     * Obtiene la partida asociada al modelo.
     *
     * @return La partida asociada al modelo.
     */
    public Partida getPartida() {
        return partida;
    }

    /**
     * Establece la partida asociada al modelo.
     *
     * @param partida La nueva partida a asociar al modelo.
     */
    public void setPartida(Partida partida) {
        this.partida = partida;
    }

}
