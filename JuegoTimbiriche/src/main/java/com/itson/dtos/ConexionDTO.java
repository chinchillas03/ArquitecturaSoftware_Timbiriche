/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dtos;

import dominio.ColoresJugadores;
import dominio.Jugador;
import dominio.Partida;
import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class ConexionDTO implements Serializable{
    
    private String ip;
    private int puerto;
    private Jugador jugador;
    private Partida partida;
    public String getIp() {
        return ip;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    public ConexionDTO(String ip, int puerto) {
        this.ip = ip;
        this.puerto = puerto;
    }

    public ConexionDTO(String ip, int puerto, Partida partida) {
        this.ip = ip;
        this.puerto = puerto;
        this.partida = partida;
    }

    public ConexionDTO(String ip, int puerto, Jugador jugador) {
        this.ip = ip;
        this.puerto = puerto;
        this.jugador = jugador;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
    
}
