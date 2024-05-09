/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.modelos;

import Entities.Jugador;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class ModeloPantallaPrincipal {

    public void setNombre(String nombre) {
        crearJugadorAnfitrion().setNombre(nombre);
    }

    public void setAvatar(ImageIcon avatar) {
        crearJugadorAnfitrion().setAvatar(avatar);
    }

    public List<ImageIcon> getAvatares() {
        return crearJugadorAnfitrion().getAvatares();
    }

    public void setColor(Color color) {
        crearJugadorAnfitrion().setColorJugador(color);
    }

    public List<Color> getColores() {
       return crearJugadorAnfitrion().cargarColores();
    }

    public Jugador crearJugadorAnfitrion() {
        return new Jugador();
    }

}
