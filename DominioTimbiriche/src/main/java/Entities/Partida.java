/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import com.itson.dtos.UnirsePartidaDTO;
import Aggregates.ColoresJugadores;
import ValueObjects.DimensionTablero;
import Aggregates.Tablero;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList; 
/**
 *
 * @author Usuario
 */
public class Partida implements Serializable{

    private List<Jugador> jugadores;
    private Jugador turno;
    private String codigo;
    private Tablero tablero; 
    private ColoresJugadores coloresJugadores;

    public Partida solicitudNuevaPartida(String codigo, DimensionTablero dimension, Jugador jugador, ColoresJugadores coloresJugadores) {
        // creación de la nueva partida sin datos
        Partida nuevaPartida = new Partida();

        // establecer el codigo a la partida
        nuevaPartida.setCodigo(codigo);
        
        jugadores = new ArrayList<Jugador>(); 
        // establecer una lista de jugadores a la patida
        nuevaPartida.setJugadores(jugadores);
        
        nuevaPartida.setColoresJugadores(coloresJugadores);
        
        // agregar a la lista de jugadores al jugador anfitrion de la partida
        jugadores.add(jugador);

        // crear un tablero con las dimensiones requeridas y asignarselo a la partida

        nuevaPartida.setTablero(crearTableroPartida(dimension));
        
        return nuevaPartida;
    }

    public Tablero crearTableroPartida(DimensionTablero dimension) {
        this.tablero = new Tablero(); 
        return this.tablero.crearTablero(dimension);
    }

    public boolean validaCodigoPartida(String codigo) {
        return codigo.matches("[0-9]+");
    }

    public boolean validaDimensionTablero(DimensionTablero dimension) {
        if (dimension.equals(DimensionTablero.DIEZxDIEZ)
                || dimension.equals(DimensionTablero.QUINCExQUINCE)
                || dimension.equals(DimensionTablero.VEINTExVEINTE)) {
            return true;
        } else {
            return false;
        }
    }

    public UnirsePartidaDTO crearDTO (){
        UnirsePartidaDTO dto = new UnirsePartidaDTO();
        dto.setPartida(this);
        return dto;
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Jugador getTurno() {
        return turno;
    }

    public void setTurno(Jugador turno) {
        this.turno = turno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }


    @Override
    public String toString() {
        return "Partida{" + "jugadores=" + jugadores + ", turno=" + turno + ", codigo=" + codigo + ", tablero=" + tablero + '}';
    }


    public ColoresJugadores getColoresJugadores() {
        return coloresJugadores;
    }

    public void setColoresJugadores(ColoresJugadores coloresJugadores) {
        this.coloresJugadores = coloresJugadores;
    }
    

}
