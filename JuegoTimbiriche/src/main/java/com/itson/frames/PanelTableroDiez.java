/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.frames;

import com.itson.interfaces.JuegoListener;
import Aggregates.ColoresJugadores;
import Entities.Jugador;
import Aggregates.Linea;
import ValueObjects.Punto;
import Aggregates.Tablero;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author waw
 */
public class PanelTableroDiez extends JPanel implements Runnable {

    List<Ellipse2D.Double> objetosPuntos;
    Ellipse2D.Double currentPoint;
    private ColoresJugadores colores;
    private List<Jugador> jugadores;

    private Tablero tablero;
    private JuegoListener juegoListener;

    public PanelTableroDiez(JuegoListener listener) {
        this.juegoListener = listener;
        this.tablero = juegoListener.obtenerPartida().getTablero();
        this.colores = juegoListener.obtenerPartida().getColoresJugadores();
        this.jugadores = juegoListener.obtenerPartida().getJugadores();
        obtenerListaJugadores(); 
        mostrarTableroJuego(tablero);
    }

    public void mostrarTableroJuego(Tablero tablero) {

        this.objetosPuntos = new ArrayList<>();
        for (Punto punto : tablero.getPuntos()) {
            Ellipse2D.Double puntoGrafico = punto.getPuntoGrafico(); // Usa el método del punto actual
            objetosPuntos.add(puntoGrafico);
        }
    }

    public void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.setFont(new Font("Tahoma", Font.BOLD, 70));
        g2d.setColor(Color.WHITE);
        
        g2d.drawString("Timbiriche", 250, 85);
        g2d.setColor(Color.WHITE);
        
        for (Ellipse2D.Double puntosADibujar : this.objetosPuntos) {
            g2d.draw(puntosADibujar);
            g2d.fill(puntosADibujar);
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    @Override
    public void run() {

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                handleClick(e.getPoint());
            }

        });

    }

    protected boolean handleClick(Point clickPoint) {
        for (Ellipse2D.Double punto : this.objetosPuntos) {
            if (punto.contains(clickPoint)) {
                if (this.currentPoint == null) {
                    establecerPuntoActual(punto);
                } else {
                    for (Jugador jugador : jugadores) {
                        if (colores.obtenerColor(jugador.getNombre()) != null) {
                            Graphics2D g2d = (Graphics2D) getGraphics();
                            g2d.setStroke(new BasicStroke(10));
                            g2d.setColor(colores.obtenerColor(jugador.getNombre()));
                            g2d.drawLine((int) this.currentPoint.getX() + 15,
                                    (int) this.currentPoint.getY() + 15,
                                    (int) punto.getX() + 15,
                                    (int) punto.getY() + 15);

                            Linea linea = new Linea();
                            linea.setPunto1(currentPoint);
                            linea.setPunto2(punto);

                            this.juegoListener.agregaLineaALista(this.tablero, linea);

                            if (getJuegoListener().verificaCuadro(linea)) {
                                JOptionPane.showMessageDialog(this, "¡Has completado un cuadro!");
                            }

                            System.out.println(tablero.getLineas().toString());

                            this.currentPoint = null;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void establecerPuntoActual(Ellipse2D.Double punto) {
        this.currentPoint = punto;
    }

    public ColoresJugadores getColores() {
        return colores;
    }

    public void setColores(ColoresJugadores colores) {
        this.colores = colores;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public JuegoListener getJuegoListener() {
        return juegoListener;
    }
    
    private List<Jugador> obtenerListaJugadores(){
        return this.juegoListener.obtenerListaJugadores(); 
    }
    
    
}
