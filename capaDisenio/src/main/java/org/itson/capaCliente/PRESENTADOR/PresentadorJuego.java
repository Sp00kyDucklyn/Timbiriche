/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.VISTA.FrmJuego;

/**
 *
 * @author equipo 1
 */
public class PresentadorJuego implements IPresentadorJuego{
    
    FrmJuego vistaJuego;
    IPresentadorSalaEspera presentadorS;

    public PresentadorJuego(IPresentadorSalaEspera presentadorS) {
        vistaJuego = new FrmJuego();
        this.presentadorS = presentadorS;
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
       vistaJuego.setVisible(true);
    }
    
}
