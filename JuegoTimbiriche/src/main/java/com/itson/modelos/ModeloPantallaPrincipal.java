/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.modelos;

import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class ModeloPantallaPrincipal {
    
    private String nombre;
    private List<ImageIcon> avatares;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ImageIcon> getAvatares() {
        return avatares;
    }

    public void setAvatares() {
        this.avatares = new LinkedList<>();
        avatares.add(new ImageIcon("com.itson.imgAvatares/PlayerAmarillo.png"));
        avatares.add(new ImageIcon("com.itson.imgAvatares/PlayerAzul.png"));
        avatares.add(new ImageIcon("com.itson.imgAvatares/PlayerRojo.png"));
        avatares.add(new ImageIcon("com.itson.imgAvatares/PlayerVerde.png"));
    }
  
}
