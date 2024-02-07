import java.util.ArrayList;
import java.util.HashMap;

public class Estudiante {
    public static void main(String[] args) {
        Estudiante estudiante1=new Estudiante(1,"Juan","Smr");
        Estudiante estudiante2=new Estudiante(2,"Antonio","DAM1");
        Estudiante estudiante3=new Estudiante(3,"David","Asir");

        ArrayList<Estudiante>lista=new ArrayList<>();
        lista.add(estudiante1);
        lista.add(estudiante2);
        lista.add(estudiante3);
        System.out.println(lista);

        HashMap<Integer,Estudiante>listahashmap=new HashMap<>();
        listahashmap.put(estudiante1.getId(),estudiante1);
        listahashmap.put(estudiante2.getId(), estudiante2);
        listahashmap.put(estudiante3.getId(), estudiante3);
        System.out.println("La lista sin eliminar"+listahashmap);

        listahashmap.remove(estudiante1.getId(),estudiante1);
        System.out.println("Lista eliminando un estudiante"+listahashmap);

        for (Integer id:listahashmap.keySet()){
            System.out.println("Clave "+ id +" Valor "+ listahashmap.get(id));
        }
    }
     private int id;
    private String name;
    private String grado;

    public Estudiante(int id, String name, String grado) {
        this.id = id;
        this.name = name;
        this.grado = grado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", name='" + name + '\'' + ", grado='" + grado + '\'' + '}';
    }
}
