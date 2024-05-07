/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dtos;

/**
 *
 * @author waw
 */
public class SolicitarInicioDTO {

    // x, y, height, width
    int[][] dimensiones_coordenadas = new int[3][4];

    public void agregarDimensionesAlArreglo(int [][] dimensiones_coordenadas) {

        this.dimensiones_coordenadas = dimensiones_coordenadas; 
       
    }

}
