import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
            Ej5 ej5=new Ej5();
            ej5.listas();
    }
    public void listas(){
        ArrayList<Integer>lista1=new ArrayList<>();
        ArrayList<Integer>lista2=new ArrayList<>();
        ArrayList<Integer>lista3=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cuantos valores quieres ingresar");
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce valores en las listas");
            Integer numeros=scanner.nextInt();
            lista1.add(numeros);
            lista2.add(numeros);
            lista3.addAll(lista1);
            lista3.addAll(lista2);

        }
        System.out.println("La lista 2 es:" +lista2);
        System.out.println("La lista 1 es:" +lista1);
        System.out.println("Las listas unidas son:"+lista3);

    }
}
