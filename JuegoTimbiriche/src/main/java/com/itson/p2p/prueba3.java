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
            int puerto1 = 9997;
            Servidor servidor = new Servidor(puerto1);
            Cliente cliente = new Cliente();            
            Protocolo protocolo = new Protocolo();
            servidor.setCliente(cliente);
            servidor.setProtocolo(protocolo);
            cliente.setMiServer(servidor);          
            cliente.conectar("localhost", 9998);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
