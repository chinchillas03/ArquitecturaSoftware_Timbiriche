/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.dtos.ConexionDTO;
import com.itson.frames.FrmUnirsePartida;
import com.itson.interfaces.UnirsePartidaListener;
import com.itson.modelos.ModeloUnirsePartida;
import com.itson.p2p.Cliente;
import com.itson.p2p.Protocolo;
import com.itson.p2p.Servidor;
import Entities.Jugador;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class PresentadorUnirsePartida implements UnirsePartidaListener{

    private FrmUnirsePartida view = new FrmUnirsePartida();
    private ModeloUnirsePartida model = new ModeloUnirsePartida();
    private Jugador anfitrion;

    public PresentadorUnirsePartida(Jugador anfitrion) {
        this.view.setListener(this);
        this.anfitrion = anfitrion;
    }
    
    @Override
    public void clickBotonUnirsePartida(String ip, String puerto) {
        model.setIp(ip);
        model.setpuerto(puerto);
        model.setJugador(anfitrion);
        
        this.crearConexion();
        this.view.setVisible(false);
    }
    
    public void crearConexion(){
        try {
            int puerto1 = 9997;
            Servidor servidor = new Servidor(puerto1);
            Cliente cliente = new Cliente();            
            Protocolo protocolo = new Protocolo();
            servidor.setCliente(cliente);
            servidor.setProtocolo(protocolo);
            cliente.setMiServer(servidor);  
            cliente.setLobby(new PresentadorLobby());
            System.out.println("partida del lobby del cliente: "+cliente.getLobby().obtenerPartida()); 
            cliente.conectar(this.model.getIp(), Integer.parseInt(this.model.getpuerto()), this.model.getJugador());           
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void clickBotonSalir() {
        new PresentadorPantallaPrincipal().mostrarPantallaPrincipal();
    }
    
    public void mostrarPantallaUnirsePartida(){
        this.view.setVisible(true);
    }
}
