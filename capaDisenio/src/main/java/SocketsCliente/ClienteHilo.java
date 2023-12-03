/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketsCliente;

import com.mycompany.dto.IniciarPartidaDTO;
import com.mycompany.dto.JugadorDTO;
import com.mycompany.dto.JugadoresDTO;
import com.mycompany.dto.MovimientoDTO;
import com.mycompany.dto.SalirseDTO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import observer.Observable;
import observer.Observer;
import org.itson.capaCliente.PRESENTADOR.PresentadorJuego;
import org.itson.capaCliente.PRESENTADOR.PresentadorSalaEspera;

/**
 * La clase ClienteHilo representa un hilo de conexión del cliente con el servidor.
 * Este hilo gestiona la comunicación con el servidor, enviando y recibiendo objetos.
 * Implementa la interfaz Observable para permitir la observación por parte de objetos Observer.
 *
 * @author equipo 1
 */
public class ClienteHilo extends Thread implements Observable{

   /** Socket utilizado para la conexión con el servidor. */
    private Socket socketv;

    /** Flujo de entrada de objetos desde el servidor. */
    private ObjectInputStream entrada;

    /** Flujo de salida de objetos hacia el servidor. */
    private ObjectOutputStream salida;

    /** Lista de observadores que reciben notificaciones sobre eventos del servidor. */
    private List<Observer> observador;

    /**
     * Constructor de la clase ClienteHilo.
     * Inicializa los flujos de entrada y salida a través del socket de conexión.
     *
     * @param socket El socket utilizado para la conexión con el servidor.
     */
    public ClienteHilo(Socket socket) {
        try {
            observador = new ArrayList<>();
            this.socketv = socket;
            salida = new ObjectOutputStream(socketv.getOutputStream());
            entrada = new ObjectInputStream(socketv.getInputStream());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Método principal del hilo de conexión. Se ejecuta continuamente para recibir objetos del servidor
     * y notificar a los observadores sobre eventos específicos.
     */
    @Override
    public void run() {
        try {
            while (true) {
                Object object = entrada.readObject();
                System.out.println(object);

                if (object instanceof JugadoresDTO) {
                    JugadoresDTO jugadordeteo = (JugadoresDTO) object;
                    this.notificarObservers(jugadordeteo);
                }
                if (object instanceof IniciarPartidaDTO) {
                    IniciarPartidaDTO iniciar = (IniciarPartidaDTO) object;
                    this.notificarObservers(iniciar);
                }
                if (object instanceof MovimientoDTO) {
                    MovimientoDTO movimientodeteo = (MovimientoDTO) object;
                    this.notificarObservers(movimientodeteo);
                }
                if (object instanceof JugadorDTO) {
                    JugadorDTO jugadordeteo = (JugadorDTO) object;
                    this.notificarObservers(jugadordeteo);
                }
                if (object instanceof SalirseDTO) {
                    SalirseDTO salirse = (SalirseDTO) object;
                    this.notificarObservers(salirse);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ClienteHilo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Envía un objeto al servidor a través del flujo de salida.
     *
     * @param object El objeto que se enviará al servidor.
     * @throws IOException Si ocurre un error de entrada/salida al enviar el objeto.
     */
    public synchronized void enviarServidor(Object object) throws IOException {
        salida.writeObject(object);
        salida.flush();
    }

    /**
     * Agrega un observador (Observer) a la lista de observadores.
     *
     * @param observer El observador que se agregará a la lista.
     */
    @Override
    public void agregarObserver(Observer observer) {
        observador.add(observer);
    }

    /**
     * Elimina un observador (Observer) de la lista de observadores.
     *
     * @param observer El observador que se eliminará de la lista.
     */
    @Override
    public void eliminarObserver(Observer observer) {
        observador.remove(observer);
    }

    /**
     * Notifica a todos los observadores sobre un evento específico.
     *
     * @param object El objeto que contiene la información del evento.
     */
    @Override
    public void notificarObservers(Object object) {
        for (int i = 0; i < observador.size(); i++) {
            observador.get(i).update(object);
        }
    }

}
