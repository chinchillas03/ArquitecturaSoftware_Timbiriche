/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.frames.FrmPantallaPrincipal;
import com.itson.interfaces.PantallaPrincipalListener;
import com.itson.modelos.ModeloPantallaPrincipal;
import dominio.Jugador;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PresentadorPantallaPrincipal implements PantallaPrincipalListener{
    
    private final FrmPantallaPrincipal view ; 
    private final ModeloPantallaPrincipal model = new ModeloPantallaPrincipal();
    private int indexAvatar = 0; 
    private Jugador anfitrion; 
    
    public PresentadorPantallaPrincipal(){
        anfitrion  = crearJugadorAnfitrion(); 
        view = new FrmPantallaPrincipal(anfitrion); 
        this.view.setListener(this);
        this.view.repaint();
        cargarAvatares();
    }

    
    @Override
    public void clickBotonUnirsePartida() {
        new PresentadorUnirsePartida().mostrarPantallaUnirsePartida();      
    }

    @Override
    public void clickBotonCrearPartida(Jugador anfitrion) {
        new PresentadorConfigurarPartida(anfitrion).mostrarPantallaConfigurarPartida();
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
    public void cambiarNombre() {
        String nombre = JOptionPane.showInputDialog(view, "Ingresa tu nombre");
       
        if(nombre != null){
             model.setNombre(nombre);
             view.getLblNombre().setText(model.getNombre());  
        }else{
            JOptionPane.showMessageDialog(view, "Ingresa un nombre valido");
        }
       
        
    }
    
    public Jugador crearJugadorAnfitrion()
    {
        return model.crearJugadorAnfitrion(); 
    }


}
        
