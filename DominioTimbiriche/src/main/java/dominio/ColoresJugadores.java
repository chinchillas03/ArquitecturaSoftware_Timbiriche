/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.awt.Color;
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author xfs85
 */
public class ColoresJugadores implements Serializable{

    private HashMap<String, Color> coloresJugadores = new HashMap<>();

    public void addColor(String jugador, Color color) {

        coloresJugadores.put(jugador, color);
    }

    public Color obtenerColor(String jugador) {
        return coloresJugadores.get(jugador);
        
    }

}
