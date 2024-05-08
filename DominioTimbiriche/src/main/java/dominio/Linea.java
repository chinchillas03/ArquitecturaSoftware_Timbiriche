/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.awt.geom.Ellipse2D;

/**
 *
 * @author Usuario
 */
public class Linea {
    
    private Ellipse2D punto1;
    private Ellipse2D punto2;
    private Jugador propietario;
    private Cuadro cuadro; 
    
    public Ellipse2D getPunto1() {
        return punto1;
    }

    public void setPunto1(Ellipse2D punto1) {
        this.punto1 = punto1;
    }

    public Ellipse2D getPunto2() {
        return punto2;
    }

    public void setPunto2(Ellipse2D punto2) {
        this.punto2 = punto2;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }
    
}
