import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Ej6 ej6=new Ej6();
        Ej6.calculo();
    }
    public static void calculo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        float numero= input.nextFloat();
        if (numero<0){
            System.out.println("Error, has introducido un numero negativo");
        }else {
            System.out.println(Math.sqrt(numero));
        }
    }
}
