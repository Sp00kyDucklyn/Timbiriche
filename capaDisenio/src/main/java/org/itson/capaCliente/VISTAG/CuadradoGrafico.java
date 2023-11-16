/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.VISTAG;

import java.awt.Color;
import java.awt.Graphics2D;
import org.itson.capadominio.Cuadro;
import org.itson.capadominio.Punto;

/**
 *
 * @author equipo 1
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
        if(tamanio == 50){
            g2.drawString(letra, puntoInicio.getX()+(tamanio/2),(float)(puntoInicio.getY()+(tamanio/2)));
        }else if(tamanio == 25){
            g2.drawString(letra, puntoInicio.getX()+(tamanio/3),(float)(puntoInicio.getY()+(tamanio/1.5)));
        }else if(tamanio == 15){
            g2.drawString(letra, (puntoInicio.getX()+(tamanio/2)),(float)(puntoInicio.getY()+(tamanio/1.5)));
        }
        
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
