/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itson.p2p;

import com.itson.dtos.ConexionDTO;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int puerto1 = 9998;
            Servidor servidor = new Servidor(puerto1);
            Cliente cliente = new Cliente();
            servidor.setCliente(cliente);
            cliente.setMiServer(servidor);          
            cliente.conectar("localhost", 9999);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}
