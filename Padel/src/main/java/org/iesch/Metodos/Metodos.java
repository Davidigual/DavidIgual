package org.iesch.Metodos;


import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import org.iesch.Clases.*;


import javax.swing.*;
import java.awt.*;
import java.io.*;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Metodos {
    private final String url = "jdbc:mysql://localhost:3306/padel";
    private final String user = "root";
    private final String password = "1234";

    //Conexion a la base de datos
    public Connection conector() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    public List<Pistas> obtenerTodoPistas() {
        List<Pistas>lista_pistas=new ArrayList<>();
        try {
            Connection connection = conector();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from pistas");
            while (resultSet.next()){
                Pistas pistas=new Pistas();
                int codigo_pista= resultSet.getInt("codigo_pistas");
                String color= resultSet.getString("color");
                pistas.setCodigo_pistas(codigo_pista);
                pistas.setColor(color);
               lista_pistas.add(pistas);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
        return lista_pistas;
    }
    //Asignamos una pista aleatoria con este metodo usado en Pistas en el metodo reservar.
    public int obtener_Conteo_Pistas(){
        int numero_pistas=0;
        try {
            Connection connection = conector();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select count(codigo_pistas) from pistas");
            while (resultSet.next()){
                int total_pistas= resultSet.getInt(1);
                numero_pistas = (int) (Math.random() * total_pistas);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

        return numero_pistas;
    }
    public List<Reservan>obtenerReservas(){
        List<Reservan> reservas = new ArrayList<>();
        try {
            Connection connection = conector();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from reservas");
            while (resultSet.next()){
                Reservan reservan=new Reservan();
                int id_reserva=resultSet.getInt("id_reserva");
                String fecha_reserva=resultSet.getString("fecha_reserva");
                String dni_jugador=resultSet.getString("dni_jugador");
                int codigo_pista=resultSet.getInt("cod_pista");
                reservan.setId_reserva(id_reserva);
                reservan.setFecha_reserva(fecha_reserva);
                reservan.setJugadores(dni_jugador);
                reservan.setPista(codigo_pista);
                //Añadimos datos
                reservas.add(reservan);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return reservas;
    }
    public void extraerReservas(){
        List<Reservan>ext_reservas=obtenerReservas();
        File archivo_salida=new File("Reservas.txt");
        try {
            if (!archivo_salida.exists()){
                archivo_salida.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(archivo_salida);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                for (Reservan reservas:ext_reservas){
                    bufferedWriter.write(reservas.toString());
                }
                bufferedWriter.close();
                mostar_Reservas();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void mostar_Reservas(){
        File reserva=new File("reservas.txt");
        StringBuilder contenido=new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(reserva));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String [] lineas=linea.split("}");
                for (String reservas:lineas) {
                    contenido.append(reservas).append("\n");
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JTextArea textArea = new JTextArea(String.valueOf(contenido));
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(300, 200));
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JOptionPane.showMessageDialog(null, scrollPane, "Reservas", JOptionPane.INFORMATION_MESSAGE);
    }
    public void update_Reservas(){
        //Buscar las reservas para modificar
        String id_reservaCambiar= JOptionPane.showInputDialog("Id de la reserva a modificar");
        String dni_reserva=JOptionPane.showInputDialog("Dni a modificar de la reserva");
        String fecha_reserva=JOptionPane.showInputDialog("Dime nueva fecha de reserva");
        String codigo_pista=JOptionPane.showInputDialog("Introduce el nuevo codigo de pista");

        try {
            Connection connection = conector();
            PreparedStatement preparedStatement=connection.prepareStatement("update reservas set fecha_reserva=?,cod_pista=?,dni_jugador=? where id_reserva=? ");
            preparedStatement.setString(1,fecha_reserva);
            preparedStatement.setString(2,codigo_pista);
            preparedStatement.setString(3,dni_reserva);
            preparedStatement.setString(4,id_reservaCambiar);

            if (id_reservaCambiar == null){
                JOptionPane.showMessageDialog(null,"No has pasado un Id para modificar la reserva");
            }else {
                //Ejecutar la consulta
                preparedStatement.executeUpdate();
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void anadir_Jugador(Jugadores jugadores){
        try {
            Connection connection = conector();
            PreparedStatement preparedStatement=connection.prepareStatement("insert into jugadores(dni,nombre,apellidos) values (?,?,?)");
            preparedStatement.setString(1, jugadores.getDni());
            preparedStatement.setString(2, jugadores.getNombre());
            preparedStatement.setString(3,jugadores.getApellidos());
            //Ejecutar la consulta
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void extraer_Jugadores_Xml()  {
        List<Jugadores>lista_jugadores=new ArrayList<>();
        try {
            Connection connection= conector();
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery("select * from jugadores");
            while (resultSet.next()){
                String dni=resultSet.getString("dni");
                String nombre= resultSet.getString("nombre");
                String apellidos=resultSet.getString("apellidos");
                Jugadores jugador=new Jugadores(dni,nombre,apellidos);
                lista_jugadores.add(jugador);
            }
                JugadoresList jugadoresList=new JugadoresList();
                jugadoresList.setListaJugadores(lista_jugadores);
                JAXBContext jaxbContext = JAXBContext.newInstance(JugadoresList.class);
                Marshaller marshaller = jaxbContext.createMarshaller();
                marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshaller.marshal(jugadoresList,new File("jugadores.xml"));
                //Cerramos conexiones
                resultSet.close();
                statement.close();
                connection.close();
                leerjugadoresXml();
        } catch (SQLException | JAXBException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void leerjugadoresXml() throws IOException {
        File xmlfile=new File("jugadores.xml");
        StringBuilder contenido = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(xmlfile));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JTextArea textArea = new JTextArea(String.valueOf(contenido));
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 300));
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JOptionPane.showMessageDialog(null, scrollPane, "Jugadores xml", JOptionPane.INFORMATION_MESSAGE);
    }
    public void leer_Bbdd(){
        File sql=new File("padel.sql");
        StringBuilder contenido = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sql));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JTextArea textArea = new JTextArea(String.valueOf(contenido));
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(1000, 700));
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JOptionPane.showMessageDialog(null, scrollPane, "Base de Datos", JOptionPane.INFORMATION_MESSAGE);
    }
    public void extraer_Pistas_Json() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("Pistas.json"), obtenerTodoPistas());
            mostar_Pistas_Json();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void mostar_Pistas_Json(){
        File json=new File("Pistas.json");
        StringBuilder contenido = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(json));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String [] lineas=linea.split(",");
                for (String pistas:lineas) {
                    contenido.append(pistas).append("\n");
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JTextArea textArea = new JTextArea(String.valueOf(contenido));
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(200, 200));
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JOptionPane.showMessageDialog(null, scrollPane, "Pistas Disponibles", JOptionPane.INFORMATION_MESSAGE);
    }
    public  int borrar_Jugadores() throws IOException {
        leerjugadoresXml();
        JOptionPane.showMessageDialog(null,"Vamos a borrar un jugador");
       String dni_buscar=JOptionPane.showInputDialog("Introduce el Dni ");
        int numerofilas=0;
        try {
            Connection connection = conector();
            PreparedStatement preparedStatement=connection.prepareStatement("delete from jugadores where dni=?");
            preparedStatement.setString(1,dni_buscar);

            //Ejecutar la consulta
            numerofilas=preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

            if (numerofilas ==0 && dni_buscar==null){
                JOptionPane.showMessageDialog(null,"No se ha borrado ningun jugador");
            }else {
                JOptionPane.showMessageDialog(null,"Se ha borrado un jugador");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return numerofilas;
    }
    public  int borrar_Reservas(){
        recorre_Reservas();
        JOptionPane.showMessageDialog(null,"Vamos a borrar una reserva");
        String idReserva=(JOptionPane.showInputDialog("Introduce el Id_reserva "));
        int numerofilas=0;
        try {
            Connection connection = conector();
            PreparedStatement preparedStatement=connection.prepareStatement("delete from reservas where id_reserva=?");
            preparedStatement.setString(1,idReserva);

            //Ejecutar la consulta
            numerofilas=preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

            if (numerofilas ==0 && idReserva==null){
                JOptionPane.showMessageDialog(null, "No se ha borrado ninguna reserva");
            }else {
                JOptionPane.showMessageDialog(null,"Se ha borrado una reserva");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return numerofilas;
    }
    public void insertar_Partidos(){
        String equipo1=JOptionPane.showInputDialog("Dime el equipo 1");
        String equipo2=JOptionPane.showInputDialog("Dime el equipo 2");
        String set_equipo1=JOptionPane.showInputDialog("Dime sets equipo 1");
        String set_equipo2=JOptionPane.showInputDialog("Dime sets equipo 2");
        try {
            Connection connection=conector();
            PreparedStatement preparedStatement=connection.prepareStatement("insert into partidos (equipos,setsEquipo1,setsEquipo2) values (?,?,?)");
            String equipos = "Nombre equipo 1: " +equipo1 + " Nombre equipo 2: " + equipo2;
            preparedStatement.setString(1, equipos);
            preparedStatement.setString(2, set_equipo1);
            preparedStatement.setString(3,set_equipo2);
            //Ejecutar consulta y cerrar conexion
            if (equipo1 == null && equipo2==null && set_equipo1==null&&set_equipo2==null){
                JOptionPane.showMessageDialog(null,"No se han pasado argumentos para añadir a tabla");
            }else {
                preparedStatement.executeUpdate();
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public String equipo_Ganador_Partido() {
        Partidos partidos=new Partidos();
        String id_partido_buscar=(JOptionPane.showInputDialog("Dime el id del partido"));
        try {
            Connection connection= conector();
            PreparedStatement preparedStatement=connection.prepareStatement("select * from partidos where id_partido=?");
            preparedStatement.setString(1,id_partido_buscar);
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                int setEquipo1=resultSet.getInt("setsEquipo1");
                int setEquipo2= resultSet.getInt("setsEquipo2");
                partidos.setSetsganadosequipo1(setEquipo1);
                partidos.setSetsganadosequipo2(setEquipo2);

            }
            if (id_partido_buscar == null) {
                JOptionPane.showMessageDialog(null, "No has pasado un ID a buscar");
                return "Partido no encontrado";
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return partidos.equipo_Ganador();
    }
    public void anadir_Resultado_Bbdd(){
        String fecha_resultados =new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        try {
            Connection connection=conector();
            PreparedStatement preparedStatement=connection.prepareStatement("insert into resultados (equipo_win,fecha_resultado) values (?,?)");
            preparedStatement.setString(1, String.valueOf(equipo_Ganador_Partido()));
            preparedStatement.setString(2, (fecha_resultados));

            //Ejecutar consulta y cerrar conexion
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void recorre_Reservas(){
        List<Reservan> lista_reservas = obtenerReservas();
        DefaultListModel modelo = new DefaultListModel<>();
        for (Reservan reservas : lista_reservas) {
            modelo.addElement(reservas);
        }

        JList jList = new JList<>(modelo);
        JScrollPane scrollPane = new JScrollPane(jList);
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Reservas", JOptionPane.INFORMATION_MESSAGE);
    }
    public List<Partidos> obtenerPartidos(){
        //Sacamos Informacion de Partidos
        List<Partidos>listapartidos=new ArrayList<>();
        try {
            Connection connection= conector();
            PreparedStatement preparedStatement=connection.prepareStatement("select * from partidos");
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                Partidos partidos=new Partidos();
                int id_partido=resultSet.getInt("id_partido");
                String equipos=resultSet.getString("equipos");
                int setEquipo1=resultSet.getInt("setsEquipo1");
                int setEquipo2= resultSet.getInt("setsEquipo2");
                partidos.setId_partido(id_partido);
                partidos.setEquipos(equipos);
                partidos.setSetsganadosequipo1(setEquipo1);
                partidos.setSetsganadosequipo2(setEquipo2);
                listapartidos.add(partidos);
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listapartidos;
    }
    public int borrarPartidos(){
        recorrer_Partidos();
        JOptionPane.showMessageDialog(null,"Vamos a borrar un partido");
        String id_partido=JOptionPane.showInputDialog("Introduce el  ID_partido ");
        int numerofilas=0;
        try {
            Connection connection = conector();
            PreparedStatement preparedStatement=connection.prepareStatement("delete from partidos where id_partido=?");
            preparedStatement.setString(1,id_partido);

            //Ejecutar la consulta
            numerofilas=preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

            if (numerofilas ==0 && id_partido==null){
                JOptionPane.showMessageDialog(null,"No se ha borrado ningun partido");
            }else {
                JOptionPane.showMessageDialog(null,"Se ha borrado un partido");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return numerofilas;
    }
    public void recorrer_Partidos(){
        List<Partidos>partidosList= obtenerPartidos();
        DefaultListModel modelo = new DefaultListModel<>();
        for (Partidos partidos : partidosList) {
            modelo.addElement(partidos);
        }
        JList jList = new JList<>(modelo);
        JScrollPane scrollPane = new JScrollPane(jList);
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Partidos", JOptionPane.INFORMATION_MESSAGE);
    }
    public List<Resultados> obtenerResultados(){
        List<Resultados>listResultados=new ArrayList<>();
        try {
            Connection connection=conector();
            PreparedStatement preparedStatement= connection.prepareStatement("select * from resultados");
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                Resultados resultados=new Resultados();
                int codigo_resultado=resultSet.getInt("codigo_resultado");
                String equipo_ganador=resultSet.getString("equipo_win");
                String fecha_resultado=resultSet.getString("fecha_resultado");
                resultados.setCodigo_resultado(codigo_resultado);
                resultados.setEquipo_win(equipo_ganador);
                resultados.setFecha_resultado(fecha_resultado);
                listResultados.add(resultados);
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listResultados;
    }
    public void recorrer_Resultados(){
        List<Resultados>resultadosList= obtenerResultados();
        DefaultListModel modelo = new DefaultListModel<>();
        for (Resultados resultados : resultadosList) {
            modelo.addElement(resultados);
        }
        JList jList = new JList<>(modelo);
        JScrollPane scrollPane = new JScrollPane(jList);
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}

