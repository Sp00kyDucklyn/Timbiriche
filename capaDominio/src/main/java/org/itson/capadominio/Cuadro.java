/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capadominio;

import static org.itson.capadominio.EstadoCuadro.COMPLETO;
import static org.itson.capadominio.EstadoCuadro.INCOMPLETO;
import static org.itson.capadominio.EstadoCuadro.RECLAMADO;

/**
 *
 * @author equipo 1
 */
/**
 * La clase Cuadro representa un elemento de un juego. En este contexto, un
 * cuadro es un elemento que consta de cuatro líneas (izquierda, derecha, arriba
 * y abajo) y puede estar en uno de tres estados posibles: INCOMPLETO, COMPLETO
 * o RECLAMADO.
 */
public class Cuadro {

    /**
     * Se crean 4 variables de tipo Linea y una de tipo EstadoCuadro
     */
    private Linea lineaIzquierda;
    private Linea lineaDerecha;
    private Linea lineaArriba;
    private Linea lineaAbajo;
    private EstadoCuadro estado;

    /**
     * Constructor de la clase Cuadro, en la cual se le establece a cada
     * variables de la clase el valor de los parametros otorgados.
     *
     * @param lineaIzquierda
     * @param lineaDerecha
     * @param lineaArriba
     * @param lineaAbajo
     */
    public Cuadro(Linea lineaIzquierda, Linea lineaDerecha, Linea lineaArriba, Linea lineaAbajo) {
        this.lineaIzquierda = lineaIzquierda;
        this.lineaDerecha = lineaDerecha;
        this.lineaArriba = lineaArriba;
        this.lineaAbajo = lineaAbajo;
    }

    /**
     * Constructor de la clase Cuadro. Inicializa las cuatro líneas del cuadro y
     * establece el estado inicial como INCOMPLETO.
     */
    public Cuadro() {
        this.lineaIzquierda = new Linea();
        this.lineaDerecha = new Linea();
        this.lineaArriba = new Linea();
        this.lineaAbajo = new Linea();
        this.estado = INCOMPLETO;
    }

    /**
     * Obtiene la línea izquierda del cuadro.
     *
     * @return La línea izquierda del cuadro.
     */
    public Linea getLineaIzquierda() {
        return lineaIzquierda;
    }

    /**
     * Establece la línea izquierda del cuadro.
     *
     * @param lineaIzquierda La línea izquierda que se va a establecer.
     */
    public void setLineaIzquierda(Linea lineaIzquierda) {
        this.lineaIzquierda = lineaIzquierda;
    }

    /**
     * Obtiene la línea derecha del cuadro.
     *
     * @return La línea derecha del cuadro.
     */
    public Linea getLineaDerecha() {
        return lineaDerecha;
    }

    /**
     * Establece la línea derecha del cuadro.
     *
     * @param lineaDerecha La línea derecha que se va a establecer.
     */
    public void setLineaDerecha(Linea lineaDerecha) {
        this.lineaDerecha = lineaDerecha;
    }

    /**
     * Obtiene la línea superior del cuadro.
     *
     * @return La línea superior del cuadro.
     */
    public Linea getLineaArriba() {
        return lineaArriba;
    }

    /**
     * Establece la línea superior del cuadro.
     *
     * @param lineaArriba La línea superior que se va a establecer.
     */
    public void setLineaArriba(Linea lineaArriba) {
        this.lineaArriba = lineaArriba;
    }

    /**
     * Obtiene la línea inferior del cuadro.
     *
     * @return La línea inferior del cuadro.
     */
    public Linea getLineaAbajo() {
        return lineaAbajo;
    }

    /**
     * Establece la línea inferior del cuadro.
     *
     * @param lineaAbajo La línea inferior que se va a establecer.
     */
    public void setLineaAbajo(Linea lineaAbajo) {
        this.lineaAbajo = lineaAbajo;
    }

    /**
     * Obtiene el estado actual del cuadro. Si el estado no es RECLAMADO,
     * verifica si todas las líneas del cuadro tienen un jugador asignado.
     *
     * @return El estado actual del cuadro (INCOMPLETO, COMPLETO o RECLAMADO).
     */
    public EstadoCuadro getEstado() {
        if (estado != RECLAMADO) {
            if (lineaArriba.getJugador() != null && lineaAbajo.getJugador() != null
                    && lineaDerecha.getJugador() != null && lineaIzquierda.getJugador() != null) {
                return COMPLETO;
            }
            return INCOMPLETO;
        }

        return RECLAMADO;
    }

    /**
     * Establece el estado del cuadro.
     *
     * @param estado El estado que se va a establecer (INCOMPLETO, COMPLETO o
     * RECLAMADO).
     */
    public void setEstado(EstadoCuadro estado) {
        this.estado = estado;
    }

    /**
     * Devuelve una representación en cadena del cuadro, que incluye información
     * sobre sus líneas y estado.
     *
     * @return Una cadena que representa el cuadro.
     */
    @Override
    public String toString() {
        return "Cuadro{" + "lineaIzquierda=" + lineaIzquierda + ", lineaDerecha=" + lineaDerecha + ", lineaArriba=" + lineaArriba + ", lineaAbajo=" + lineaAbajo + '}';
    }

}
