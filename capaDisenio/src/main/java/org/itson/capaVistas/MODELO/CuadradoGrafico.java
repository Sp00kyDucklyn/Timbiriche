/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaVistas.MODELO;

import java.awt.Color;
import java.awt.Graphics2D;
import org.itson.capadominio.Cuadro;
import org.itson.capadominio.Punto;

/**
 *
 * @author hoshi
 */
public class CuadradoGrafico implements IFiguras{
    
    private Cuadro cuadro;
    private int tamanio;
    private String letra = "";

    public CuadradoGrafico(Cuadro cuadro, int tamanio) {
        this.cuadro = cuadro;
        this.tamanio = tamanio;
    }
    
    @Override
    public void pintar(Graphics2D g2) {
        Punto puntoInicio = cuadro.getLineaArriba().getPuntoInicio();
        g2.drawString(letra, puntoInicio.getX()+(tamanio/2), puntoInicio.getY()+(tamanio/2));
//        g2.setColor(Color.red);
//        g2.drawRect(puntoInicio.getX(), puntoInicio.getY(), tamanio, tamanio);
        
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
}
