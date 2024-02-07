import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        EJ2 ej2=new EJ2();
        ej2.saludo();
    }
    public void saludo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre=input.next();
        System.out.println(" Hola " + nombre);
    }
}
