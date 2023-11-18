/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketsCliente;

import com.mycompany.dto.JugadorDTO;
import com.mycompany.dto.JugadoresDTO;
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

/**
 *
 * @author equipo 1
 */
public class ClienteHilo extends Thread implements Observable{

    private Socket socketv;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private List<Observer> observador;

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
            }
        } catch (IOException ex) {
            Logger.getLogger(ClienteHilo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteHilo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public synchronized void enviarServidor(Object object) throws IOException {
        salida.writeObject(object);
        salida.flush();
    }

    @Override
    public void agregarObserver(Observer observer) {
        observador.add(observer);
    }

    @Override
    public void eliminarObserver(Observer object) {
        observador.remove(object);
    }

    @Override
    public void notificarObservers(Object object) {
        for (int i = 0; i < observador.size(); i++) {
            observador.get(i).update(object);
        }
    }

}
