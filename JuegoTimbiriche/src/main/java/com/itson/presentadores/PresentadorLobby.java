/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.frames.FrmLobby;
import com.itson.interfaces.LobbyListener;
import com.itson.modelos.ModeloConfigurarPartida;
import com.itson.modelos.ModeloLobby;
import dominio.Jugador;
import dominio.Partida;

/**
 *
 * @author Usuario
 */
public class PresentadorLobby implements LobbyListener {

    private ModeloLobby model = new ModeloLobby();
    private Jugador anfitrion;
    private FrmLobby view;
    private ModeloConfigurarPartida modelConfPartida;
    private PresentadorPantallaPrincipal presentadorPantallaPrincipal;

    public PresentadorLobby(Jugador anfitrion) {
        view = new FrmLobby();
        this.view.setListener(this);
        this.view.repaint();
        this.anfitrion = anfitrion;
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

    public void mostrarPantallaLobby() {
        view.setVisible(true);
    }

    public void mostrarDatosPartida(Partida partida) {
        mostrarPantallaLobby();
        actualizarDatosJugador();
        view.actualizarDatosPartida(partida);
    }

    @Override
    public void actualizarDatosJugador() {
        view.mostrarJugador(anfitrion);
    }

}
