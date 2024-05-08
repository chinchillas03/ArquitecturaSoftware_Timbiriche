/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.dtos.SolicitarInicioDTO;
import com.itson.frames.FrmJuego;
import com.itson.interfaces.JuegoListener;
import com.itson.modelos.ModeloJuego;
import dominio.Tablero;

/**
 *
 * @author Usuario
 */
public class PresentadorJuego implements JuegoListener {

    private FrmJuego view;
    private ModeloJuego model = new ModeloJuego();

    public PresentadorJuego() {
        this.view = new FrmJuego(); 
        this.view.setListener(this);
    }

    @Override
    public void ponerLinea() {

    }

    @Override
    public void clickBotonSalir() {
        new PresentadorGanador().mostrarPantallaGanador();
    }

    public void iniciarPantallaJuego(SolicitarInicioDTO solicitarInicioDTO) {
        Tablero tablero = model.inicializarTableroDeJuego(solicitarInicioDTO);
        this.view = new FrmJuego(tablero);
                
        this.view.setVisible(true);
       
    }

    public void mostrarPantallaJuego() {
        this.view.setVisible(true);
    }

}
