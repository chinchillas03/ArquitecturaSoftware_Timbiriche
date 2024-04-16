/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.frames.FrmGanador;
import com.itson.interfaces.GanadorListener;
import com.itson.modelos.ModeloGanador;

/**
 *
 * @author Usuario
 */
public class PresentadorGanador implements GanadorListener{

    private FrmGanador view = new FrmGanador();
    private ModeloGanador model = new ModeloGanador();
    
    public PresentadorGanador(){
        this.view.setListener(this);
    }
    
    @Override
    public void clickBotonSalir() {
        new PresentadorPantallaPrincipal().mostrarPantallaPrincipal();
    }
    
    public void mostrarPantallaGanador(){
        this.view.setVisible(true);
    }
    
}
