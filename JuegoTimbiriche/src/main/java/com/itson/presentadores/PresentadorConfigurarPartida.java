/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.dtos.ConexionDTO;
import com.itson.dtos.CrearPartidaDTO;
import com.itson.frames.FrmConfigurarPartida;
import com.itson.interfaces.ConfigurarPartidaListener;
import com.itson.modelos.ModeloConfigurarPartida;
import com.itson.p2p.Cliente;
import com.itson.p2p.Protocolo;
import com.itson.p2p.Servidor;
import dominio.ColoresJugadores;
import dominio.Jugador;
import java.awt.Color;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class PresentadorConfigurarPartida implements ConfigurarPartidaListener {

    private ModeloConfigurarPartida model = new ModeloConfigurarPartida();
    private FrmConfigurarPartida view = new FrmConfigurarPartida();
    private Jugador anfitrion; 
    private PresentadorLobby presentadorLobby;
    public PresentadorConfigurarPartida(Jugador anfitrion) {
        view = new FrmConfigurarPartida(anfitrion);
        this.view.setListener(this);
        this.anfitrion  = anfitrion; 
    }

    @Override
    public void clickBotonVolverInicio() {
        new PresentadorPantallaPrincipal().mostrarPantallaPrincipal();
    }

    @Override
    public void clickBotonCrearPartida(CrearPartidaDTO crearPartidaDTO) {
        ColoresJugadores coloresJugadores = new ColoresJugadores();
        
        coloresJugadores.addColor(anfitrion.getNombre(), anfitrion.getColorJugador());
        crearPartidaDTO.setColoresJugadores(coloresJugadores);
        presentadorLobby = new PresentadorLobby(anfitrion); 
        presentadorLobby.establecerPartidaLobby(model.crearNuevaPartida(crearPartidaDTO));
        presentadorLobby.mostrarDatosPartida(model.crearNuevaPartida(crearPartidaDTO));   
        
        this.crearServer();
    }

        public void crearServer(){
        try {
            Servidor server = new Servidor(9999);
            Cliente cliente = new Cliente();
            Protocolo protocolo = new Protocolo();
            server.setCliente(cliente);
            server.setProtocolo(protocolo);
            ConexionDTO nodo = new ConexionDTO(server.getServerSocket().getInetAddress().toString(), server.getServerSocket().getLocalPort(), this.model.getPartida());
            server.setNodo(nodo);
            cliente.setMiServer(server);
        } catch (IOException e) {
        }
    }
    
    public void mostrarPantallaConfigurarPartida() {
        this.view.setVisible(true);
    }
    
    
}
