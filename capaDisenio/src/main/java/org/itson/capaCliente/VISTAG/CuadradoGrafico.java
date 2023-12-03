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
 * Clase CuadradoGrafico: Representa un cuadrado gráfico con información adicional como una letra.
 * La clase implementa la interfaz IFiguras para permitir el pintado gráfico.
 * 
 * @author equipo 1
 */
public class CuadradoGrafico implements IFiguras {

    private Cuadro cuadro;  // Referencia al objeto Cuadro asociado al cuadrado gráfico
    private int tamanio;    // Tamaño del cuadrado gráfico
    private String letra = "";  // Información adicional representada por una letra

    /**
     * Constructor de la clase CuadradoGrafico.
     * 
     * @param cuadro Objeto Cuadro asociado al cuadrado gráfico.
     * @param tamanio Tamaño del cuadrado gráfico.
     */
    public CuadradoGrafico(Cuadro cuadro, int tamanio) {
        this.cuadro = cuadro;
        this.tamanio = tamanio;
    }

    /**
     * Método para pintar el cuadrado gráfico en un contexto gráfico (Graphics2D).
     * 
     * @param g2 Contexto gráfico en el que se pintará el cuadrado.
     */
    @Override
    public void pintar(Graphics2D g2) {
        Punto puntoInicio = cuadro.getLineaArriba().getPuntoInicio();
        if (tamanio == 50) {
            g2.drawString(letra, puntoInicio.getX() + (tamanio / 2), (float) (puntoInicio.getY() + (tamanio / 2)));
        } else if (tamanio == 25) {
            g2.drawString(letra, puntoInicio.getX() + (tamanio / 3), (float) (puntoInicio.getY() + (tamanio / 1.5)));
        } else if (tamanio == 15) {
            g2.drawString(letra, (puntoInicio.getX() + (tamanio / 2)), (float) (puntoInicio.getY() + (tamanio / 1.5)));
        }
        // Se ha comentado el código de dibujo del contorno del cuadrado
        // para centrarse en la representación de la letra.

        // Código original para dibujar el contorno del cuadrado (descomentar si es necesario)
        // g2.setColor(Color.red);
        // g2.drawRect(puntoInicio.getX(), puntoInicio.getY(), tamanio, tamanio);
    }

    // Métodos getters y setters para acceder a las propiedades de la clase

    /**
     * 
     * @return 
     */
    public Cuadro getCuadro() {
        return cuadro;
    }

    /**
     * 
     * @param cuadro 
     */
    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }

    /**
     * 
     * @return 
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * 
     * @param tamanio 
     */
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * 
     * @return 
     */
    public String getLetra() {
        return letra;
    }

    /**
     * 
     * @param letra 
     */
    public void setLetra(String letra) {
        this.letra = letra;
    }
}
