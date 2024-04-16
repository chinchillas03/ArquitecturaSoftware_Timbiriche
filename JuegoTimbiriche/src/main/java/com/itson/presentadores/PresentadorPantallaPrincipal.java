/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.frames.FrmPantallaPrincipal;
import com.itson.interfaces.PantallaPrincipalListener;
import com.itson.modelos.ModeloPantallaPrincipal;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class PresentadorPantallaPrincipal implements PantallaPrincipalListener{
    
    private final FrmPantallaPrincipal view = new FrmPantallaPrincipal();
    private final ModeloPantallaPrincipal model = new ModeloPantallaPrincipal();
    private int indexAvatar = 0; 
    
    public PresentadorPantallaPrincipal(){
        this.view.setListener(this);
        this.view.repaint();
        cargarAvatares();
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
       if (model.getAvatares() != null && !model.getAvatares().isEmpty()) {
            indexAvatar = (indexAvatar + 1) % model.getAvatares().size();
            mostrarAvatarActual();
        }
    }

    @Override
    public void cambioAvatarIzquierda() {
         if (model.getAvatares() != null && !model.getAvatares().isEmpty()) {
            indexAvatar = (indexAvatar - 1 + model.getAvatares().size()) % model.getAvatares().size();
            mostrarAvatarActual();
        } 
    }
    
    public void mostrarPantallaPrincipal(){
        this.view.setVisible(true);
    }

    public void cargarAvatares(){
        this.model.setAvatares();
    }
    
        private void mostrarAvatarActual() {
          List<ImageIcon> avatares = model.getAvatares();
        if (avatares != null && !avatares.isEmpty()) {
            ImageIcon avatarActual = avatares.get(indexAvatar);
            view.getLblAvatar().setIcon(avatarActual);
            view.repaint();
        }     
        
}

    @Override
    public void clickNombre() {
        
    }
}
        
