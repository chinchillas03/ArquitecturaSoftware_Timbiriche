/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.frames.FrmJuego;
import com.itson.interfaces.JuegoListener;
import com.itson.modelos.ModeloJuego;

/**
 *
 * @author Usuario
 */
public class PresentadorJuego implements JuegoListener{

    private FrmJuego view = new FrmJuego();
    private ModeloJuego model = new ModeloJuego();

    public PresentadorJuego() {
        this.view.setListener(this);
    }
    
    @Override
    public void ponerLinea() {
        
    }

    @Override
    public void clickBotonSalir() {
        
    }
    
}
