import java.util.ArrayList;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Ej5 ordenar = new Ej5();
        ordenar.contar();
    }

    public void contar() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Introduce un numero de añadir");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce la palabra");
            String palabra = scanner.next();
            lista.add(palabra);
        }
        System.out.println(lista);
        int contador=0;
        String palabra_buscar="perro";
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(palabra_buscar)) {
                contador += 1;
            }
        }
        System.out.println("La palabra perro aparece:" + contador);
    }
}
