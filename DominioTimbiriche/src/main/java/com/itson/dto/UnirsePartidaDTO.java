/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dto;

import dominio.Partida;
import java.io.Serializable;

/**
 *
 * @author waw
 */
public class UnirsePartidaDTO implements Serializable{
     
    private Partida partida;

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }   
}