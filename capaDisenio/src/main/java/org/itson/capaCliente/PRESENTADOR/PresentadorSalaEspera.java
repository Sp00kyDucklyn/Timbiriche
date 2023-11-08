/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.VISTA.FrmSalaEspera;

/**
 *
 * @author equipo 1
 */
public class PresentadorSalaEspera implements IPresentadorSalaEspera{
    
    IPresentadorJuego presentadorJ;
    IPresentadorAjustes presentadorA;
    FrmSalaEspera salaEspera;

    public PresentadorSalaEspera(IPresentadorAjustes presentadorA) {
        
        salaEspera = new FrmSalaEspera(this);
        presentadorJ = new PresentadorJuego(this);
        this.presentadorA = presentadorA;
        
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
    
}
