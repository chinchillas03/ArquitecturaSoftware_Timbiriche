/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.modelos;

import com.itson.dtos.CrearPartidaDTO;
import dominio.DimensionTablero;
import dominio.Jugador;
import dominio.Partida;

/**
 *
 * @author Usuario
 */
public class ModeloConfiguarPartida {

    Partida partida ;
    
    public void crearNuevaPartida(CrearPartidaDTO crearPartidaDTO) {
        if (validaDimensionTablero(crearPartidaDTO.getDimensionPartida())
                && validaCodigoPartida(crearPartidaDTO.getCodigoPartida())) {

            Partida nuevaPartida = solicitudNuevaPartida(crearPartidaDTO.getCodigoPartida(),
            crearPartidaDTO.getDimensionPartida(),
            crearPartidaDTO.getJugadorAnfitrion());
            System.out.println("Here ");
            mostrarDatosNuevaPartidaCreada(nuevaPartida);
        }else{
            System.out.println("Not created yet");
        }
        System.out.println("");
    }
    
    public void mostrarDatosNuevaPartidaCreada(Partida nuevaPartida){
        
        System.out.println(nuevaPartida.toString());
    }
    
    public Partida solicitudNuevaPartida(String codigo, DimensionTablero dimension, Jugador jugadorAnfitrion) {
        
        return partida.solicitudNuevaPartida(codigo, dimension, jugadorAnfitrion);
    }

    private boolean validaCodigoPartida(String codigo) {
        partida = new Partida(); 
        if (partida.validaCodigoPartida(codigo)) {
            return true;
        }
        return false;
    }

    private boolean validaDimensionTablero(DimensionTablero dimension) {
         partida = new Partida(); 
        if (partida.validaDimensionTablero(dimension)) {
            return true;
        }
        return false;
    }

}
