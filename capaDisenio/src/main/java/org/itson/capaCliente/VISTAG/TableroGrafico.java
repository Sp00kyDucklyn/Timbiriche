/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.VISTAG;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import org.itson.capaCliente.MODELO.ModeloJuego;
import org.itson.capadominio.Cuadro;
import static org.itson.capadominio.EstadoCuadro.COMPLETO;
import static org.itson.capadominio.EstadoCuadro.RECLAMADO;
import org.itson.capadominio.Jugador;
import org.itson.capadominio.Linea;
import org.itson.capadominio.Tablero;

/**
 *
 * @author equipo 1
 */
public class TableroGrafico extends JPanel{

    private FigurasGraficas figuras;
    private Jugador jugador;
    private Tablero tablero;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
        pintarFiguras(g2);
    }
    
    public TableroGrafico(Tablero tablero, Jugador jugador) {
      this.jugador = jugador;
      figuras = new FigurasGraficas();
      System.out.println(jugador);
    }
    
    public void crearTableroGrafico(){
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
    
    public void pintarFiguras(Graphics2D g2){
        figuras.pintar(g2);
    }
    
    public void pintarLineaPanthom(MouseEvent evt){
        boolean linea = false;
        for (IFiguras figura : figuras.getFiguras()) {
            if(figura instanceof LineaGrafica){
                LineaGrafica lineaG = (LineaGrafica)figura;
                if (lineaG.getLinea().getJugador() == null) {
                    if (lineaG.hitBox().contains(evt.getPoint())) {
                        if (linea){
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

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
        
    public void verificarLinea(MouseEvent evt){
        boolean linea = false;
         for (IFiguras figura : figuras.getFiguras()) {
            if(figura instanceof LineaGrafica){
                LineaGrafica lineaG = (LineaGrafica)figura;
                if(lineaG.hitBox().contains(evt.getPoint())){
                    if(lineaG.getLinea().getJugador() == null){
                        if (!linea){
                             linea = true;
                             colocarLinea(lineaG.getLinea(),jugador);
                        }
                    }
                }else{
                    
                }
            }
        }
    }
    
    public void colocarLinea(Linea linea, Jugador jugador){
         for (IFiguras figura : figuras.getFiguras()) {
            if(figura instanceof LineaGrafica){
                LineaGrafica lineaG = (LineaGrafica)figura;
                if (lineaG.getLinea() == linea) {
                    lineaG.getLinea().setJugador(jugador);
                    lineaG.setColor(Color.decode(jugador.getColor()));
                }
                    verificarCuadro(jugador);
            }
        }
    }
    
    public void verificarCuadro(Jugador jugador){
         for (IFiguras figurita : figuras.getFiguras()) {
                    if(figurita instanceof CuadradoGrafico){
                        CuadradoGrafico cuadroG = (CuadradoGrafico)figurita;
                        Cuadro cuadro = cuadroG.getCuadro();
                        if(cuadro.getEstado() == COMPLETO){
                            jugador.setPuntaje(50);
                            cuadro.setEstado(RECLAMADO);
                            cuadroG.setLetra(jugador.getNombre().substring(0, 1).toUpperCase());
                        }
                    }
                }
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
}
