/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author equipo 1
 */
public class TableroDTO {
    
    // Lista de cuadros en el tablero
    private List<CuadroDTO> cuadraditoDTO;

    // Lista de líneas horizontales en el tablero
    private List<LineaDTO> lineasHDTO;

    // Lista de líneas verticales en el tablero
    private List<LineaDTO> lineasVDTO;

    // Lista de puntos en el tablero
    private List<PuntoDTO> puntitosDTO;
   
    public TableroDTO() {
        cuadraditoDTO = new ArrayList<>();
        lineasHDTO = new ArrayList<>();
        lineasVDTO = new ArrayList<>();
        puntitosDTO = new ArrayList<>();
    }

    public TableroDTO(List<CuadroDTO> cuadraditoDTO, List<LineaDTO> lineasHDTO, List<LineaDTO> lineasVDTO, List<PuntoDTO> puntitosDTO) {
        this.cuadraditoDTO = cuadraditoDTO;
        this.lineasHDTO = lineasHDTO;
        this.lineasVDTO = lineasVDTO;
        this.puntitosDTO = puntitosDTO;
    }

    public List<CuadroDTO> getCuadraditoDTO() {
        return cuadraditoDTO;
    }

    public void setCuadraditoDTO(List<CuadroDTO> cuadraditoDTO) {
        this.cuadraditoDTO = cuadraditoDTO;
    }

    public List<LineaDTO> getLineasHDTO() {
        return lineasHDTO;
    }

    public void setLineasHDTO(List<LineaDTO> lineasHDTO) {
        this.lineasHDTO = lineasHDTO;
    }

    public List<LineaDTO> getLineasVDTO() {
        return lineasVDTO;
    }

    public void setLineasVDTO(List<LineaDTO> lineasVDTO) {
        this.lineasVDTO = lineasVDTO;
    }

    public List<PuntoDTO> getPuntitosDTO() {
        return puntitosDTO;
    }

    public void setPuntitosDTO(List<PuntoDTO> puntitosDTO) {
        this.puntitosDTO = puntitosDTO;
    }

    
    
  

    
}
