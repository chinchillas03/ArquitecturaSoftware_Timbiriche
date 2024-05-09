/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValueObjects;

import java.awt.Graphics;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Usuario
 */
public class Punto {

    private boolean ocupado;
    private int x;
    private int y;
    private float width;
    private float height;
    private String owner;
    private Ellipse2D.Double puntoGrafico ; 

    public Punto() {
    }
    
    
    public Punto(int x, int y, float width, float height, String owner, Ellipse2D.Double puntoGrafico) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.owner = owner;
        this.puntoGrafico = puntoGrafico;
    }

    public boolean estaOcupado() {
        return ocupado;
    }
    
    public void establecerNuevoPropietario(String owner){
        this.ocupado = true; 
        this.owner = owner;
    }
    public Punto creaNuevoPunto(int x, int y, float width, float height, String owner) {
        
        crearRepresentacionGrafica(x, y, width, height);
        return new Punto(x, y, width, height, owner, this.puntoGrafico);
        
    }
    
    public void crearRepresentacionGrafica(double x, double y, double w, double h){
        this.puntoGrafico = new Ellipse2D.Double(x, y, w, h); 
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Ellipse2D.Double getPuntoGrafico() {
        return puntoGrafico;
    }

    public void setPuntoGrafico(Ellipse2D.Double puntoGrafico) {
        this.puntoGrafico = puntoGrafico;
    }


    
    
}
