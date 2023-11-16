/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capadominio.Tablero;

/**
 *
 * @author equipo 1
 */
public interface IPresentadorAjustes {
    
    public Tablero regresarTablero();
    
    public void enviarJugador();
    
    public void seleccionSigSalaEspera();
    
    public void btnRegresarCrearSala();
    
    public void btnRegresarUnirseSala();
    
    public void abrirPantalla();
   
    public void crearJugador(String color, String nombre, String avatar);
    
    public void recibirTablero(Tablero tablero);
    
    public void enviarTablero();
}
