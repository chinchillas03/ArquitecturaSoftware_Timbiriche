/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.p2p;

import com.itson.dtos.ConexionDTO;
import Entities.Partida;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Servidor implements Runnable{

    private ServerSocket serverSocket;
    private Cliente cliente;
    private ConexionDTO nodo;
    private Protocolo protocolo;
    private List<ConexionDTO> nodosClientes;
    private Partida partida;
     
    public Servidor (int puerto) throws IOException{
        serverSocket = new ServerSocket(puerto);
        nodosClientes = new LinkedList<>();
        Thread hilo = new Thread(this);
        hilo.start();
    }

    public List<ConexionDTO> getNodosClientes() {
        return nodosClientes;
    }

    public void setNodosClientes(List<ConexionDTO> nodosClientes) {
        this.nodosClientes = nodosClientes;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
        
    }

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public void setServerSocket(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ConexionDTO getNodo() {
        return nodo;
    }

    public void setNodo(ConexionDTO nodo) {
        this.nodo = nodo;
    }

    public Protocolo getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Protocolo protocolo) {
        this.protocolo = protocolo;
    }
    
    public void enviarNuevoNodoACliente(ConexionDTO nuevoNodo) {
        cliente.agregarNodo(nuevoNodo);
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("--------------------------------------------");
                System.out.println("Esperando conexión de cliente...");
                Socket socketConectado = this.serverSocket.accept();
                System.out.println("Cliente conectado");
                ObjectInputStream in = new ObjectInputStream(socketConectado.getInputStream());
                try {
                    ObjectOutputStream out = new ObjectOutputStream(socketConectado.getOutputStream());
                    Object entrada = in.readObject();                          
                    String evento = protocolo.procesarInformacion(entrada);
                    if (evento.equals("CONEXION")) {
                        ConexionDTO nodoNuevo = (ConexionDTO) entrada;
                        System.out.println("Nodo con puerto servidor de: " + nodoNuevo.getPuerto() + " IP: " + nodoNuevo.getIp());
                        System.out.println("--------------------------------------------");
                        System.out.println("");
                        List<ConexionDTO> nodos = cliente.getServidoresNodos();
                        if (nodos.size() <= 0) {
                            nodos.add(this.nodo);
                        }
                        cliente.agregarNodo(nodoNuevo);
                        this.partida.agregarJugador(nodoNuevo.getJugador());
                        this.cliente.refrescarLobby(this.partida.getJugadores(), this.partida);
                        nodosClientes.add(nodoNuevo);
                        out.writeObject(nodos);
                    }
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
