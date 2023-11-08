/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.VISTA.FrmUnirseSala;

/**
 *
 * @author equipo 1
 */
public class PresentadorUnirseSala implements IPresentadorUnirseSala{
    
    FrmUnirseSala unirse;
    IPresentadorMenuPrincipal presentadorM;
    IPresentadorAjustes presentadorA;

    public PresentadorUnirseSala(IPresentadorMenuPrincipal presentadorM) {
        unirse = new FrmUnirseSala(this);
        this.presentadorM = presentadorM;
    }
    
    

    @Override
    public void ingresarCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void seleccionSigAjustes() {
        presentadorA.abrirPantalla();
        unirse.dispose();
    }

    @Override
    public void abrirPantalla() {
       unirse.setVisible(true);
    }

    @Override
    public void regresarMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
