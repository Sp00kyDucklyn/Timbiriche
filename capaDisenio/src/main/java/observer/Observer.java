/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observer;

/**
 * La interfaz Observer proporciona un método de actualización que las clases observadoras deben implementar.
 * Este método se llama cuando el estado del objeto observado cambia, y se proporciona con el nuevo estado.
 *
 * @author danie ft. el roble rojo y su mejor amigo el bus
 */
public interface Observer {
     /**
     * Método llamado por el objeto observado para notificar al observador sobre un cambio en su estado.
     *
     * @param object El objeto que contiene la información del cambio en el estado.
     */
    void update(Object object);
}
