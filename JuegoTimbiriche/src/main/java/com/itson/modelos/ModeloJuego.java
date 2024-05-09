/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.modelos;

import com.itson.dtos.SolicitarInicioDTO;
import Entities.Jugador;
import Aggregates.Linea;
import Entities.Partida;
import ValueObjects.Punto;
import Aggregates.Tablero;
import java.awt.geom.Ellipse2D;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Usuario
 */
// Del presentador le piden al modelo que haga la lista de puntos que se debe representar en el tablero
// El modelo debe crear un nuevo tablero que tenga las dimensiones que se pide en el DTO y tambien que tenga 
// la lista con los 100 puntos que se debe llenar en base al arreglo dimensional que se generó previamente.
// Dentro de cada punto también se debe generar una instancia de la clase Ellipse2D que será su representación gráfica
// Una vez se termine todo el procedimiento se le enviará al presentador el tablero que contiene la lista de puntos, los
// cuales contienen sus ubicaciones y dimensiones. El presentado entonces, delegará la responsabilidad de pintar estos puntos
// Dentro de la pantalla de juego.
public class ModeloJuego {

    private Tablero tablero;
    private int[][] dimensionesParaTablero;
    private List<Punto> puntos;
    private Partida partida;

    public Tablero inicializarTableroDeJuego(SolicitarInicioDTO solicitarInicioDTO) {
        llenarArregloDeDimensiones();
        tablero = new Tablero();
        tablero.setDimension(solicitarInicioDTO.getDimension());
        this.tablero.setLineas(creaListaDeLineas());
        llenaListaPuntos();
        return tablero;
    }

    private List<Linea> creaListaDeLineas() {
        return new ArrayList<Linea>();
    }

    private List<Punto> creaListaPuntos() {
        return new ArrayList<Punto>();
    }

    private List<Punto> llenaListaPuntos() {

        this.puntos = creaListaPuntos();

        for (int i = 0; i < this.dimensionesParaTablero.length; i++) {
            Punto punto = new Punto(this.dimensionesParaTablero[i][0],
                    this.dimensionesParaTablero[i][1],
                    this.dimensionesParaTablero[i][2],
                    this.dimensionesParaTablero[i][3], null, null);

            punto.crearRepresentacionGrafica(punto.getX(), punto.getY(), punto.getWidth(), punto.getHeight());
            this.puntos.add(punto);

        };
        this.tablero.setPuntos(puntos);
        return puntos;
    }

    private int[][] llenarArregloDeDimensiones() {

        this.dimensionesParaTablero = new int[100][4];
        int posicionX = 120;
        int posicionY = 120;
        int aux = 0;
        int contRegistros = 0;
        for (int i = 0; i < 100; i++) {

            dimensionesParaTablero[i][aux] = posicionX;

            dimensionesParaTablero[i][aux + 1] = posicionY;

            dimensionesParaTablero[i][aux + 2] = 30;

            dimensionesParaTablero[i][aux + 3] = 30;

            contRegistros++;
            posicionX += 68;
            if (contRegistros == 10) {

                posicionY += 45;
                posicionX = 120;
                contRegistros = 0;
            }

        }
        System.out.println(dimensionesParaTablero.length);
        return dimensionesParaTablero;

    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public List<Jugador> obtenerListaJugadores() {
        return this.partida.getJugadores();
    }

    public Linea agregaLineaALista(Tablero tablero, Linea linea) {
        return tablero.agregaLinea(tablero, linea);
    }

  public boolean verificaCuadro(Linea nuevaLinea) {
    Ellipse2D p1 = nuevaLinea.getPunto1();
    Ellipse2D p2 = nuevaLinea.getPunto2();

    List<Ellipse2D> puntosCompartidos = new ArrayList<>();


    for (Linea linea : tablero.getLineas()) {
        if (linea.equals(nuevaLinea)) continue; // Ignorar la línea actual

        if (linea.getPunto1().equals(p1) || linea.getPunto2().equals(p1)) {
            puntosCompartidos.add(linea.getPuntoOpuesto(p1));
        }
        if (linea.getPunto1().equals(p2) || linea.getPunto2().equals(p2)) {
            puntosCompartidos.add(linea.getPuntoOpuesto(p2));
        }
    }

  
    for (int i = 0; i < puntosCompartidos.size(); i++) {
        for (int j = i + 1; j < puntosCompartidos.size(); j++) {
            Ellipse2D op1 = puntosCompartidos.get(i);
            Ellipse2D op2 = puntosCompartidos.get(j);
            if (op1.equals(op2)) continue; 

        
            for (Linea linea : tablero.getLineas()) {
                if ((linea.getPunto1().equals(op1) && linea.getPunto2().equals(op2)) ||
                    (linea.getPunto1().equals(op2) && linea.getPunto2().equals(op1))) {
                    return true;
                }
            }
        }
    }

    return false;
}

}
