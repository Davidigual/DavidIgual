package org.iesch.Interfaz;

import org.iesch.Clases.Jugadores;
import org.iesch.Clases.Pistas;
import org.iesch.Metodos.Metodos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class Interfaz extends JFrame implements ActionListener{
    private  JPanel panelCentral;
    private  JPanel panelInferior;
    private JButton mostar_pistas_json;
    private JButton reservar_pista_padel;
    private JButton extraer_reservas_fichero;
    private JButton modificar_reserva;
    private JButton anadirte_jugador;
    private JButton extraer_jugadores_xml;
    private JButton borrar_contenido;
    private JButton insertar_partidos;
    private JButton anadir_resultado_partido;
    private JButton mostar_resultados;
    private JButton salir_menu;
    private JButton BBDD;
    public Interfaz() throws Exception {
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(850,700));

        // Panel Superior
        JPanel panelSuperior = new JPanel(new FlowLayout());
        panelSuperior.setBackground(Color.BLACK);
        //Interfaz Gráfica
        JLabel label = new JLabel("WELCOME TO PADEL DAVID");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 40));
        label.setForeground(Color.YELLOW);
        panelSuperior.add(label);

        this.getContentPane().add(panelSuperior, BorderLayout.NORTH);

        //Panel Central
        this.panelCentral=new JPanel(new FlowLayout());
        this.panelCentral.setBackground(Color.BLACK);

        this.mostar_pistas_json = new JButton("Mostar pistas en JSON");
        this.mostar_pistas_json.setPreferredSize(new Dimension(250,80));
        this.mostar_pistas_json.addActionListener(this);

        this.reservar_pista_padel=new JButton("Reservar pista padel");
        this.reservar_pista_padel.setPreferredSize(new Dimension(250,80));
        this.reservar_pista_padel.addActionListener(this);

        this.extraer_reservas_fichero=new JButton("Extraer reservas a un fichero");
        this.extraer_reservas_fichero.setPreferredSize(new Dimension(250,80));
        this.extraer_reservas_fichero.addActionListener(this);

        this.modificar_reserva= new JButton("Modificar reserva");
        this.modificar_reserva.setPreferredSize(new Dimension(250,80));
        this.modificar_reserva.addActionListener(this);

        this.anadirte_jugador=new JButton("Añadirte como jugador");
        this.anadirte_jugador.setPreferredSize(new Dimension(250,80));
        this.anadirte_jugador.addActionListener(this);

        this.extraer_jugadores_xml=new JButton("Extraer Jugadores XML");
        this.extraer_jugadores_xml.setPreferredSize(new Dimension(250,80));
        this.extraer_jugadores_xml.addActionListener(this);

        this.insertar_partidos=new JButton("Insertar Partidos");
        this.insertar_partidos.setPreferredSize(new Dimension(250,80));
        this.insertar_partidos.addActionListener(this);

        this.anadir_resultado_partido=new JButton("Añadir resultado partido");
        this.anadir_resultado_partido.setPreferredSize(new Dimension(250,80));
        this.anadir_resultado_partido.addActionListener(this);

        this.mostar_resultados=new JButton("Mostar Resultados Partidos");
        this.mostar_resultados.setPreferredSize(new Dimension(250,80));
        this.mostar_resultados.addActionListener(this);

        this.borrar_contenido=new JButton("Borrar Contenido");
        this.borrar_contenido.setPreferredSize(new Dimension(250,80));
        this.borrar_contenido.addActionListener(this);

        this.salir_menu=new JButton("Salir del menu");
        this.salir_menu.setPreferredSize(new Dimension(250,80));
        this.salir_menu.addActionListener(this);

        this.BBDD= new JButton("BBDD Padel");
        this.BBDD.setPreferredSize(new Dimension(250,80));
        this.BBDD.addActionListener(this);

        this.panelCentral.add(mostar_pistas_json);
        this.panelCentral.add(extraer_reservas_fichero);
        this.panelCentral.add(extraer_jugadores_xml);
        this.panelCentral.add(anadirte_jugador);
        this.panelCentral.add(reservar_pista_padel);
        this.panelCentral.add(modificar_reserva);
        this.panelCentral.add(insertar_partidos);
        this.panelCentral.add(anadir_resultado_partido);
        this.panelCentral.add(mostar_resultados);

        this.getContentPane().add(panelCentral,BorderLayout.CENTER);


        //Panel inferior
        this.panelInferior=new JPanel(new FlowLayout());
        this.panelInferior.setBackground(Color.BLACK);

        this.panelInferior.add(borrar_contenido);
        this.panelInferior.add(BBDD);
        this.panelInferior.add(salir_menu);

        this.getContentPane().add(panelInferior,BorderLayout.SOUTH);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Metodos metodos = new Metodos();
        if (e.getSource() == mostar_pistas_json) {
            JOptionPane.showMessageDialog(null, "Extrayendo Pistas a un JSON");
            metodos.extraer_Pistas_Json();
        } else if (e.getSource() == reservar_pista_padel) {
            // Metodo jugador reserva una pista
            JOptionPane.showMessageDialog(null, "Vamos a reservar una Pista de Padel");
            String p_dni = JOptionPane.showInputDialog("Introduce tu dni para reserva");
            String p_nombre = JOptionPane.showInputDialog("Introduce tu nombre a reservar");
            String p_apellidos = JOptionPane.showInputDialog("Introduce tus apellidos para reservar");
            if (p_dni == null || p_nombre == null || p_apellidos == null) {
                JOptionPane.showMessageDialog(null, "No has introducido un dni, un nombre o un apellido");
            } else {
                Pistas pistas = new Pistas();
                try {
                    pistas.reservar(new Jugadores(p_dni, p_nombre, p_apellidos));
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        } else if (e.getSource() == extraer_reservas_fichero) {
            //Metodo extraer datos a fichero
            JOptionPane.showMessageDialog(null, "Extrayendo reservas");
            metodos.extraerReservas();
        } else if (e.getSource() == modificar_reserva) {
            //Metodo modificar una reserva
            JOptionPane.showMessageDialog(null, "Modificando una reserva");
            metodos.recorre_Reservas();
            metodos.update_Reservas();
        } else if (e.getSource() == anadirte_jugador) {
            // Metodo añadirte como jugador para poder reservar
            JOptionPane.showMessageDialog(null, "Vamos a añadirte como jugador");
            String j_dni = JOptionPane.showInputDialog("Introduce tu dni ");
            String j_nombre = JOptionPane.showInputDialog("Introduce tu nombre ");
            String j_apellidos = JOptionPane.showInputDialog("Introduce tus apellidos ");
            if (j_dni == null || j_nombre == null || j_apellidos == null) {
                JOptionPane.showMessageDialog(null, "No has introducido un dni, un nombre o un apellido");
            } else {
                metodos.anadir_Jugador(new Jugadores(j_dni, j_nombre, j_apellidos));
            }
        } else if (e.getSource() == extraer_jugadores_xml) {
            //Extrayendo jugadores a un JSON
            JOptionPane.showMessageDialog(null, "Extrayendo Jugadores al fichero XML");
            metodos.extraer_Jugadores_Xml();
        } else if (e.getSource() == borrar_contenido) {
            JFrame jFrame1 = new JFrame("Menú de Borrado");
            jFrame1.dispose();
            jFrame1.setSize(300, 150);
            jFrame1.setLayout(new FlowLayout());
            jFrame1.getContentPane().setBackground(Color.BLACK);

            JComboBox<String> opcion = new JComboBox<>(new String[]{
                    "Borrar Jugadores", "Borrar Reservas","Borrar Partidos"
            });
            opcion.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String opciones = (String) opcion.getSelectedItem();
                    switch (Objects.requireNonNull(opciones)) {
                        case "Borrar Jugadores" -> {
                            try {
                                metodos.borrar_Jugadores();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        case "Borrar Reservas" -> metodos.borrar_Reservas();
                        case "Borrar Partidos"-> metodos.borrarPartidos();
                    }
                }
            });
            jFrame1.add(opcion);
            jFrame1.setLocationRelativeTo(null);
            jFrame1.setVisible(true);
        } else if (e.getSource() == insertar_partidos) {
            metodos.insertar_Partidos();
        } else if (e.getSource() == anadir_resultado_partido) {
            metodos.recorrer_Partidos();
            metodos.anadir_Resultado_Bbdd();
        } else if (e.getSource()==mostar_resultados) {
            metodos.recorrer_Resultados();
        } else if (e.getSource()==salir_menu){
            JOptionPane.showMessageDialog(null, "Hasta pronto !!");
            System.exit(0);
        } else if (e.getSource()==BBDD) {
            metodos.leer_Bbdd();
        }
    }
}

