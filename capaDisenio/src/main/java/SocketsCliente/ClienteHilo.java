/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketsCliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar
 */
public class ClienteHilo extends Thread {

    private Socket socket;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;

    public ClienteHilo(Socket socket) throws IOException {
        this.socket = socket;
        entrada = new ObjectInputStream(socket.getInputStream());
        salida = new ObjectOutputStream(socket.getOutputStream());

    }

    @Override
    public void run() {
        while (true) {
            try {
                Object object = entrada.readObject();
//                if(object instanceof movimientoDTO){
//                    //Aqui se hace algo y luego se envia a todos
//                    poner la linea del color del jugador o decirle al presentador que ponga la linea
//                     vista.colocarLinea(movimientoDTO.getLinea, movimientoDTO.getJugador);
//                }

            } catch (IOException ex) {
                Logger.getLogger(ClienteHilo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClienteHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public synchronized void enviarServidor(Object object) throws IOException {
        salida.writeObject(object);
        salida.flush();
    }

}
