/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import java.util.List;
import org.itson.capaCliente.MODELO.ModeloSalaPuntuacion;
import org.itson.capaCliente.VISTA.FrmSalaPuntuacion;
import org.itson.capadominio.Jugador;

/**
 *
 * @author equipo 1
 */
public class PresentadorSalaPuntaje implements IPresentadorSalaPuntaje{
    
    FrmSalaPuntuacion vistaS;
    IPresentadorJuego presentadorJ;
    IPresentadorMenuPrincipal presentadorM;
    ModeloSalaPuntuacion modeloSP;

    public PresentadorSalaPuntaje(IPresentadorJuego presentadorJ) {
        this.presentadorJ = presentadorJ;
        this.presentadorM = presentadorM;
        vistaS = new FrmSalaPuntuacion(this);
        modeloSP = new ModeloSalaPuntuacion();
    }
 
    @Override
    public void terminarPartida() {
       presentadorM.abrirMenuVista();
       vistaS.dispose();
    }

    @Override
    public void abrirPantalla() {
        vistaS.setVisible(true);
    }

    @Override
    public List<Jugador> regresarJugadores() {
        return modeloSP.getJugadores();
    }

    @Override
    public void setListaJugadores(List<Jugador> jugadores) {
        modeloSP.setJugadores(jugadores);
    }
    
    
}
