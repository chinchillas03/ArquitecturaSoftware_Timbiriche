/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.frames.FrmLobby;
import com.itson.interfaces.LobbyListener;
import com.itson.modelos.ModeloConfigurarPartida;
import com.itson.modelos.ModeloLobby;
import dominio.Partida;

/**
 *
 * @author Usuario
 */
public class PresentadorLobby implements LobbyListener{

    private ModeloLobby model = new ModeloLobby();
    private FrmLobby view = new FrmLobby();
    private ModeloConfigurarPartida modelConfPartida;
    
    public PresentadorLobby() {
        this.view.setListener(this);
        
    }
    
    
    @Override
    public void solicitarInicio() {
        new PresentadorJuego().mostrarPantallaJuego();
    }

    @Override
    public void salir() {
        new PresentadorPantallaPrincipal().mostrarPantallaPrincipal();
    }

    @Override
    public void cambioAvatarDerecha() {
        
    }

    @Override
    public void cambioAvatarIzquierda() {
        
    }
    
   
    public void mostrarPantallaLobby (){
        view.setVisible(true);
    }
    
    
    public void mostrarDatosPartida(Partida partida){
        view.actualizarDatosPartida(partida);
    }
    
}
