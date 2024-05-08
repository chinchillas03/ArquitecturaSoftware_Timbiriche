/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.frames;

import dominio.Punto;
import dominio.Tablero;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
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

    public PanelTableroDiez(Tablero tablero) {
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

    protected void handleClick(Point point) {
        JOptionPane.showMessageDialog(null, "Hola");
    }
}
