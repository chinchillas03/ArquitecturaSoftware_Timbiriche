/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.presentadores;

import com.itson.frames.FrmPantallaPrincipal;
import com.itson.interfaces.PantallaPrincipalListener;
import com.itson.modelos.ModeloPantallaPrincipal;
import dominio.Jugador;
import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PresentadorPantallaPrincipal implements PantallaPrincipalListener{
    
    private final FrmPantallaPrincipal view; 
    private final ModeloPantallaPrincipal model = new ModeloPantallaPrincipal();
    private int indexAvatar = 0;
    private int indexColor = 0;
    private Jugador anfitrion; 
    List<ImageIcon> avatares = model.getAvatares();
    List<Color> colores = model.getColores();
    
    
    public PresentadorPantallaPrincipal(){
        anfitrion  = crearJugadorAnfitrion(); 
        view = new FrmPantallaPrincipal(anfitrion); 
        this.view.setListener(this);
        this.view.repaint();
        
       
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
       if (avatares != null && !avatares.isEmpty()) {
            indexAvatar = (indexAvatar + 1) % model.getAvatares().size();
            indexColor = (indexColor + 1) % model.getColores().size();
            mostrarAvatarActual();
        }
    }

    @Override
    public void cambioAvatarIzquierda() {
         if (avatares != null && !avatares.isEmpty()) {
            indexAvatar = (indexAvatar - 1 + model.getAvatares().size()) % model.getAvatares().size();
            indexColor = (indexColor - 1 + model.getColores().size()) % model.getColores().size();
            mostrarAvatarActual();
        } 
    }
    
    public void mostrarPantallaPrincipal(){
        this.view.setVisible(true);
    }

 
    
        private ImageIcon mostrarAvatarActual() {
          
        if (avatares != null && !avatares.isEmpty()) {
            ImageIcon avatarActual = avatares.get(indexAvatar);
            Color colorActual = colores.get(indexColor);
            anfitrion.setAvatar(avatarActual);
            anfitrion.setColorJugador(colorActual);
            return view.cambiarAvatar(avatarActual, colorActual);  
        }
        
        return null;
        
}

    @Override
    public void cambiarNombre() {  
       String nombre =  view.abrirDlgCambioNombre();
       anfitrion.setNombre(nombre);
       view.actualizarNombre(nombre);
    }
    
    public Jugador crearJugadorAnfitrion()
    {
        return model.crearJugadorAnfitrion(); 
    }
    
    

}
        
