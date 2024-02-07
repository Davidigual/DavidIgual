package Estudiante;

import java.util.ArrayList;

public class Estudiante {
    public static void main(String[] args) {
        Estudiante estudiante1=new Estudiante(1,"Paco","Smr");
        Estudiante estudiante2=new Estudiante(2,"Pepe","DAM");
        Estudiante estudiante3=new Estudiante(3,"Antonio","ASIR");
        ArrayList<Estudiante>lista_alumnos=new ArrayList<>();
        lista_alumnos.add(estudiante1);
        lista_alumnos.add(estudiante2);
        lista_alumnos.add(estudiante3);
        System.out.println(lista_alumnos);
        lista_alumnos.remove(estudiante2);
        System.out.println(lista_alumnos);
    }
    Integer Id;
    String nombre;
    String Grado;

    public Estudiante(Integer id, String nombre, String grado) {
         this.Id = id;
        this.nombre = nombre;
        this.Grado = grado;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String grado) {
        Grado = grado;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                ", Grado='" + Grado + '\'' +
                '}';
    }
}
