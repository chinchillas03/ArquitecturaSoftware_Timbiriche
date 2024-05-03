/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.interfaces;

import dominio.Jugador;

/**
 *
 * @author Usuario
 */
public interface PantallaPrincipalListener {

    void clickBotonUnirsePartida(Jugador anfitrion);

    void clickBotonCrearPartida(Jugador anfitrion);

    void cambioAvatarDerecha();

    void cambioAvatarIzquierda();
    
    void cambiarNombre();
    
    Jugador crearJugadorAnfitrion(); 
}
