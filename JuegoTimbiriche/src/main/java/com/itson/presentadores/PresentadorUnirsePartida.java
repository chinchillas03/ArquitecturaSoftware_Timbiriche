/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.frames.FrmUnirsePartida;
import com.itson.interfaces.UnirsePartidaListener;
import com.itson.modelos.ModeloUnirsePartida;

/**
 *
 * @author Usuario
 */
public class PresentadorUnirsePartida implements UnirsePartidaListener{

    private FrmUnirsePartida view = new FrmUnirsePartida();
    private ModeloUnirsePartida model = new ModeloUnirsePartida();

    public PresentadorUnirsePartida() {
        this.view.setListener(this);
    }
    
    @Override
    public void clickBotonUnirsePartida() {
        new PresentadorLobby().mostrarPantallaLobby();
    }

    @Override
    public void clickBotonSalir() {
        new PresentadorPantallaPrincipal().mostrarPantallaPrincipal();
    }
    
    public void mostrarPantallaUnirsePartida(){
        this.view.setVisible(true);
    }
}
