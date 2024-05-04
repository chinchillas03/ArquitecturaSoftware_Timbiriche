/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.panel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author luisp
 */
public class PanelJugadoresDiez extends JPanel {

    public PanelJugadoresDiez() {

        setBackground(Color.WHITE);
        setLayout(null);
    }

    public void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(5));
        g2d.drawRect(0, 0, 859, 139);
        dibujaJugadores(g2d);

    }

    public void dibujaJugadores(Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(60, 10, 125, 120);
        g2d.drawRect(260, 10, 125, 120);
        g2d.drawRect(460, 10, 125, 120);
        g2d.drawRect(660, 10, 125, 120);
        
        Font fuenteActual = g2d.getFont();
        Font newFont = fuenteActual.deriveFont(fuenteActual.getSize() * 1.4F);
        g2d.setFont(newFont);
        g2d.drawString("Jugador 1", 85, 30);
        g2d.drawString("Jugador 2", 285, 30);
        g2d.drawString("Jugador 3", 485, 30);
        g2d.drawString("Jugador 4", 685, 30);
//        BufferedImage img = new BufferedImage(WIDTH, HEIGHT, HEIGHT); 
//        g2d.drawImage(img, null, 10, 10);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}
