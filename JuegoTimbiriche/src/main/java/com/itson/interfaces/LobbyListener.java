/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.interfaces;

import com.itson.dtos.SolicitarInicioDTO;
import Entities.Partida;

/**
 *
 * @author Usuario
 */
public interface LobbyListener {

    void solicitarInicio(SolicitarInicioDTO solicitarInicioDTO );

    void salir();

    void cambioAvatarDerecha();

    void cambioAvatarIzquierda();
    
    void actualizarDatosJugador(Partida partida);
    
    Partida obtenerPartida();
}
