/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;
import java.io.Serializable;
import static com.mycompany.dto.EstadoCuadroDTO.INCOMPLETO;

/**
 *
 * @author equipo 1
 */
public class CuadroDTO {
    private LineaDTO lineaIzquierda;
    private LineaDTO lineaDerecha;
    private LineaDTO lineaArriba;
    private LineaDTO lineaAbajo;
    private EstadoCuadroDTO estado;

    public CuadroDTO() {
        lineaIzquierda = new LineaDTO();
        lineaDerecha = new LineaDTO();
        lineaArriba = new LineaDTO();
        lineaAbajo = new LineaDTO();
        estado = INCOMPLETO;
    }

    public CuadroDTO(LineaDTO lineaIzquierda, LineaDTO lineaDerecha, LineaDTO lineaArriba, LineaDTO lineaAbajo) {
        this.lineaIzquierda = lineaIzquierda;
        this.lineaDerecha = lineaDerecha;
        this.lineaArriba = lineaArriba;
        this.lineaAbajo = lineaAbajo;
    }

    public LineaDTO getLineaIzquierda() {
        return lineaIzquierda;
    }

    public void setLineaIzquierda(LineaDTO lineaIzquierda) {
        this.lineaIzquierda = lineaIzquierda;
    }

    public LineaDTO getLineaDerecha() {
        return lineaDerecha;
    }

    public void setLineaDerecha(LineaDTO lineaDerecha) {
        this.lineaDerecha = lineaDerecha;
    }

    public LineaDTO getLineaArriba() {
        return lineaArriba;
    }

    public void setLineaArriba(LineaDTO lineaArriba) {
        this.lineaArriba = lineaArriba;
    }

    public LineaDTO getLineaAbajo() {
        return lineaAbajo;
    }

    public void setLineaAbajo(LineaDTO lineaAbajo) {
        this.lineaAbajo = lineaAbajo;
    }

    public EstadoCuadroDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoCuadroDTO estado) {
        this.estado = estado;
    }
    
}
