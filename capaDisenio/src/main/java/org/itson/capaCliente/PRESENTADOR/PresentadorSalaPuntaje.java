/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.VISTA.FrmSalaPuntuacion;

/**
 *
 * @author hoshi
 */
public class PresentadorSalaPuntaje implements IPresentadorSalaPuntaje{
    
    FrmSalaPuntuacion vistaS;
    IPresentadorJuego presentadorJ;
    IPresentadorMenuPrincipal presentadorM;

    public PresentadorSalaPuntaje(IPresentadorJuego presentadorJ,IPresentadorMenuPrincipal presentadorM) {
        this.presentadorJ = presentadorJ;
        this.presentadorM = presentadorM;
        vistaS = new FrmSalaPuntuacion(this);
    }
    
    
    

    @Override
    public void terminarPartida() {
       presentadorM.abrirMenuVista();
       vistaS.dispose();
    }

    @Override
    public void jugarOtraVez() {
        presentadorJ.abrirPantalla();
        vistaS.dispose();
    }

    @Override
    public void abrirPantalla() {
        vistaS.setVisible(true);
    }
    
}
