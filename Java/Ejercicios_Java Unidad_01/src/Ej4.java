import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Ej4 ej4=new Ej4();
        ej4.saludo();

    }
    public void saludo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre=input.next();
        System.out.println("Hola " +nombre);

    }



}
