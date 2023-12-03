/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.VISTAG;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import org.itson.capaCliente.MODELO.ModeloJuego;
import org.itson.capadominio.Cuadro;
import static org.itson.capadominio.EstadoCuadro.COMPLETO;
import static org.itson.capadominio.EstadoCuadro.RECLAMADO;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Linea;
import org.itson.capadominio.Tablero;

/**
 * Clase TableroGrafico: Representa gráficamente el tablero de juego. Extiende
 * JPanel y maneja la lógica de pintado y eventos del tablero.
 *
 * @author equipo 1
 */
public class TableroGrafico extends JPanel {

    private FigurasGraficas figuras;
    private List<Jugador> jugadores;
    private Jugador jugador;
    private Tablero tablero;

    /**
     * Método paintComponent: Sobrescrito de JPanel para realizar el pintado de
     * las figuras.
     *
     * @param g Objeto Graphics para realizar el pintado.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        pintarFiguras(g2);
    }

    /**
     * Constructor de la clase TableroGrafico.
     *
     * @param tablero Tablero asociado al juego.
     */
    public TableroGrafico(Tablero tablero) {
        jugadores = new ArrayList<>();
        figuras = new FigurasGraficas();
        this.tablero = tablero;
    }

    /**
     * Método crearTableroGrafico: Crea las figuras gráficas basadas en el
     * tablero del juego.
     */
    public void crearTableroGrafico() {
        if (this.getTablero() != null) {
            int margen = 0;
            if (this.getTablero().getPuntitos().size() == 100) {
                margen = 50;

            } else if (this.getTablero().getPuntitos().size() == 400) {
                margen = 25;

            } else if (this.getTablero().getPuntitos().size() == 1600) {
                margen = 15;
            }

            for (int i = 0; i < this.getTablero().getPuntitos().size(); i++) {
                IFiguras puntito = new PuntoGrafico(this.getTablero().getPuntitos().get(i));
                figuras.agregarLista(puntito);
            }
            for (int i = 0; i < this.getTablero().getLineasH().size(); i++) {
                IFiguras lineaH = new LineaGrafica(this.getTablero().getLineasH().get(i));
                figuras.agregarLista(lineaH);
            }
            for (int i = 0; i < this.getTablero().getLineasV().size(); i++) {
                IFiguras lineaV = new LineaGrafica(this.getTablero().getLineasV().get(i));
                figuras.agregarLista(lineaV);
            }
            for (int i = 0; i < this.getTablero().getCuadradito().size(); i++) {
                IFiguras cuadrados = new CuadradoGrafico(this.getTablero().getCuadradito().get(i), margen);
                figuras.agregarLista(cuadrados);
            }
        }
    }

    /**
     * Pinta las figuras gráficas en el contexto gráfico proporcionado.
     *
     * @param g2 Contexto gráfico en el que se pintarán las figuras.
     */
    public void pintarFiguras(Graphics2D g2) {
        figuras.pintar(g2);
    }

    /**
     * Pinta una línea de color rosa cuando se pasa sobre ella con el ratón.
     *
     * @param evt Evento del ratón que desencadena la acción.
     */
    public void pintarLineaPanthom(MouseEvent evt) {
        boolean linea = false;
        for (IFiguras figura : figuras.getFiguras()) {
            if (figura instanceof LineaGrafica) {
                LineaGrafica lineaG = (LineaGrafica) figura;
                if (lineaG.getLinea().getJugador() == null) {
                    if (lineaG.hitBox().contains(evt.getPoint())) {
                        if (linea) {
                            lineaG.setColor(Color.BLACK);
                            this.repaint();
                        } else {
                            linea = true;
                            lineaG.setColor(Color.PINK);
                            this.repaint();
                        }
                    } else {
                        lineaG.setColor(Color.BLACK);
                        this.repaint();
                    }
                }
            }
        }
    }

    /**
     * Verifica y devuelve una línea en la posición del evento del ratón.
     *
     * @param evt Evento del ratón que desencadena la acción.
     * @return Línea encontrada en la posición del evento o null si no se
     * encuentra.
     */
    public Linea verificarLinea(MouseEvent evt) {
        boolean linea = false;
        for (IFiguras figura : figuras.getFiguras()) {
            if (figura instanceof LineaGrafica) {
                LineaGrafica lineaG = (LineaGrafica) figura;
                if (lineaG.hitBox().contains(evt.getPoint())) {
                    if (lineaG.getLinea().getJugador() == null) {
                        if (!linea) {
                            linea = true;
                            return lineaG.getLinea();
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * Coloca una línea en el tablero y actualiza la información del jugador.
     *
     * @param linea Línea a colocar en el tablero.
     * @param jugador Jugador asociado a la línea.
     */
    public void colocarLinea(Linea linea, Jugador jugador) {
        for (IFiguras figura : figuras.getFiguras()) {
            if (figura instanceof LineaGrafica) {
                LineaGrafica lineaG = (LineaGrafica) figura;
                if (validarLinea(lineaG.getLinea(), linea)) {
                    lineaG.getLinea().setJugador(jugador);
                    lineaG.setColor(Color.decode(jugador.getColor()));
                }
                verificarCuadro(jugador);
            }
        }
        for (Jugador jugadore : jugadores) {
            if (jugador.getCodigoExclusivo() == jugadore.getCodigoExclusivo()) {
                List<Linea> lineas = jugadore.getLineas();
                lineas.add(linea);
                jugadore.setLineas(lineas);
            }
        }
    }

    /**
     * Valida si dos líneas son iguales comparando sus puntos de inicio y fin.
     *
     * @param lineaA Primera línea a comparar.
     * @param lineaB Segunda línea a comparar.
     * @return true si las líneas son iguales, false en caso contrario.
     */
    public boolean validarLinea(Linea lineaA, Linea lineaB) {
        int x1 = lineaA.getPuntoInicio().getX();
        int x2 = lineaA.getPuntoFin().getX();
        int x3 = lineaB.getPuntoInicio().getX();
        int x4 = lineaB.getPuntoFin().getX();

        int y1 = lineaA.getPuntoInicio().getY();
        int y2 = lineaA.getPuntoFin().getY();
        int y3 = lineaB.getPuntoInicio().getY();
        int y4 = lineaB.getPuntoFin().getY();

        return (x1 == x3 && y1 == y3 && x2 == x4 && y2 == y4);
    }

    /**
     * Verifica si se ha completado un cuadro en el tablero y actualiza la
     * puntuación del jugador.
     *
     * @param jugador Jugador cuya puntuación se actualiza.
     */
    public void verificarCuadro(Jugador jugador) {
        int recla = 0;
        for (IFiguras figurita : figuras.getFiguras()) {
            if (figurita instanceof CuadradoGrafico) {
                CuadradoGrafico cuadroG = (CuadradoGrafico) figurita;
                Cuadro cuadro = cuadroG.getCuadro();
                if (cuadro.getEstado() == COMPLETO) {
                    jugador.setPuntaje(50);
                    cuadro.setEstado(RECLAMADO);
                    cuadroG.setLetra(jugador.getNombre().substring(0, 1).toUpperCase());
                    recla++;
                }
            }
        }

        for (int i = 0; i < recla; i++) {
            for (Jugador jugadorEncontrado : jugadores) {
                if (jugador.getCodigoExclusivo() == jugadorEncontrado.getCodigoExclusivo()) {
                    jugadorEncontrado.setPuntaje(jugadorEncontrado.getPuntaje() + jugador.getPuntaje());
                }
            }
        }
    }

    /**
     * Verifica si algún cuadro ha sido reclamado en el tablero.
     */
    public void verificarReclamado() {
        // Implementación de la lógica para verificar si algún cuadro ha sido reclamado
        // y realizar las acciones correspondientes.
    }

    /**
     * Obtiene el objeto Tablero asociado a la instancia.
     *
     * @return Objeto Tablero asociado.
     */
    public Tablero getTablero() {
        return tablero;
    }

    /**
     * Establece el objeto Tablero asociado a la instancia.
     *
     * @param tablero Nuevo objeto Tablero a asociar.
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    /**
     * Obtiene la lista de jugadores asociada a la instancia.
     *
     * @return Lista de jugadores asociada.
     */
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * Establece la lista de jugadores asociada a la instancia.
     *
     * @param jugadores Nueva lista de jugadores a asociar.
     */
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * Obtiene el objeto Jugador asociado a la instancia.
     *
     * @return Objeto Jugador asociado.
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Establece el objeto Jugador asociado a la instancia.
     *
     * @param jugador Nuevo objeto Jugador a asociar.
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

}
