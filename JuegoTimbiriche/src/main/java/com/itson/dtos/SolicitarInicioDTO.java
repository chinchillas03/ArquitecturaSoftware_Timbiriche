/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dtos;

import dominio.DimensionTablero;
import dominio.Jugador;
import dominio.Partida;
import java.util.List;

/**
 *
 * @author waw
 */
public class SolicitarInicioDTO {


    private DimensionTablero dimension;
    
    private List<Jugador> jugadores; 
    
    private Partida partida;
    


    public DimensionTablero getDimension() {
        return dimension;
    }

    public void setDimension(DimensionTablero dimension) {
        this.dimension = dimension;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    
    
    
    

}
