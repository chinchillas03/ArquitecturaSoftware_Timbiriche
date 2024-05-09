/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.dtos.SolicitarInicioDTO;
import com.itson.frames.FrmJuego;
import com.itson.interfaces.JuegoListener;
import com.itson.modelos.ModeloJuego;
import dominio.Jugador;
import dominio.Linea;
import dominio.Partida;
import dominio.Tablero;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PresentadorJuego implements JuegoListener {

    private FrmJuego view;
    private ModeloJuego model = new ModeloJuego();

    public PresentadorJuego(SolicitarInicioDTO solicitarInicioDTO) {

        Tablero tablero = model.inicializarTableroDeJuego(solicitarInicioDTO);
        solicitarInicioDTO.getPartida().setTablero(tablero);
        establecerPartidaAlModeloJuego(solicitarInicioDTO.getPartida());
        this.view = new FrmJuego(this);
        this.view.setListener(this);
        this.view.setVisible(true);
    }

    @Override
    public void ponerLinea() {

    }

    @Override
    public void clickBotonSalir() {
        new PresentadorGanador().mostrarPantallaGanador();
    }

    public void mostrarPantallaJuego() {
        this.view.setVisible(true);
    }

    public void establecerPartidaAlModeloJuego(Partida partida) {
        this.model.setPartida(partida);
    }

    public Partida obtenerPartida() {
        return this.model.getPartida();
    }

    @Override
    public List<Jugador> obtenerListaJugadores() {
        return model.obtenerListaJugadores();
    }
    
    public Linea agregaLineaALista(Tablero tablero, Linea linea){
        this.model.agregaLineaALista(tablero, linea);
        return linea;
    }

    @Override
    public boolean validaTurno(Linea linea, Tablero tablero) {

        model.validaTurno(linea, tablero);
        return true; 
    }

    

}
