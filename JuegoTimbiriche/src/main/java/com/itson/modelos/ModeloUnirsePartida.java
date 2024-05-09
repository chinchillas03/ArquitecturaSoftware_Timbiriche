/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.modelos;

import com.itson.p2p.Cliente;
import com.itson.p2p.Protocolo;
import com.itson.p2p.Servidor;
import Entities.Jugador;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class ModeloUnirsePartida {
    
    private String puerto;
    private String ip;
    private Jugador jugador;

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getpuerto() {
        return puerto;
    }

    public void setpuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    } 
}
