/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import com.mycompany.dto.IniciarPartidaDTO;
import com.mycompany.dto.JugadorDTO;
import com.mycompany.dto.JugadoresDTO;
import com.mycompany.dto.MovimientoDTO;
import java.util.ArrayList;
import java.util.List;
import observer.Observer;
import org.itson.capaCliente.MODELO.ModeloJuego;
import org.itson.capaCliente.MODELO.ModeloSalaEspera;
import org.itson.capaCliente.VISTA.FrmJuego;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Linea;
import org.itson.capadominio.Partida;
import org.itson.capadominio.Tablero;

/**
 *
 * @author equipo 1
 */
public class PresentadorJuego implements IPresentadorJuego, Observer{
    
    private FrmJuego vistaJuego;
    private IPresentadorSalaEspera presentadorS;
    private ModeloJuego modeloJ;

    public PresentadorJuego(IPresentadorSalaEspera presentadorS) {
        vistaJuego = new FrmJuego(this);
        this.presentadorS = presentadorS;
        this.modeloJ = new ModeloJuego();
    }
    

    @Override
    public void colocaLinea(Linea linea, Jugador jugador) {
        modeloJ.colocarLinea(linea, jugador);
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
       vistaJuego.setJugador(modeloJ.getJugador());
       vistaJuego.mandarTablero();
       vistaJuego.setVisible(true);
       
    }

    @Override
    public void recibirJugador(Jugador jugador) {
        modeloJ.setJugador(jugador);
    }

    @Override
    public Tablero regresarTablero() {
        return modeloJ.getTablero();
    }

    @Override
    public Partida regresarPartida() {
        return modeloJ.getPartida();
    }


    @Override
    public void update(Object object) {
        if(object instanceof JugadoresDTO){
            
            JugadoresDTO jugadoresdeteo = (JugadoresDTO) object;
            List<JugadorDTO> jugadordto = jugadoresdeteo.getJugadorDTO();
            List<Jugador> jugador = new ArrayList<>();
            for (int i = 0; i < jugadordto.size(); i++) {
                Jugador juga = new Jugador();
                juga.setCodigoExclusivo(jugadordto.get(i).getCodigoExclusivo());
                juga.setAvatar(jugadordto.get(i).getAvatar());
                juga.setColor(jugadordto.get(i).getColor());
                juga.setNombre(jugadordto.get(i).getNombre());
                jugador.add(juga);
            }
            modeloJ.setJugadores(jugador);
            vistaJuego.setListaJugadores(jugador);
            System.out.println("me actualice");
        }
        if(object instanceof MovimientoDTO){
            System.out.println("paso por aqui");
            MovimientoDTO movimientodeteo = (MovimientoDTO) object;
            System.out.println("hola"+movimientodeteo.getJugador());
            Jugador jugador = modeloJ.transformarJugadorDTO(movimientodeteo.getJugador());
            Linea linea = modeloJ.transformarLineaDTO(movimientodeteo.getLinea());
            vistaJuego.colocarLinea(linea, jugador);
            pasarTurno();
        }
    }

    @Override
    public void crearPartida(int numero) {
        modeloJ.crearPartida(numero);
    }

    @Override
    public void setListaJugadores(List<Jugador> jugadores) {
        vistaJuego.setListaJugadores(jugadores);
        modeloJ.setJugadores(jugadores);
    }

    @Override
    public void pasarTurno() {
        modeloJ.pasarTurno();
    }

    @Override
    public Jugador getJugadorTurno() {
      return  modeloJ.getJugadorTurno();
    }

    @Override
    public boolean esTurno() {
      return modeloJ.esTurno();
    }
    
}
