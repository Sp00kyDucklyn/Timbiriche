/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.VISTA.FrmCrearSala;

/**
 *
 * @author equipo 1
 */
public class PresentadorCrearSala implements IPresentadorCrearSala{
    
    FrmCrearSala vistaCrear;
    IPresentadorMenuPrincipal presentadorM;
    IPresentadorAjustes presentadorA;

    public PresentadorCrearSala(IPresentadorMenuPrincipal presentadorM) {
        this.presentadorM = presentadorM;
        presentadorA = new PresentadorAjustes(this);
        vistaCrear = new FrmCrearSala(this);
    }
    
    @Override
    public void seleccionarCantJugadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void seleccionCrearJuego() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apareceSigAjustes() {
        presentadorA.abrirPantalla();
        vistaCrear.dispose();
    }

    @Override
    public void abrirPantalla() {
        vistaCrear.setVisible(true);
    }

    @Override
    public void regresarMenu() {
       presentadorM.abrirMenuVista();
       vistaCrear.dispose();
    }
    
}
