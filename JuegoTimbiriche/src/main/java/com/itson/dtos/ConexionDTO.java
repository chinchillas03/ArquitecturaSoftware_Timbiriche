/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dtos;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class ConexionDTO implements Serializable{
    
    private String ip;
    private int puerto;

    public String getIp() {
        return ip;
    }

    public ConexionDTO(String ip, int puerto) {
        this.ip = ip;
        this.puerto = puerto;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
    
}
