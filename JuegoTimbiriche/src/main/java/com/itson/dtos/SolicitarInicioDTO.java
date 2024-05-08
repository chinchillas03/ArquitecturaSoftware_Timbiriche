/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dtos;

import dominio.DimensionTablero;

/**
 *
 * @author waw
 */
public class SolicitarInicioDTO {

    // x, y, height, width
    private int[][] dimensiones_coordenadas = new int[3][4];

    private DimensionTablero dimension;
    
    
    public void agregarDimensionesAlArreglo(int [][] dimensiones_coordenadas) {

        this.dimensiones_coordenadas = dimensiones_coordenadas; 
       
    }

    public DimensionTablero getDimension() {
        return dimension;
    }

    public void setDimension(DimensionTablero dimension) {
        this.dimension = dimension;
    }
    
    
    

}
