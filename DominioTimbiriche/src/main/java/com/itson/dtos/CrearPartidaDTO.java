/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dtos;

import Aggregates.ColoresJugadores;
import ValueObjects.DimensionTablero;
import Entities.Jugador;

/**
 * Este DTO se utiliza para enviar informacion sobre la partida que 
 * desea crearse desde la vista hacia el presentador 
 * @author waw
 */
public class CrearPartidaDTO {
    String codigoPartida; 
    DimensionTablero dimensionPartida; 
    Jugador jugadorAnfitrion; 
    private ColoresJugadores coloresJugadores; 

    public CrearPartidaDTO(String codigoPartida, DimensionTablero dimensionPartida, Jugador jugadorAnfitrion) {
        this.codigoPartida = codigoPartida;
        this.dimensionPartida = dimensionPartida;
        this.jugadorAnfitrion = jugadorAnfitrion;
    }

    public String getCodigoPartida() {
        return codigoPartida;
    }

    public DimensionTablero getDimensionPartida() {
        return dimensionPartida;
    }

    public Jugador getJugadorAnfitrion() {
        return jugadorAnfitrion;
    }

    public ColoresJugadores getColoresJugadores() {
        return coloresJugadores;
    }

    public void setColoresJugadores(ColoresJugadores coloresJugadores) {
        this.coloresJugadores = coloresJugadores;
    }
    
}
