/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.modelos;

import com.itson.dtos.CrearPartidaDTO;
import com.itson.p2p.Cliente;
import com.itson.p2p.Protocolo;
import com.itson.p2p.Servidor;
import com.itson.presentadores.PresentadorLobby;
import dominio.DimensionTablero;
import dominio.Jugador;
import dominio.Partida;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class ModeloConfigurarPartida {

    Partida partida ;
    
    
    public Partida crearNuevaPartida(CrearPartidaDTO crearPartidaDTO) {

        if (validaDimensionTablero(crearPartidaDTO.getDimensionPartida())
                && validaCodigoPartida(crearPartidaDTO.getCodigoPartida())) {

            Partida nuevaPartida = solicitudNuevaPartida(crearPartidaDTO.getCodigoPartida(),
            crearPartidaDTO.getDimensionPartida(),
            crearPartidaDTO.getJugadorAnfitrion()); 
            return nuevaPartida;
            
        }else{
            System.out.println("Not created yet");
            return null;
        }
       
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    

    
    public Partida solicitudNuevaPartida(String codigo, DimensionTablero dimension, Jugador jugadorAnfitrion) {
        Partida partidaSolicitada = partida.solicitudNuevaPartida(codigo, dimension, jugadorAnfitrion);
        return partidaSolicitada; 
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
