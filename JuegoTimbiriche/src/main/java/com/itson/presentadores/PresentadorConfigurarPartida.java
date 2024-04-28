/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.dtos.CrearPartidaDTO;
import com.itson.frames.FrmConfigurarPartida;
import com.itson.interfaces.ConfigurarPartidaListener;
import com.itson.modelos.ModeloConfiguarPartida;
import dominio.Jugador;

/**
 *
 * @author Usuario
 */
public class PresentadorConfigurarPartida implements ConfigurarPartidaListener {

    private ModeloConfiguarPartida model = new ModeloConfiguarPartida();
    private FrmConfigurarPartida view = new FrmConfigurarPartida();
    private Jugador anfitrion; 
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
        model.crearNuevaPartida(crearPartidaDTO);
    }

    public void mostrarPantallaConfigurarPartida() {
        this.view.setVisible(true);
    }
}
