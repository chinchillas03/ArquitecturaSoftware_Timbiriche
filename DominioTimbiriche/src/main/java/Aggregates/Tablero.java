/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aggregates;

import ValueObjects.Punto;
import ValueObjects.DimensionTablero;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Tablero implements Serializable{

    private DimensionTablero dimension;
    private List<Punto> puntos;
    private List<Cuadro> cuadros;
    private List<Linea> lineas;

    public Tablero crearTablero(DimensionTablero dimension) {

        Tablero nuevoTablero = new Tablero();
        nuevoTablero.setDimension(dimension);
        return nuevoTablero; 
    }

    public DimensionTablero getDimension() {
        return dimension;
    }

    public void setDimension(DimensionTablero dimension) {
        this.dimension = dimension;
    }

    public List<Punto> getPuntos() {
        return puntos;
    }

    public void setPuntos(List<Punto> puntos) {
        this.puntos = puntos;
    }

    public List<Cuadro> getCuadros() {
        return cuadros;
    }

    public void setCuadros(List<Cuadro> cuadros) {
        this.cuadros = cuadros;
    }

    public List<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(List<Linea> lineas) {
        this.lineas = lineas;
    }
    
    public Linea agregaLinea(Tablero tablero, Linea linea){
        
        tablero.lineas.add(linea); 
        return linea; 
    }

}
