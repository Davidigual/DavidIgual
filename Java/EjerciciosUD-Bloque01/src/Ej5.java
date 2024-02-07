import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Ej5 ej5=new Ej5();
        Ej5.positivo_negativo();
    }
    public static void positivo_negativo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        float numero= input.nextFloat();
        if (numero>=0){
            System.out.println("El numero es positivo");
        }else {
            System.out.println("El numero es negativo");
        }
    }
}
