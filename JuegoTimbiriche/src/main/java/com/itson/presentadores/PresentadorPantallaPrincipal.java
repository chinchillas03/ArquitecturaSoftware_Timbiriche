/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.frames.FrmPantallaPrincipal;
import com.itson.interfaces.PantallaPrincipalListener;
import com.itson.modelos.ModeloPantallaPrincipal;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class PresentadorPantallaPrincipal implements PantallaPrincipalListener{
    
    private final FrmPantallaPrincipal view = new FrmPantallaPrincipal();
    private final ModeloPantallaPrincipal model = new ModeloPantallaPrincipal();
    
    public PresentadorPantallaPrincipal(){
        this.view.setListener(this);
        this.view.repaint();
    }

    @Override
    public void clickBotonUnirsePartida() {
        new PresentadorUnirsePartida().mostrarPantallaUnirsePartida();      
    }

    @Override
    public void clickBotonCrearPartida() {
        new PresentadorConfigurarPartida().mostrarPantallaConfigurarPartida();
   }

    @Override
    public void cambioAvatarDerecha() {
        
    }

    @Override
    public void cambioAvatarIzquierda() {
        
    }
    
    public void mostrarPantallaPrincipal(){
        this.view.setVisible(true);
    }

    public void cargarAvatares(){
        this.model.setAvatares();
    }
    
}
