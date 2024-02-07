import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Ej4 ordenar = new Ej4();
        ordenar.ordenar();
    }

    public void ordenar() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Introduce un numero de añadir");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce la palabra");
            String palabra = scanner.next();
            lista.add(palabra);
            Collections.sort(lista);
        }
        System.out.println("Introduce una palabra a buscar");
        String palabra_buscar=scanner.next();
        if (lista.contains(palabra_buscar)) {
            System.out.println(lista.indexOf(palabra_buscar));
        }else {
            System.out.println("La palabra no esta en la lista");
        }
        System.out.println(lista);
    }
}
