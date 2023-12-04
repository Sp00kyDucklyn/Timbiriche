/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import com.mycompany.dto.IniciarPartidaDTO;
import com.mycompany.dto.JugadorDTO;
import com.mycompany.dto.JugadoresDTO;
import com.mycompany.dto.MovimientoDTO;
import java.util.ArrayList;
import java.util.List;
import observer.Observer;
import org.itson.capaCliente.MODELO.ModeloJuego;
import org.itson.capaCliente.MODELO.ModeloSalaEspera;
import org.itson.capaCliente.VISTA.FrmJuego;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Linea;
import org.itson.capadominio.Partida;
import org.itson.capadominio.Tablero;

/**
 * Clase que actúa como presentador para la pantalla de juego en una aplicación de juego.
 * Implementa la interfaz IPresentadorJuego y Observer, gestionando la lógica de presentación asociada con el desarrollo de una partida.
 * Puede ser utilizado en conjunción con los presentadores IPresentadorSalaEspera e IPresentadorSalaPuntaje.
 * 
 * @author Equipo 1
 */
public class PresentadorJuego implements IPresentadorJuego, Observer {

    private FrmJuego vistaJuego;
    private IPresentadorSalaEspera presentadorS;
    private ModeloJuego modeloJ;
    private IPresentadorSalaPuntaje presentadorSE;

    /**
     * Constructor que recibe un presentador de sala de espera como parámetro.
     * Inicializa los objetos del modelo y la vista, y establece el presentador de sala de puntuación.
     * 
     * @param presentadorS Presentador de sala de espera asociado.
     */
    public PresentadorJuego(IPresentadorSalaEspera presentadorS) {
        vistaJuego = new FrmJuego(this);
        this.presentadorS = presentadorS;
        this.modeloJ = new ModeloJuego();
        presentadorSE = new PresentadorSalaPuntaje(this);
    }

    /**
     * Método para colocar una línea en el tablero del juego.
     * 
     * @param linea Línea que se va a colocar.
     * @param jugador Jugador que realiza la acción.
     */
    @Override
    public void colocaLinea(Linea linea, Jugador jugador) {
        modeloJ.colocarLinea(linea, jugador);
    }

    /**
     * Método para abrir la pantalla de juego y enviar la información del jugador y el tablero.
     */
    @Override
    public void abrirPantalla() {
        vistaJuego.setJugador(modeloJ.getJugador());
        vistaJuego.mandarTablero();
        vistaJuego.setVisible(true);
    }

    /**
     * Método para recibir la información del jugador que participa en el juego.
     * 
     * @param jugador Jugador que se une al juego.
     */
    @Override
    public void recibirJugador(Jugador jugador) {
        modeloJ.setJugador(jugador);
    }

    /**
     * Método para obtener el tablero asociado al juego.
     * 
     * @return Objeto Tablero del juego.
     */
    @Override
    public Tablero regresarTablero() {
        return modeloJ.getTablero();
    }

    /**
     * Método para obtener la partida asociada al juego.
     * 
     * @return Objeto Partida del juego.
     */
    @Override
    public Partida regresarPartida() {
        return modeloJ.getPartida();
    }

    /**
     * Método llamado por el Observer cuando hay una actualización en el juego.
     * Gestiona las actualizaciones de jugadores y movimientos en el juego.
     * 
     * @param object Objeto que contiene la información de la actualización.
     */
    @Override
    public void update(Object object) {
        if(object instanceof JugadoresDTO){

            JugadoresDTO jugadoresdeteo = (JugadoresDTO) object;
            List<JugadorDTO> jugadordto = jugadoresdeteo.getJugadorDTO();
            List<Jugador> jugador = new ArrayList<>();
            for (int i = 0; i < jugadordto.size(); i++) {
                Jugador juga = new Jugador();
                juga.setCodigoExclusivo(jugadordto.get(i).getCodigoExclusivo());
                juga.setAvatar(jugadordto.get(i).getAvatar());
                juga.setColor(jugadordto.get(i).getColor());
                juga.setNombre(jugadordto.get(i).getNombre());
                jugador.add(juga);
            }
            modeloJ.setJugadores(jugador);
            vistaJuego.setListaJugadores(jugador);
            System.out.println("me actualice");
        }
        if(object instanceof MovimientoDTO){
            System.out.println("paso por aqui");
            MovimientoDTO movimientodeteo = (MovimientoDTO) object;
            System.out.println("hola"+movimientodeteo.getJugador());
            Jugador jugador = modeloJ.transformarJugadorDTO(movimientodeteo.getJugador());
            Linea linea = modeloJ.transformarLineaDTO(movimientodeteo.getLinea());
            int puntacionA = jugador.getPuntaje();
            vistaJuego.colocarLinea(linea, jugador);
            int puntacionB = jugador.getPuntaje();
            if (puntacionB==puntacionA) {
                pasarTurno();
            }
            vistaJuego.MostrarJugadores();
        }
    }

    /**
     * Método para crear una nueva partida con el número de jugadores especificado.
     * 
     * @param numero Número de jugadores en la partida.
     */
    @Override
    public void crearPartida(int numero) {
        modeloJ.crearPartida(numero);
    }

    /**
     * Método para establecer la lista de jugadores en el juego y en la vista.
     * 
     * @param jugadores Lista de jugadores en la partida.
     */
    @Override
    public void setListaJugadores(List<Jugador> jugadores) {
        vistaJuego.setListaJugadores(jugadores);
        modeloJ.setJugadores(jugadores);
    }

    /**
     * Método para pasar al siguiente turno en el juego.
     */
    @Override
    public void pasarTurno() {
        modeloJ.pasarTurno();
    }

    /**
     * Método para obtener el jugador cuyo turno es actual.
     * 
     * @return Objeto Jugador del turno actual.
     */
    @Override
    public Jugador getJugadorTurno() {
        return modeloJ.getJugadorTurno();
    }

    /**
     * Método para verificar si es el turno del jugador actual.
     * 
     * @return `true` si es el turno del jugador actual, `false` de lo contrario.
     */
    @Override
    public boolean esTurno() {
        return modeloJ.esTurno();
    }



    /**
     * Método para obtener la lista de jugadores en el juego.
     * 
     * @return Lista de objetos Jugador en la partida.
     */
    @Override
    public List<Jugador> getListaJugadores() {
        return modeloJ.getJugadores();
    }

    /**
     * Método para mostrar la información de los jugadores en la vista del juego.
     */
    @Override
    public void mostrarJugadores() {
        vistaJuego.MostrarJugadores();
    }

    /**
     * Método llamado para terminar la partida.
     * Imprime un mensaje de fin y pasa a la pantalla de puntuación.
     */
    @Override
    public void terminarPartida() {
        System.out.println("FIN SE ACABO");
        presentadorSE.setListaJugadores(this.getListaJugadores());
        presentadorSE.abrirPantalla();
        vistaJuego.dispose();
    }
    
}
