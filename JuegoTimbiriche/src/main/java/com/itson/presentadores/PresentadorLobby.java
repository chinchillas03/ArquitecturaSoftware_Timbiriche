/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.dtos.SolicitarInicioDTO;
import com.itson.dtos.UnirsePartidaDTO;
import com.itson.frames.FrmLobby;
import com.itson.interfaces.LobbyListener;
import com.itson.modelos.ModeloConfigurarPartida;
import com.itson.modelos.ModeloLobby;
import Entities.Jugador;
import Entities.Partida;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PresentadorLobby implements LobbyListener {

    private ModeloLobby model = new ModeloLobby();
    private FrmLobby view;
    private PresentadorPantallaPrincipal presentadorPantallaPrincipal;
    private Partida partida; 
    
    public PresentadorLobby() {
        view = new FrmLobby();
        this.view.setListener(this);
        this.view.repaint();
    }

    public PresentadorLobby(Jugador anfitrion) {
        view = new FrmLobby();
        this.view.setListener(this);
        this.view.repaint();
        this.model.añadirJugador(anfitrion);
    }

    @Override
    public void solicitarInicio(SolicitarInicioDTO solicitarInicioDTO ) {
        new PresentadorJuego(solicitarInicioDTO);
    }

    @Override
    public void salir() {
        presentadorPantallaPrincipal.mostrarPantallaPrincipal();
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

    public void setearLobbyConexion(UnirsePartidaDTO dto){
//        this.model.setJugadores(dto.getPartida().getJugadores());
//        this.model.setCodigo(dto.getPartida().getCodigo());
//        this.model.setDimension(dto.getPartida().getTablero().getDimension().toString());
        this.mostrarDatosPartida(dto.getPartida());
    }
    
    public void mostrarDatosPartida(Partida partida) {
        mostrarPantallaLobby();       
        actualizarDatosJugador(partida);
        view.actualizarDatosPartida(partida);
    }

    @Override
    public void actualizarDatosJugador(Partida partida) {
        List<Jugador> jugadores = partida.getJugadores();
        view.mostrarJugador(jugadores);
    }
    
    public void establecerPartidaLobby(Partida partida){
        this.model.setPartida(partida);
    }

    public void refrescar(List<Jugador> jugadores){
        this.view.refrescar(jugadores);
    }
    
    @Override
    public Partida obtenerPartida() {
        return this.model.getPartida();
    }

}
