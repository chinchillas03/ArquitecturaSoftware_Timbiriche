/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.interfaces;

import dominio.Jugador;
import dominio.Partida;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface JuegoListener {
    void ponerLinea();

    void clickBotonSalir();
    
    Partida obtenerPartida(); 
    
    List<Jugador> obtenerListaJugadores(); 
    
}
