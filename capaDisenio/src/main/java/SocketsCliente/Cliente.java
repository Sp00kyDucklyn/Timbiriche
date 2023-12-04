/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketsCliente;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import observer.Observer;

/**
 * La clase Cliente representa un cliente que se conecta a un servidor mediante un socket.
 * Se utiliza el patrón de diseño Singleton para garantizar que solo haya una instancia de Cliente en la aplicación.
 * La clase también gestiona la comunicación con el servidor a través de un hilo de conexión (ClienteHilo).
 *
 * @author equipo 1
 */
public class Cliente {

    /** Socket utilizado para la conexión con el servidor. */
    private Socket socket;

    /** Lista de sockets (clientes) conectados. */
    private List<Socket> listaS = new ArrayList<>();

    /** Instancia única de la clase Cliente utilizando el patrón Singleton. */
    private volatile static Cliente instance;

    /** Hilo de conexión del cliente con el servidor. */
    private ClienteHilo clienteConexion;

    /**
     * Obtiene la instancia única de la clase Cliente. Si no existe, crea una nueva instancia y la retorna.
     *
     * @return La instancia única de Cliente.
     */
    public static synchronized Cliente getInstance() {
        if (instance == null) {
            Socket socket;

            try {
                // Se establece la conexión con el servidor al crear la instancia.
                String input = "";

                while (input.trim().isEmpty()) {
                    input = JOptionPane.showInputDialog(null, "Ingresa la IP del servidor:");

                    if (input == null) {
                        JOptionPane.showMessageDialog(null, "No puedes dejar el campo vacío. Por favor, ingresa una IP valida.");
                    }
                }
                socket = new Socket(input, 1542);
                instance = new Cliente(socket);
            } catch (Exception e) {
                // Manejo de excepciones en caso de error al establecer la conexión.
                return null;
            }
        }
        return instance;
    }

    /**
     * Constructor privado utilizado en el patrón Singleton. Se crea una instancia de Cliente con un socket dado.
     *
     * @param socket El socket utilizado para la conexión con el servidor.
     * @throws IOException Si ocurre un error de entrada/salida al crear el cliente.
     */
    private Cliente(Socket socket) throws IOException {
        this.socket = socket;
        // Se inicia un hilo de conexión para manejar la comunicación con el servidor.
        clienteConexion = new ClienteHilo(this.socket);
        clienteConexion.start();
    }

    /**
     * Envía un objeto al servidor a través del hilo de conexión.
     *
     * @param object El objeto que se enviará al servidor.
     * @throws IOException Si ocurre un error de entrada/salida al enviar el objeto.
     */
    public void enviarServidor(Object object) throws IOException {
        clienteConexion.enviarServidor(object);
    }

    /**
     * Agrega un observador (Observer) al hilo de conexión para recibir notificaciones.
     *
     * @param observer El observador que se agregará al hilo de conexión.
     */
    public void agregarObserver(Observer observer) {
        clienteConexion.agregarObserver(observer);
    }
    
}
