/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.modelos;

//import dominio.Jugador;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class ModeloLobby {
    
    //private Jugador[] jugadores;
    private ImageIcon[] avatares;
    private String codigo;
    private String dimension;

//    public Jugador[] getJugadores() {
//        return jugadores;
//    }
//
//    public void setJugadores(Jugador[] jugadores) {
//        this.jugadores = jugadores;
//    }

    public ImageIcon[] getAvatares() {
        return avatares;
    }

    public void setAvatares(ImageIcon[] avatares) {
        this.avatares = avatares;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
    
}
