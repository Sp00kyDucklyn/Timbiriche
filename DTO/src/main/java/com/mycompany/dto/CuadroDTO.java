/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;
import java.io.Serializable;
import static com.mycompany.dto.EstadoCuadroDTO.INCOMPLETO;

/**
 * Clase que representa un cuadro en el juego, compuesto por cuatro líneas y un estado.
 * Es serializable para su transferencia a través de la red.
 * 
 * @author equipo 1
 */
public class CuadroDTO implements Serializable{
    private LineaDTO lineaIzquierda;
    private LineaDTO lineaDerecha;
    private LineaDTO lineaArriba;
    private LineaDTO lineaAbajo;
    private EstadoCuadroDTO estado;

    /**
     * Constructor por defecto que inicializa las líneas con valores predeterminados y el estado como INCOMPLETO.
     */
    public CuadroDTO() {
        lineaIzquierda = new LineaDTO();
        lineaDerecha = new LineaDTO();
        lineaArriba = new LineaDTO();
        lineaAbajo = new LineaDTO();
        estado = INCOMPLETO;
    }

    /**
     * Constructor que recibe las líneas y establece el estado como INCOMPLETO por defecto.
     * 
     * @param lineaIzquierda Línea izquierda del cuadro.
     * @param lineaDerecha Línea derecha del cuadro.
     * @param lineaArriba Línea superior del cuadro.
     * @param lineaAbajo Línea inferior del cuadro.
     */
    public CuadroDTO(LineaDTO lineaIzquierda, LineaDTO lineaDerecha, LineaDTO lineaArriba, LineaDTO lineaAbajo) {
        this.lineaIzquierda = lineaIzquierda;
        this.lineaDerecha = lineaDerecha;
        this.lineaArriba = lineaArriba;
        this.lineaAbajo = lineaAbajo;
    }

    /**
     * Obtiene la línea izquierda del cuadro.
     * 
     * @return Línea izquierda del cuadro.
     */
    public LineaDTO getLineaIzquierda() {
        return lineaIzquierda;
    }

    /**
     * Establece la línea izquierda del cuadro.
     * 
     * @param lineaIzquierda Línea izquierda del cuadro.
     */
    public void setLineaIzquierda(LineaDTO lineaIzquierda) {
        this.lineaIzquierda = lineaIzquierda;
    }

    /**
     * Obtiene la línea derecha del cuadro.
     * 
     * @return Línea derecha del cuadro.
     */
    public LineaDTO getLineaDerecha() {
        return lineaDerecha;
    }

    /**
     * Establece la línea derecha del cuadro.
     * 
     * @param lineaDerecha Línea derecha del cuadro.
     */
    public void setLineaDerecha(LineaDTO lineaDerecha) {
        this.lineaDerecha = lineaDerecha;
    }

    /**
     * Obtiene la línea arriba del cuadro.
     * 
     * @return Línea arriba del cuadro.
     */
    public LineaDTO getLineaArriba() {
        return lineaArriba;
    }

    /**
     * Establece la línea arriba del cuadro.
     * 
     * @param lineaArriba Línea arriba del cuadro.
     */
    public void setLineaArriba(LineaDTO lineaArriba) {
        this.lineaArriba = lineaArriba;
    }

    /**
     * Obtiene la línea abajo del cuadro.
     * 
     * @return Línea abajo del cuadro.
     */
    public LineaDTO getLineaAbajo() {
        return lineaAbajo;
    }

    /**
     * Establece la línea abajo del cuadro.
     * 
     * @param lineaAbajo Línea abajo del cuadro.
     */
    public void setLineaAbajo(LineaDTO lineaAbajo) {
        this.lineaAbajo = lineaAbajo;
    }

    /**
     * Obtiene el estado actual del cuadro.
     * 
     * @return Estado actual del cuadro.
     */
    public EstadoCuadroDTO getEstado() {
        return estado;
    }

    /**
     * Establece el estado del cuadro.
     * 
     * @param estado Estado a establecer para el cuadro.
     */
    public void setEstado(EstadoCuadroDTO estado) {
        this.estado = estado;
    }
    
}
