/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.panel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author luisp
 */
public class PanelJugadoresDiez extends JPanel{
    
    
    public PanelJugadoresDiez(){
        
        setBackground(Color.WHITE);
        setLayout(null);
    }
    
    public void doDrawing(Graphics g){
        Graphics2D g2d = (Graphics2D) g; 
        g2d.setStroke(new BasicStroke(5));
        g2d.drawRect(0, 0, 859, 139); 
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        doDrawing(g);
    }
}
