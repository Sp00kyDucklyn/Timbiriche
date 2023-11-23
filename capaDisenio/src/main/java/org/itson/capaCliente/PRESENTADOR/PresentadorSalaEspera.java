/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.PRESENTADOR;

import SocketsCliente.Cliente;
import com.mycompany.dto.IniciarPartidaDTO;
import com.mycompany.dto.JugadorDTO;
import com.mycompany.dto.JugadoresDTO;
import java.util.ArrayList;
import java.util.List;
import observer.Observer;
import org.itson.capaCliente.MODELO.ModeloSalaEspera;
import org.itson.capaCliente.VISTA.FrmSalaEspera;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Partida;
import org.itson.capadominio.Tablero;

/**
 *
 * @author equipo 1
 */
public class PresentadorSalaEspera implements IPresentadorSalaEspera, Observer{
    
    private IPresentadorJuego presentadorJ;
    private IPresentadorAjustes presentadorA;
    private FrmSalaEspera salaEspera;
    private ModeloSalaEspera modeloSala;

    public PresentadorSalaEspera(IPresentadorAjustes presentadorA) {
        
        salaEspera = new FrmSalaEspera(this);
        presentadorJ = new PresentadorJuego(this);
        this.presentadorA = presentadorA;
        modeloSala=new ModeloSalaEspera();
        
    }
    
    @Override
    public void seleccionIniciar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verificaConfirmacionJugador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verificaSalaLlena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void abrirPantalla() {
       salaEspera.setVisible(true);
       salaEspera.MostrarJugador();
    }

    @Override
    public void abrirPantallaAnterior() {
      presentadorA.abrirPantalla();
      salaEspera.dispose();
    }

    @Override
    public void abrirPantallaJuego() {
        presentadorJ.recibirJugador(modeloSala.getJugador());
        presentadorJ.setListaJugadores(modeloSala.getJugadores());
        presentadorJ.abrirPantalla();
        salaEspera.dispose();
    }

    @Override
    public void recibirJugador(Jugador jugador) {
        modeloSala.setJugador(jugador);
    }

    @Override
    public Jugador regresarJugador() {
        return modeloSala.getJugador();
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
            modeloSala.setJugadores(jugador);
            salaEspera.MostrarJugador();
            System.out.println("me actualice");
        }
        if (object instanceof IniciarPartidaDTO) {
            Cliente cliente = Cliente.getInstance();
            cliente.agregarObserver((Observer) presentadorJ);
            IniciarPartidaDTO iniciar = (IniciarPartidaDTO) object;
            presentadorJ.crearPartida(iniciar.getNumero());
            this.abrirPantallaJuego();
        }
        if(object instanceof JugadorDTO){
            JugadorDTO jugadordeteo = (JugadorDTO) object;
            modeloSala.setJugador(modeloSala.transformarJugadorDTO(jugadordeteo));
            
        }
    }

    @Override
    public List<Jugador> regresarJugadores() {
        return modeloSala.getJugadores();
    }
}
