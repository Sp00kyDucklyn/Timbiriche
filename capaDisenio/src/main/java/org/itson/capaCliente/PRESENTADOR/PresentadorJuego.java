/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.MODELO.ModeloJuego;
import org.itson.capaCliente.MODELO.ModeloSalaEspera;
import org.itson.capaCliente.VISTA.FrmJuego;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Tablero;

/**
 *
 * @author equipo 1
 */
public class PresentadorJuego implements IPresentadorJuego{
    
    private FrmJuego vistaJuego;
    private IPresentadorSalaEspera presentadorS;
    private ModeloJuego modeloJ;

    public PresentadorJuego(IPresentadorSalaEspera presentadorS) {
        vistaJuego = new FrmJuego(this);
        this.presentadorS = presentadorS;
        this.modeloJ = new ModeloJuego();
    }
    

    @Override
    public void colocaLinea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verificaCuadro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregaPuntaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void asignaTurnos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciarPartida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void abrirPantalla() {
       vistaJuego.setJugador(modeloJ.getJugador());
       vistaJuego.mandarTablero();
       vistaJuego.setVisible(true);
       
    }

    @Override
    public void recibirJugador(Jugador jugador) {
        modeloJ.setJugador(jugador);
    }

    @Override
    public void recibirTablero(Tablero tablero) {
       modeloJ.setTablero(tablero);
        System.out.println(tablero);
    }

    @Override
    public Tablero regresarTablero() {
        return modeloJ.getTablero();
    }
    
    @Override
    public void enviarTablero() {
        presentadorS.recibirTablero(modeloJ.getTablero());
    }
    
}
