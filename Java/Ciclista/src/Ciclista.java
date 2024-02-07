import java.io.*;
import java.text.ParseException;
import java.util.HashMap;

public class Ciclista {
    public static void main(String[] args) {
        File directorio = new File(".\\data");
        if (directorio.isDirectory()) {
            File[] files = directorio.listFiles();
            if (files != null) {
                for (File fichero : files) {
                    try {
                        FileReader leerarchivo = new FileReader(fichero);
                        BufferedReader buffreader = new BufferedReader(leerarchivo);
                        String linea_a_linea;
                        HashMap<Ciclista, String> equipos = new HashMap<>();
                        HashMap <Ciclista ,String>equipos_comparar=new HashMap<>();
                        while ((linea_a_linea = buffreader.readLine()) != null) {
                            String[] nombre = linea_a_linea.split("\\|");
                            String nombres = nombre[0];
                            String pais = nombre[1];
                            Integer edad = Integer.valueOf(nombre[2].split("")[1]);
                            equipos.put(new Ciclista(nombres, pais, edad), fichero.getName().split("\\.txt")[0]);
                            System.out.println(equipos);
                        }
                    } catch (IOException ex) {
                        throw new RuntimeException();

                    }
                }
            }

        }
    }
    private String nombre;
    private String pais;
    private Integer edad;

    public Ciclista(String nombre, String pais, Integer edad) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", edad=" + edad +
                '}';
    }
}

