import java.util.ArrayList;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Ej3 ej3=new Ej3();
        Ej3.lista();
    }
    public static void lista(){
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> listapalabras= new ArrayList<>();
        System.out.println("Introduce un numero");
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese una palabra");
            String palabra= scanner.next();
            listapalabras.add(palabra);
        }
        System.out.println("Introduce la palabra a eliminar");
        String palabra = scanner.next();
        listapalabras.remove(palabra);
        System.out.println("La lista de palabras es:"+listapalabras);
    }
}

