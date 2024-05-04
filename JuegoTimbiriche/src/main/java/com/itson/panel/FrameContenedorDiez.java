/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.panel;

import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author luisp
 */
public class FrameContenedorDiez extends JFrame {

    public FrameContenedorDiez(JPanel panelTablero, JPanel panelPuntos, JPanel panelFrame, JPanel panelJugadores) {
        setTitle("Timbiriche");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the frame closes properly
        setSize(new Dimension(900, 700));
        setBackground(Color.WHITE);
        panelFrame.setBounds(0, 0, 400, 400);
        panelTablero.setBounds(10, 10, 850, 500); // Set position and size of panelTablero
        panelJugadores.setBounds(10, 510, 860, 145);
        add(panelFrame);
        panelFrame.add(panelTablero); 
        panelFrame.add(panelJugadores);

    }
}
