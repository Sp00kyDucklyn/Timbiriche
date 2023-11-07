/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.capaCliente.VISTAG;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author equipo 1
 */
public class FigurasGraficas implements IFiguras{
    
    private List <IFiguras> figuras;

    public FigurasGraficas() {
        figuras = new ArrayList<>();
    }
    
    public void agregarLista(IFiguras figura){
        figuras.add(figura);
    }
    
    public void eliminarLista(IFiguras figura){
        figuras.remove(figura);
    }
    
    @Override
    public void pintar(Graphics2D g2) {
        for (IFiguras figura : figuras) {
            figura.pintar(g2);
        }
    }

    public List <IFiguras> getFiguras() {
        return figuras;
    }

    public void setFiguras(List <IFiguras> figuras) {
        this.figuras = figuras;
    }
    
}
