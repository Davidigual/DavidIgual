package org.iesch.Clases;

public class Resultados {
    private String fecha_resultado;
    private int codigo_resultado;
    private String equipo_win;

    public Resultados() {
    }

    public Resultados(String fecha_resultado) {
        this.fecha_resultado = fecha_resultado;
    }

    public String getFecha_resultado() {
        return fecha_resultado;
    }

    public void setFecha_resultado(String fecha_resultado) {
        this.fecha_resultado = fecha_resultado;
    }

    public int getCodigo_resultado() {
        return codigo_resultado;
    }

    public void setCodigo_resultado(int codigo_resultado) {
        this.codigo_resultado = codigo_resultado;
    }

    public String getEquipo_win() {
        return equipo_win;
    }

    public void setEquipo_win(String equipo_win) {
        this.equipo_win = equipo_win;
    }

    @Override
    public String toString() {
        return "Resultados{" +
                ", codigo_resultado= "  + codigo_resultado +
                ", equipo_Ganador= "  + equipo_win + '\''+"  " +
                "fecha_resultado= "  + fecha_resultado + '\''+
                '}';
    }
}
