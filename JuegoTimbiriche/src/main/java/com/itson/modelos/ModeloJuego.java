/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.modelos;

/**
 *
 * @author Usuario
 */
public class ModeloJuego {

    private int[][] llenarArregloDeDimensiones() {

        int[][] dimensionesParaTablero = new int[100][4];
        int posicionX = 68;
        int posicionY = 25;
        int aux = 0;
        int contRegistros = 0;
        for (int i = 0; i < 100; i++) {

            dimensionesParaTablero[i][aux] = posicionX;

            
            dimensionesParaTablero[i][aux + 1] = posicionY;

            dimensionesParaTablero[i][aux + 2] = 30;

            dimensionesParaTablero[i][aux + 3] = 30;
            
            contRegistros++;
            posicionX += 68;
            if (contRegistros > 10) {

                posicionY += 45;
                posicionX = 68; 
                contRegistros = 0; 
            }

        }
        return dimensionesParaTablero;

    }

    public static void main(String[] args) {
        ModeloJuego model = new ModeloJuego();

        int[][] arregloPrueba = model.llenarArregloDeDimensiones();

        System.out.println("");
    }
}
