/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capadominio;

import java.util.ArrayList;
import java.util.List;
import static org.itson.capadominio.Posicion.HORIZONTAL;
import static org.itson.capadominio.Posicion.VERTICAL;

/**
 *
 * @author equipo 1
 */
/**
 * La clase Tablero se utiliza para representar un tablero de juego que contiene
 * líneas, puntos y cuadros.
 */
public class Tablero {

    // Lista de cuadros en el tablero
    private List<Cuadro> cuadradito;

    // Lista de líneas horizontales en el tablero
    private List<Linea> lineasH;

    // Lista de líneas verticales en el tablero
    private List<Linea> lineasV;

    // Lista de puntos en el tablero
    private List<Punto> puntitos;

    /**
     * Constructor de la clase Tablero. Inicializa la lista de cuadros como una
     * lista vacía.
     */
    public Tablero() {
        cuadradito = new ArrayList<>();
    }

    /**
     * Constructor de la clase Tablero con un parámetro. Inicializa la lista de
     * cuadros como una lista vacía y llama al método "llenarTablero" con el
     * valor proporcionado.
     *
     * @param pipi Un valor que se utiliza para llenar el tablero (posiblemente
     * relacionado con el tamaño o configuración del tablero).
     */
    public Tablero(int pipi) {
        cuadradito = new ArrayList<>();
        llenarTablero(pipi);
    }

    /**
     * Agrega un cuadro a la lista de cuadros en el tablero.
     *
     * @param cuadro El cuadro que se va a agregar.
     */
    public void agregarCuadrado(Cuadro cuadro) {
        cuadradito.add(cuadro);
    }

    /**
     * Llena el tablero con líneas, puntos y cuadros basado en el valor
     * proporcionado (posiblemente relacionado con el tamaño o configuración del
     * tablero).
     *
     * @param popo Un valor que se utiliza para llenar el tablero.
     */
    public void llenarTablero(int popo) {

        if (popo == 2) {
            int numero = 0;
            int numero2 = 0;
            List<Punto> puntito = new ArrayList<>();
            List<Linea> lineasHorizontales = new ArrayList<>();
            List<Linea> lineasVerticales = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    Punto punto = new Punto(numero, numero2);
                    puntito.add(punto);
                    numero = numero + 50;
                }
                numero2 = numero2 + 50;
                numero = 0;
            }

            int tilin = 0;

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 9; j++) {
                    Linea linea = new Linea(puntito.get(tilin + j), puntito.get(tilin + 1 + j), HORIZONTAL);
                    lineasHorizontales.add(linea);
                }
                tilin = tilin + 10;
            }

            int tilina = 10;

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 9; j++) {
                    Linea linea = new Linea(puntito.get(i + j * tilina), puntito.get(i + (j + 1) * tilina), VERTICAL);
                    lineasVerticales.add(linea);
                }
            }

            lineasH = lineasHorizontales;
            lineasV = lineasVerticales;
            puntitos = puntito;
//            for (Lineas linea : lineasHorizontales) {
//                System.out.println(linea);
//            }
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("-----------------------------------------------");
//            System.out.println("-----------------------------------------------");
//            for (Linea linea : lineasVerticales) {
//                System.out.println(linea);
//            }

            int fila = 0;
            int columna = 0;
            int numCuadro = 0;
            for (int i = 0; i < ((tilina - 1) * (tilina - 1)); i++) {
                Cuadro cuadro = null;
                cuadro = new Cuadro();
                cuadro.setLineaArriba(lineasHorizontales.get(i));
                cuadro.setLineaAbajo(lineasHorizontales.get(i + (tilina - 1)));
                if (fila == 9) {
                    fila = 0;
                    columna = 0;
                    numCuadro++;
                }

                cuadro.setLineaIzquierda(lineasVerticales.get((columna * (tilina - 1)) + numCuadro));
                cuadro.setLineaDerecha(lineasVerticales.get(((columna + 1) * (tilina - 1)) + numCuadro));

                columna++;
                agregarCuadrado(cuadro);
                fila++;
            }

//            for (Cuadro cuadro : cuadradito) {
//                System.out.println(cuadro);
//            }
        } else if(popo == 3){
             int numero = 0;
            int numero2 = 0;
            List<Punto> puntito = new ArrayList<>();
            List<Linea> lineasHorizontales = new ArrayList<>();
            List<Linea> lineasVerticales = new ArrayList<>();

            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    Punto punto = new Punto(numero, numero2);
                    puntito.add(punto);
                    numero = numero + 50;
                }
                numero2 = numero2 + 50;
                numero = 0;
            }

            int tilin = 0;

            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 19; j++) {
                    Linea linea = new Linea(puntito.get(tilin + j), puntito.get(tilin + 1 + j), HORIZONTAL);
                    lineasHorizontales.add(linea);
                }
                tilin = tilin + 20;
            }

            int tilina = 20;

            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 19; j++) {
                    Linea linea = new Linea(puntito.get(i + j * tilina), puntito.get(i + (j + 1) * tilina), VERTICAL);
                    lineasVerticales.add(linea);
                }
            }

            lineasH = lineasHorizontales;
            lineasV = lineasVerticales;
            puntitos = puntito;
            for (Linea linea : lineasHorizontales) {
                System.out.println(linea);
            }
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("|||||||||");
//            System.out.println("---------");
//            System.out.println("-----------------------------------------------");
//            System.out.println("-----------------------------------------------");
            for (Linea linea : lineasVerticales) {
                System.out.println(linea);
            }

//            int fila = 0;
//            int columna = 0;
//            int numCuadro = 0;
//            for (int i = 0; i < ((tilina - 1) * (tilina - 1)); i++) {
//                Cuadro cuadro = null;
//                cuadro = new Cuadro();
//                cuadro.setLineaArriba(lineasHorizontales.get(i));
//                cuadro.setLineaAbajo(lineasHorizontales.get(i + (tilina - 1)));
//                if (fila == 9) {
//                    fila = 0;
//                    columna = 0;
//                    numCuadro++;
//                }
//
//                cuadro.setLineaIzquierda(lineasVerticales.get((columna * (tilina - 1)) + numCuadro));
//                cuadro.setLineaDerecha(lineasVerticales.get(((columna + 1) * (tilina - 1)) + numCuadro));
//
//                columna++;
//                agregarCuadrado(cuadro);
//                fila++;
//            }
            
        }else if(popo == 4){
            
        }

    }

      /**
     * Obtiene la lista de cuadros en el tablero.
     *
     * @return La lista de cuadros en el tablero.
     */
    public List<Cuadro> getCuadradito() {
        return cuadradito;
    }

    /**
     * Establece la lista de cuadros en el tablero.
     *
     * @param cuadradito La lista de cuadros que se va a establecer.
     */
    public void setCuadradito(List<Cuadro> cuadradito) {
        this.cuadradito = cuadradito;
    }

    /**
     * Obtiene la lista de líneas horizontales en el tablero.
     *
     * @return La lista de líneas horizontales en el tablero.
     */
    public List<Linea> getLineasH() {
        return lineasH;
    }

    /**
     * Establece la lista de líneas horizontales en el tablero.
     *
     * @param lineasH La lista de líneas horizontales que se va a establecer.
     */
    public void setLineasH(List<Linea> lineasH) {
        this.lineasH = lineasH;
    }

    /**
     * Obtiene la lista de líneas verticales en el tablero.
     *
     * @return La lista de líneas verticales en el tablero.
     */
    public List<Linea> getLineasV() {
        return lineasV;
    }

    /**
     * Establece la lista de líneas verticales en el tablero.
     *
     * @param lineasV La lista de líneas verticales que se va a establecer.
     */
    public void setLineasV(List<Linea> lineasV) {
        this.lineasV = lineasV;
    }

    /**
     * Obtiene la lista de puntos en el tablero.
     *
     * @return La lista de puntos en el tablero.
     */
    public List<Punto> getPuntitos() {
        return puntitos;
    }

    /**
     * Establece la lista de puntos en el tablero.
     *
     * @param puntitos La lista de puntos que se va a establecer.
     */
    public void setPuntitos(List<Punto> puntitos) {
        this.puntitos = puntitos;
    }

}
