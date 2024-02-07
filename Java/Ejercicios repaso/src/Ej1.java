import java.util.*;

public class Ej1 {
    public static void main(String[] args) {
        Ej1 ejercicio1 = new Ej1();
        ejercicio1.mayores();
    }

    public void mayores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        float num1 = scanner.nextFloat();
        System.out.println("Introduce otro numero");
        float num2 = scanner.nextFloat();
        System.out.println("Introduce otro numero");
        float num3 = scanner.nextFloat();
        ArrayList<Integer> listanumeros = new ArrayList<>();
        listanumeros.add((int) num1);
        listanumeros.add((int) num2);
        listanumeros.add((int) num3);
        Arrays.sort(new ArrayList[]{listanumeros});
        System.out.println(listanumeros);
        if (listanumeros.indexOf(0) == listanumeros.indexOf(1)) {
            System.out.println("Hay mas de un numero igual");
        } else {
            System.out.println("No hay numeros mayores iguales");
        }
    }
}
