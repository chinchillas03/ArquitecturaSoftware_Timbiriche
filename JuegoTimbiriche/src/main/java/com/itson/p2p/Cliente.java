/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.p2p;

import com.itson.dtos.ConexionDTO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Cliente implements Runnable{

    private Socket socket;
    private Socket socket2;
    private Socket socket3;
    private Servidor miServer;    
    private List<ConexionDTO> servidoresNodos;
    
    public Cliente (){
        this.servidoresNodos = new LinkedList<>();
        Thread hilo = new Thread(this);
        hilo.start();
    }
    
    @Override
    public void run() {
        
    }

    public List<ConexionDTO> getServidoresNodos() {
        return servidoresNodos;
    }

    public void setServidoresNodos(List<ConexionDTO> servidoresNodos) {
        this.servidoresNodos = servidoresNodos;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public Servidor getMiServer() {
        return miServer;
    }

    public void setMiServer(Servidor miServer) {
        this.miServer = miServer;
    }
    
    public void agregarNodo(ConexionDTO nuevoNodo) {
        this.servidoresNodos.add(nuevoNodo);
    }
    
    public void conectar(String ip, int puerto) {
        try {
            this.socket = new Socket(ip, puerto);
            setSocket(socket);
            ConexionDTO nodo = new ConexionDTO(miServer.getServerSocket().getInetAddress().toString(), miServer.getServerSocket().getLocalPort());
            ObjectOutputStream out = new ObjectOutputStream(this.socket.getOutputStream());
            out.writeObject(nodo);
            out.flush();
            ObjectInputStream in = new ObjectInputStream(this.socket.getInputStream());
            List<ConexionDTO> nodosConocidos = (List<ConexionDTO>) in.readObject();
            for (ConexionDTO nodoConocido : nodosConocidos) {
                System.out.println("IP: " + nodoConocido.getIp() + ", Puerto: " + nodoConocido.getPuerto());
            }
            this.setServidoresNodos(nodosConocidos);            
            ConexionDTO nodoPrincipal = new ConexionDTO(ip, puerto);            
            this.conectarOtrosNodos(nodoPrincipal);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void conectarOtrosNodos(ConexionDTO nodoPrincipal) {
        try {
            for (ConexionDTO servidoresNodo : servidoresNodos) {
                if (servidoresNodo.getPuerto() == this.miServer.getNodo().getPuerto()) {
                } else if (servidoresNodo.getPuerto() == nodoPrincipal.getPuerto()) {
                } else {
                    String ip = "192.168.1.66";
                    int puerto = servidoresNodo.getPuerto();
                    ConexionDTO dat = miServer.getNodo();
                    if (socket2 == null) {
                        socket2 = new Socket(ip, puerto);
                        ObjectOutputStream out = new ObjectOutputStream(socket2.getOutputStream());
                        out.writeObject(dat);
                    } else if (socket3 == null) {
                        socket3 = new Socket(ip, puerto);
                        ObjectOutputStream out = new ObjectOutputStream(socket3.getOutputStream());
                        out.writeObject(dat);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
   
}