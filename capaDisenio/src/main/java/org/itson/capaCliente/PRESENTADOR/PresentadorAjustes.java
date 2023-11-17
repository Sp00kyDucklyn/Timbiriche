/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.MODELO.ModeloAjustes;
import org.itson.capaCliente.VISTA.FrmAjustes;
import org.itson.capadominio.Partida;
import org.itson.capadominio.Tablero;

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

//    public PresentadorAjustes(IPresentadorUnirseSala presentadorU) {
//        this.presentadorU = presentadorU;
//        presentadorS = new PresentadorSalaEspera(this);
//        vistaAjustes = new FrmAjustes(this);
//        modeloA= new ModeloAjustes();
//    }
//    
    

    @Override
    public void seleccionSigSalaEspera() {
        presentadorS.recibirJugador(modeloA.getJugador());
        presentadorS.recibirPartida(modeloA.getPartida());
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
    public Partida regresarPartida() {
        return modeloA.getPartida();
    }

    @Override
    public void recibirPartida(Partida partida) {
        modeloA.setPartida(partida);
    }
}
