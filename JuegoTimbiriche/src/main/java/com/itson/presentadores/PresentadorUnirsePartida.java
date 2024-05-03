/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.frames.FrmUnirsePartida;
import com.itson.interfaces.UnirsePartidaListener;
import com.itson.modelos.ModeloUnirsePartida;
import dominio.Jugador;

/**
 *
 * @author Usuario
 */
public class PresentadorUnirsePartida implements UnirsePartidaListener{

    private FrmUnirsePartida view = new FrmUnirsePartida();
    private ModeloUnirsePartida model = new ModeloUnirsePartida();
    private Jugador anfitrion;

    public PresentadorUnirsePartida(Jugador anfitrion) {
        this.view.setListener(this);
        this.anfitrion = anfitrion;
    }
    
    @Override
    public void clickBotonUnirsePartida() {
        new PresentadorLobby(anfitrion).mostrarPantallaLobby();
    }

    @Override
    public void clickBotonSalir() {
        new PresentadorPantallaPrincipal().mostrarPantallaPrincipal();
    }
    
    public void mostrarPantallaUnirsePartida(){
        this.view.setVisible(true);
    }
}
