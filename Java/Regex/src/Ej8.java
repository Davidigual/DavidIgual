import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ej8 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime la ubicacion del archivo ");
        String direccion = scanner.nextLine();
        BufferedReader reader = null;
        String linea = null;
        try {
            reader = new BufferedReader(new FileReader(direccion));
            linea = reader.readLine();
            System.out.println(linea);
            String regex = "\\s+|\n";
            Pattern pattern = Pattern.compile(regex);
            System.out.println(linea.split(regex).length);
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no se pudo encontrar.");
        } catch (IOException e) {
            System.out.println("Error: Ocurrió un problema al leer el archivo.");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error: Ocurrió un problema al cerrar el archivo.");
                }
            }
        }
    }
}