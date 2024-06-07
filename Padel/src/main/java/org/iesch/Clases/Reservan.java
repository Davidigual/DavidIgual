package org.iesch.Clases;

public class Reservan {
    private int id_reserva;
    private String jugadores;
    private int pista;
    private String fecha_reserva;


    public Reservan() {
    }

    public Reservan(Jugadores jugadores, String fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getJugadores() {
        return jugadores;
    }

    public void setJugadores(String dni_jugador) {
        this.jugadores = dni_jugador;
    }

    public String getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(String fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public int getPista() {return pista;}

    public void setPista(int pista) {this.pista = pista;}

    @Override
    public String toString() {
        return "Reservan{" +
                "id_reserva=" + id_reserva +
                ", jugadores='" + jugadores + '\'' +
                ", pista=" + pista +
                ", fecha_reserva='" + fecha_reserva + '\'' +
                '}';
    }
}




