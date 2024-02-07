import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Ej10 ej10=new Ej10();
        ej10.cambio();
    }
    public void cambio(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce el valor v1: ");
        int v1=input.nextInt();
        System.out.println("Introduce el valor v2: ");
        int v2=input.nextInt();
        v1=v1+v2;
        v2=v1-v2;
        v1=v1-v2;
        System.out.println("Los valores intercambiados son: " +v1+ " y " +v2);
    }
}
