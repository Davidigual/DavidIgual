import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
    Ej15 ej15=new Ej15();
    Ej15.calcular();
    }
    public static void calcular(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un numero");
        float numero1= scanner.nextFloat();
        scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        float numero2= scanner.nextFloat();
        scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        float numero3= scanner.nextFloat();
        List<Float> lista = new ArrayList<>();
        lista.add(numero1);
        lista.add(numero2);
        lista.add(numero3);
        float mayor=Collections.max(lista);
        float menor=Collections.min(lista);
        System.out.println("El mayor numero es"+mayor);
        System.out.println("El menor  numero es"+menor);
       if (mayor==numero1 | mayor==numero2 | mayor==numero3) {
           lista.remove(mayor);
           if (menor == numero1 | menor == numero2 | menor == numero3) {
               lista.remove(menor);
               System.out.println("El mediano es:"+lista);
           }
       }
    }
}

