/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observer;

/**
 * La interfaz Observable proporciona métodos para agregar, eliminar y notificar observadores.
 * Estos observadores recibirán actualizaciones cuando ocurran eventos específicos en la clase que implementa esta interfaz.
 *
 * @author danie ft. El camion y su fiel dromedario la cabra
 */
public interface Observable {
    /**
     * Agrega un observador a la lista de observadores.
     *
     * @param observer El observador que se agregará a la lista.
     */
    void agregarObserver(Observer observer);

    /**
     * Elimina un observador de la lista de observadores.
     *
     * @param observer El observador que se eliminará de la lista.
     */
    void eliminarObserver(Observer observer);

    /**
     * Notifica a todos los observadores sobre un evento específico.
     *
     * @param object El objeto que contiene la información del evento.
     */
    void notificarObservers(Object object);
}
