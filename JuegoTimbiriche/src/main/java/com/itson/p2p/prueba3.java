/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itson.p2p;

import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class prueba3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Servidor server = new Servidor(9999);
            Cliente cliente = new Cliente();
            Protocolo protocolo = new Protocolo();
            server.setCliente(cliente);
            server.setProtocolo(protocolo);
        } catch (IOException e) {
        }
    }
    
}
