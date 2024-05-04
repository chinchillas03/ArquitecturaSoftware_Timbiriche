/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itson.panel;

/**
 *
 * @author luisp
 */
public class PruebaFrames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        PanelFrameDiez panelFrame = new PanelFrameDiez(); 
        PanelTableroDiez panelTablero = new PanelTableroDiez();
        PanelPuntosDiez panelPuntos = new PanelPuntosDiez(); 
        PanelJugadoresDiez panelJugadores = new PanelJugadoresDiez();
        FrameContenedorDiez frame = new FrameContenedorDiez(panelTablero, panelPuntos, panelFrame, panelJugadores);
        
    }
    
}
