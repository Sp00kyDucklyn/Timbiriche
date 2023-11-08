/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.VISTA.FrmAjustes;

/**
 *
 * @author equipo 1
 */
public class PresentadorAjustes implements IPresentadorAjustes{
    
    IPresentadorCrearSala presentadorC;
    IPresentadorUnirseSala presentadorU;
    IPresentadorSalaEspera presentadorS;
    FrmAjustes vistaAjustes;

    public PresentadorAjustes(IPresentadorCrearSala presentadorC){
        
        vistaAjustes = new FrmAjustes(this);
        this.presentadorC = presentadorC;
        presentadorS = new PresentadorSalaEspera(this);
    }

    public PresentadorAjustes(IPresentadorUnirseSala presentadorU) {
        this.presentadorU = presentadorU;
        presentadorS = new PresentadorSalaEspera(this);
        vistaAjustes = new FrmAjustes(this);
    }
    
    

    @Override
    public void seleccionColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void seleccionAvatar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nombreJugador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void seleccionSigSalaEspera() {
        presentadorS.abrirPantalla();
        vistaAjustes.dispose();
    }

    @Override
    public void btnRegresarCrearSala() {
       presentadorC.abrirPantalla();
       vistaAjustes.dispose();
    }

    @Override
    public void btnRegresarUnirseSala() {
       presentadorU.abrirPantalla();
       vistaAjustes.dispose();
    }

    @Override
    public void abrirPantalla() {
        vistaAjustes.setVisible(true);
    }
    
}
