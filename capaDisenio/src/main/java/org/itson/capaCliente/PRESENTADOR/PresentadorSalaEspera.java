/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.MODELO.ModeloSalaEspera;
import org.itson.capaCliente.VISTA.FrmSalaEspera;
import org.itson.capadominio.Jugador;

/**
 *
 * @author equipo 1
 */
public class PresentadorSalaEspera implements IPresentadorSalaEspera{
    
    private IPresentadorJuego presentadorJ;
    private IPresentadorAjustes presentadorA;
    private FrmSalaEspera salaEspera;
    private ModeloSalaEspera modeloSala;

    public PresentadorSalaEspera(IPresentadorAjustes presentadorA) {
        
        salaEspera = new FrmSalaEspera(this);
        presentadorJ = new PresentadorJuego(this);
        this.presentadorA = presentadorA;
        modeloSala=new ModeloSalaEspera();
        
    }
    
    @Override
    public void seleccionIniciar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verificaConfirmacionJugador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verificaSalaLlena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void abrirPantalla() {
       salaEspera.setVisible(true);
       salaEspera.MostrarJugador();
    }

    @Override
    public void abrirPantallaAnterior() {
      presentadorA.abrirPantalla();
      salaEspera.dispose();
    }

    @Override
    public void abrirPantallaJuego() {
       presentadorJ.abrirPantalla();
       salaEspera.dispose();
    }

    @Override
    public void recibirJugador(Jugador jugador) {
        modeloSala.setJugador(jugador);
    }

    @Override
    public Jugador regresarJugador() {
        return modeloSala.getJugador();
    }
    
}
