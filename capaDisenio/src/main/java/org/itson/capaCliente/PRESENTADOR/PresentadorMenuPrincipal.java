/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.VISTA.FrmMenuPrincipal;

/**
 *
 * @author equipo 1
 */
public class PresentadorMenuPrincipal implements IPresentadorMenuPrincipal{
    
    IPresentadorCrearSala presentadorC;
    IPresentadorUnirseSala presentadorU;
    FrmMenuPrincipal vistaMenu;

    public PresentadorMenuPrincipal() {
        this.vistaMenu = new FrmMenuPrincipal(this);
        this.presentadorC = new PresentadorCrearSala(this);
        this.presentadorU = new PresentadorUnirseSala(this);
    }

    @Override
    public void activarBtnCrear() {
        presentadorC.abrirPantalla();
        vistaMenu.dispose();
    }

    @Override
    public void abrirMenuVista() {
       vistaMenu.setVisible(true);
    }

    @Override
    public void activarBtnUnirse() {
      //presentadorU.abrirPantalla();
      presentadorU.seleccionSigAjustes();
      vistaMenu.dispose();
    }

    @Override
    public void salirPantalla() {
       vistaMenu.dispose();
    }
    
    
    
}
