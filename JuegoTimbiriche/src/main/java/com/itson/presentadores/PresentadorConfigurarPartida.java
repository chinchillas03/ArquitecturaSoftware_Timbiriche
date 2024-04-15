/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.frames.FrmConfigurarPartida;
import com.itson.interfaces.ConfigurarPartidaListener;
import com.itson.modelos.ModeloConfiguarPartida;

/**
 *
 * @author Usuario
 */
public class PresentadorConfigurarPartida implements ConfigurarPartidaListener{

    private ModeloConfiguarPartida model = new ModeloConfiguarPartida();
    private FrmConfigurarPartida view = new FrmConfigurarPartida();

    public PresentadorConfigurarPartida() {
        this.view.setListener(this);
    }
    
    @Override
    public void clickBotonVolverInicio() {
        
    }

    @Override
    public void clickBotonCrearPartida() {
        
    }
    
}
