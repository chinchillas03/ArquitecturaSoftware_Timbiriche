/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.modelos;

import com.itson.dtos.SolicitarInicioDTO;
import dominio.Jugador;
import dominio.Linea;
import dominio.Partida;
import dominio.Punto;
import dominio.Tablero;
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

    public void validaTurno(Linea linea, Tablero tablero) {
        // establece linea original dibujada
        Linea lineaOriginal = linea;
        
        // crea arreglo con lineas en revision 
        List<Linea> lineasEnRevision = new ArrayList<>();
        
        // variable con linea que se está revisando
        Linea lineaEnRevision = linea;

        Ellipse2D puntoOriginalA = linea.getPunto1();
        Ellipse2D puntoOriginalB = linea.getPunto2();
        
        if (validaCoincidencia(tablero, lineaEnRevision) != null) {

            lineaEnRevision = validaCoincidencia(tablero, linea);
            if(!lineasEnRevision.contains(lineaEnRevision)){
                
            }
            
            lineasEnRevision.add(lineaEnRevision);
            
            
            
        } else if (validaCoincidencia(tablero, linea) == null) {

            lineasEnRevision.clear();
            lineasEnRevision.add(linea);

        }

    }

    public Linea validaCoincidencia(Tablero tablero, Linea linea) {

        for (Linea lineaEnRevision : tablero.getLineas()) {

            if ((lineaEnRevision.getPunto1() == linea.getPunto1()
                    || lineaEnRevision.getPunto1() == linea.getPunto2()) && linea != lineaEnRevision) {

                JOptionPane.showMessageDialog(null, "coincidencias");
                return lineaEnRevision;

            } else if ((lineaEnRevision.getPunto2() == linea.getPunto1()
                    || lineaEnRevision.getPunto2() == linea.getPunto2()) && linea != lineaEnRevision) {

                JOptionPane.showMessageDialog(null, "coincidencias");
                return lineaEnRevision;
            }
        }
        System.out.println("Sin coincidencias");
        return null;
    }

}
