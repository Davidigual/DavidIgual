import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Ej2 ej2=new Ej2();
        Ej2.lista();
    }
    public static void lista() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listapalabras = new ArrayList<>();
        System.out.println("Introduce un numero");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese una palabra");
            String palabra = scanner.next();
            listapalabras.add(palabra);

        }
        int contador = 0;
        System.out.println("Introduce la palabra a buscar");
        String palabra = scanner.next();
        for (int i = 0; i < listapalabras.size(); i++) {
            String palabra_buscar = String.valueOf(listapalabras.get(i));
            if (palabra_buscar.equals(palabra)) {
                contador++;
            }else{
                System.out.println("La palabra a buscar no esta en la lista ");
                break;
            }

        }
        System.out.println("La lista es:" + listapalabras);
        System.out.println("La palabra a buscar es: " + palabra + " aparece " + contador);
    }

}


