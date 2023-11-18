/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observer;

/**
 *
 * @author danie ft. El camion y su fiel dromedario la cabra
 */
public interface Observable {
    public void agregarObserver(Observer observer);
    public void eliminarObserver(Observer observer);
    public void notificarObservers(Object object);
}
