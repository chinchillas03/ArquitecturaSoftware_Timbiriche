/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.modelos;

//import dominio.Jugador;
import Entities.Jugador;
import Entities.Partida;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ModeloLobby {
    
    private List<Jugador> jugadores;
    private String codigo;
    private String dimension;
    private Partida partida; 
    
    public ModeloLobby(){
        jugadores = new LinkedList<>();
    }
    
    public void añadirJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    
}
