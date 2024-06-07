package org.iesch.Clases;

public class Partidos {
    private Jugadores equipo1;
    private Jugadores equipo2;
    private int setsganadosequipo1;
    private int setsganadosequipo2;
    private String equipos;
    private int id_partido;
    public Partidos() {
    }

    public Partidos(Jugadores equipo1, int setsganadosequipo1, int setsganadosequipo2, String equipos, int id_partido) {
        this.equipo1 = equipo1;
        this.setsganadosequipo1 = setsganadosequipo1;
        this.setsganadosequipo2 = setsganadosequipo2;
        this.equipos = equipos;
        this.id_partido = id_partido;
    }

    public int getSetsganadosequipo1() {
        return setsganadosequipo1;
    }

    public void setSetsganadosequipo1(int setsganadosequipo1) {
        this.setsganadosequipo1 = setsganadosequipo1;
    }

    public int getSetsganadosequipo2() {
        return setsganadosequipo2;
    }

    public void setSetsganadosequipo2(int setsganadosequipo2) {
        this.setsganadosequipo2 = setsganadosequipo2;
    }

    public String getEquipos() {
        return equipos;
    }

    public void setEquipos(String equipos) {
        this.equipos = equipos;
    }

    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public String equipo_Ganador(){
        if (setsganadosequipo1>setsganadosequipo2){
            return  "El equipo 1 es ganador";
        } else if (setsganadosequipo2>setsganadosequipo1){
            return "El equipo 2 es el ganador";
        }else {
            return "No se ha terminado el partido";
        }
    }

    @Override
    public String toString() {
        return "Partidos{" +
                ", id_partido=" + id_partido + "  "+
                ", equipos='" + equipos + "   "+
                ", setsganadosequipo1=" + setsganadosequipo1 + "   " +
                ", setsganadosequipo2=" + setsganadosequipo2 +
                '}';
    }
}
