import java.io.*;
import java.util.Scanner;

public class Crear {
    public static void main(String[] args) {
        Crear crear = new Crear();
        crear.Creacion();
    }

    public void Creacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre de la tabla ");
        String tabla = scanner.nextLine();

        File indices = new File("Ej3\\indices.txt");
        File sentencia = new File("Ej3\\sentenciaSQL.sql");
        try (BufferedReader reader = new BufferedReader(new FileReader(indices));
             BufferedWriter writer = new BufferedWriter(new FileWriter(sentencia))) {
            String leerlinea;
            while ((leerlinea = reader.readLine()) != null) {
                writer.write(" Delete from " + tabla + " where id= " + leerlinea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}


