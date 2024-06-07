package org.iesch.Clases;

import org.iesch.Metodos.Metodos;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Pistas {
    private int codigo_pistas;
    private String color;

    private final List<Reservan>lista_reservas=new ArrayList<>();

    public Pistas(int codigo_pistas, String color){
        this.codigo_pistas = codigo_pistas;
        this.color = color;

    }

    public Pistas() {
    }

    public int getCodigo_pistas() {
        return codigo_pistas;
    }

    public void setCodigo_pistas(int codigo_pistas) {
        this.codigo_pistas = codigo_pistas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Pistas{" +
                "codigo_pista=" + codigo_pistas +
                ", color='" + color + '\'' +
                '}';
    }
    public void reservar(Jugadores jugadores) throws SQLException {
        Reservan reservan = new Reservan(jugadores,new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
        lista_reservas.add(reservan);
        try {
            //Llamamos al concetor de mysql
            Metodos metodos = new Metodos();
            Connection connection = metodos.conector();
            //Hacemos el Insert a la base de datos
            PreparedStatement preparedStatement=connection.prepareStatement("insert into reservas(fecha_reserva,dni_jugador,cod_pista) values (?,?,?)");
            preparedStatement.setString(1, reservan.getFecha_reserva());
            preparedStatement.setString(2, jugadores.getDni());
            preparedStatement.setInt(3,metodos.obtener_Conteo_Pistas());

            //Ejecutar la consulta para su insercion
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
