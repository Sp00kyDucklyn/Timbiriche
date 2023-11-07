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
public class Tablero {
    
    private List <Cuadro> cuadradito;
    private List <Linea> lineasH;
    private List <Linea> lineasV;
    private List <Punto> puntitos;

    public Tablero() {
        cuadradito = new ArrayList<>();
    }

    public Tablero(int pipi) {
        cuadradito = new ArrayList<>();
        llenarTablero(pipi);
    }
    
    public void agregarCuadrado(Cuadro cuadro){
        cuadradito.add(cuadro);
    }
    
    public void llenarTablero(int popo) {
        
        if (popo == 2) {
            int numero = 100;
            int numero2 = 100;
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
                numero = 100;
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
//            for (Lineas linea : lineasVerticales) {
//                System.out.println(linea);
//            }
            
            int fila = 0;
            int columna = 0;
            int numCuadro =0;
            for (int i = 0; i < ((tilina - 1)*(tilina - 1)); i++) {
                Cuadro cuadro = null;
                    cuadro = new Cuadro();
                    cuadro.setLineaArriba(lineasHorizontales.get(i));
                    cuadro.setLineaAbajo(lineasHorizontales.get(i+(tilina-1)));
                    if(fila == 9){
                        fila=0;
                        columna = 0;
                        numCuadro++;
                    }
                   
                    cuadro.setLineaIzquierda(lineasVerticales.get((columna*(tilina-1))+numCuadro));
                    cuadro.setLineaDerecha(lineasVerticales.get(((columna+1)*(tilina-1))+numCuadro));
                    
                    columna++;
                    agregarCuadrado(cuadro);
                    fila++;
            }
            
//            for (Cuadro cuadro : cuadradito) {
//                System.out.println(cuadro);
//            }
            
        }

    }

    public List <Cuadro> getCuadradito() {
        return cuadradito;
    }

    public void setCuadradito(List <Cuadro> cuadradito) {
        this.cuadradito = cuadradito;
    }

    public List <Linea> getLineasH() {
        return lineasH;
    }

    public void setLineasH(List <Linea> lineasH) {
        this.lineasH = lineasH;
    }

    public List <Linea> getLineasV() {
        return lineasV;
    }

    public void setLineasV(List <Linea> lineasV) {
        this.lineasV = lineasV;
    }

    public List <Punto> getPuntitos() {
        return puntitos;
    }

    public void setPuntitos(List <Punto> puntitos) {
        this.puntitos = puntitos;
    }
    
    
}
