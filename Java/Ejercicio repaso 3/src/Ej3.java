import java.util.ArrayList;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
    Ej3 duplicado=new Ej3();
    duplicado.duplicados();
    }
    public void duplicados(){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> listanumero= new ArrayList<>();
        System.out.println("Introduce un numero");
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero");
            Integer numero= Integer.valueOf(scanner.next());
            listanumero.add(numero);
        }

        System.out.println(listanumero);
    }
}
