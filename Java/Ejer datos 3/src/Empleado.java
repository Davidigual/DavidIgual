import java.util.TreeSet;

public class Empleado implements Comparable<Empleado>{
    public static void main(String[] args) {
        Empleado empleado1=new Empleado(1,"Juan",1500);
        Empleado empleado2=new Empleado(2,"Pedro",2000);
        Empleado empleado3=new Empleado(3,"David",2010);

        TreeSet<Empleado>empleados=new TreeSet<>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        System.out.println(empleados);

        for (Empleado eme:empleados){
            System.out.println(eme);
        }
    }
     int id;
    String nombre;
    Integer salario;

    public Empleado(int id, String nombre, Integer salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }

    @Override
    public int compareTo(Empleado otro) {
        return this.salario.compareTo(otro.salario);
    }
}
