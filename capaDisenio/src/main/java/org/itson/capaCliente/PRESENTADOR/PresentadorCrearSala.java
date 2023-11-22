/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import org.itson.capaCliente.MODELO.ModeloCrearSala;
import org.itson.capaCliente.VISTA.FrmCrearSala;
import org.itson.capadominio.Partida;
import org.itson.capadominio.Tablero;

/**
 *
 * @author equipo 1
 */
public class PresentadorCrearSala implements IPresentadorCrearSala{
    
    FrmCrearSala vistaCrear;
    IPresentadorMenuPrincipal presentadorM;
    IPresentadorAjustes presentadorA;
    ModeloCrearSala modeloC;

    public PresentadorCrearSala(IPresentadorMenuPrincipal presentadorM) {
        this.presentadorM = presentadorM;
        modeloC = new ModeloCrearSala();
        presentadorA = new PresentadorAjustes(this);
        vistaCrear = new FrmCrearSala(this);
    }
    
    @Override
    public void seleccionarCantJugadores() {
        
    }

    @Override
    public void crearCodigo() {
        
    }

    @Override
    public void apareceSigAjustes() {
//        presentadorA.recibirPartida(modeloC.getPartida());
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

    @Override
    public void crearPartida(int numero) {
        modeloC.crearPartida(numero);
        this.apareceSigAjustes();
    }
    


}
