/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase TableroDTO representa un tablero de juego.
 * Contiene listas de cuadros, líneas horizontales, líneas verticales y puntos en el tablero.
 * Implementa la interfaz Serializable para permitir su serialización.
 * 
 * @author equipo 1
 */
public class TableroDTO implements Serializable{
    
    /** Lista de cuadros en el tablero */
    private List<CuadroDTO> cuadraditoDTO;

    /** Lista de líneas horizontales en el tablero */
    private List<LineaDTO> lineasHDTO;

    /** Lista de líneas verticales en el tablero */
    private List<LineaDTO> lineasVDTO;

    /** Lista de puntos en el tablero */
    private List<PuntoDTO> puntitosDTO;
   
    /**
     * Constructor por defecto de TableroDTO.
     * Inicializa todas las listas del tablero como nuevas listas vacías.
     */
    public TableroDTO() {
        cuadraditoDTO = new ArrayList<>();
        lineasHDTO = new ArrayList<>();
        lineasVDTO = new ArrayList<>();
        puntitosDTO = new ArrayList<>();
    }

    /**
     * Constructor con parámetros de TableroDTO.
     * 
     * @param cuadraditoDTO Lista de cuadros en el tablero
     * @param lineasHDTO Lista de líneas horizontales en el tablero
     * @param lineasVDTO Lista de líneas verticales en el tablero
     * @param puntitosDTO Lista de puntos en el tablero
     */
    public TableroDTO(List<CuadroDTO> cuadraditoDTO, List<LineaDTO> lineasHDTO, List<LineaDTO> lineasVDTO, List<PuntoDTO> puntitosDTO) {
        this.cuadraditoDTO = cuadraditoDTO;
        this.lineasHDTO = lineasHDTO;
        this.lineasVDTO = lineasVDTO;
        this.puntitosDTO = puntitosDTO;
    }

    // Métodos para obtener y establecer los atributos de la clase

    /**
     * Obtiene la lista de cuadros en el tablero.
     * 
     * @return Lista de cuadros en el tablero
     */
    public List<CuadroDTO> getCuadraditoDTO() {
        return cuadraditoDTO;
    }

    /**
     * Establece la lista de cuadros en el tablero.
     * 
     * @param cuadraditoDTO Lista de cuadros en el tablero
     */
    public void setCuadraditoDTO(List<CuadroDTO> cuadraditoDTO) {
        this.cuadraditoDTO = cuadraditoDTO;
    }

    /**
     * Obtiene la lista de líneas horizontales en el tablero.
     * 
     * @return Lista de líneas horizontales en el tablero
     */
    public List<LineaDTO> getLineasHDTO() {
        return lineasHDTO;
    }

    /**
     * Establece la lista de líneas horizontales en el tablero.
     * 
     * @param lineasHDTO Lista de líneas horizontales en el tablero
     */
    public void setLineasHDTO(List<LineaDTO> lineasHDTO) {
        this.lineasHDTO = lineasHDTO;
    }

    /**
     * Obtiene la lista de líneas verticales en el tablero.
     * 
     * @return Lista de líneas verticales en el tablero
     */
    public List<LineaDTO> getLineasVDTO() {
        return lineasVDTO;
    }

    /**
     * Establece la lista de líneas verticales en el tablero.
     * 
     * @param lineasVDTO Lista de líneas verticales en el tablero
     */
    public void setLineasVDTO(List<LineaDTO> lineasVDTO) {
        this.lineasVDTO = lineasVDTO;
    }

    /**
     * Obtiene la lista de puntos en el tablero.
     * 
     * @return Lista de puntos en el tablero
     */
    public List<PuntoDTO> getPuntitosDTO() {
        return puntitosDTO;
    }

    /**
     * Establece la lista de puntos en el tablero.
     * 
     * @param puntitosDTO Lista de puntos en el tablero
     */
    public void setPuntitosDTO(List<PuntoDTO> puntitosDTO) {
        this.puntitosDTO = puntitosDTO;
    }
}
