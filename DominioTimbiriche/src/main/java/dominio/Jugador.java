/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Jugador {
    
    private String nombre;
    private List<Cuadro> cuadros;
    private TipoJugador tipoJugador;
    private EstadoJugador estado;
    private Color colorJugador;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cuadro> getCuadros() {
        return cuadros;
    }

    public void setCuadros(List<Cuadro> cuadros) {
        this.cuadros = cuadros;
    }

    public TipoJugador getTipoJugador() {
        return tipoJugador;
    }

    public void setTipoJugador(TipoJugador tipoJugador) {
        this.tipoJugador = tipoJugador;
    }

    public EstadoJugador getEstado() {
        return estado;
    }

    public void setEstado(EstadoJugador estado) {
        this.estado = estado;
    }

    public Color getColorJugador() {
        return colorJugador;
    }

    public void setColorJugador(Color colorJugador) {
        this.colorJugador = colorJugador;
    }


    
}
