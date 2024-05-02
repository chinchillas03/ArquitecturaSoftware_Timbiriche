/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.awt.Color;
import java.util.LinkedList;
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
    private ImageIcon avatar;

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

    public ImageIcon getAvatar() {
        return avatar;
    }

    public void setAvatar(ImageIcon avatar) {
        this.avatar = avatar;
    }
    
    public List<ImageIcon> setAvatares() {
        List<ImageIcon> avatares = new LinkedList<>();
        
        avatares.add(new ImageIcon(getClass().getResource("/Player Azul.png")));
        avatares.add(new ImageIcon(getClass().getResource("/Player Rojo.png")));
        avatares.add(new ImageIcon(getClass().getResource("/Player Amarillo.png")));
        avatares.add(new ImageIcon(getClass().getResource("/Player Verde.png")));
        
        return avatares;
    }
    
    public List<ImageIcon> getAvatares(){
        return setAvatares();
    }

    public List<Color> cargarColores(){
        List<Color> colores = new LinkedList<>();
        
        colores.add(Color.BLUE);
        colores.add(Color.RED);
        colores.add(Color.YELLOW);
        colores.add(Color.GREEN);
        
        return colores;
    }
    
   

    
}
