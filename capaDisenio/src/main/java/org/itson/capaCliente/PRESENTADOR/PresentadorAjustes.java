/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.MODELO.ModeloAjustes;
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
    ModeloAjustes modeloA;

    public PresentadorAjustes(IPresentadorCrearSala presentadorC){
        modeloA= new ModeloAjustes();
        vistaAjustes = new FrmAjustes(this);
        this.presentadorC = presentadorC;
        presentadorS = new PresentadorSalaEspera(this);
    }

    public PresentadorAjustes(IPresentadorUnirseSala presentadorU) {
        this.presentadorU = presentadorU;
        presentadorS = new PresentadorSalaEspera(this);
        vistaAjustes = new FrmAjustes(this);
        modeloA= new ModeloAjustes();
    }
    
    

    @Override
    public void seleccionSigSalaEspera() {
        this.enviarJugador();
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

    
    @Override
    public void crearJugador(String color, String nombre, String avatar) {
        modeloA.crearJugador(color, nombre, avatar);
        this.seleccionSigSalaEspera();
    }

    @Override
    public void enviarJugador() {
        presentadorS.recibirJugador(modeloA.getJugador());
    }
    
}
