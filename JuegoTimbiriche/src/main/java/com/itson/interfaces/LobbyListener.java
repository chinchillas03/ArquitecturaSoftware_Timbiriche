/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.interfaces;

import dominio.Partida;

/**
 *
 * @author Usuario
 */
public interface LobbyListener {

    void solicitarInicio();

    void salir();

    void cambioAvatarDerecha();

    void cambioAvatarIzquierda();
    
    void actualizarDatosJugador(Partida partida);
    
}
