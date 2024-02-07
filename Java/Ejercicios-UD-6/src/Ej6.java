import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Ej6 ej6=new Ej6();
        ej6.calculo();
    }
    public void calculo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1= input.nextInt();
        System.out.println("Introduce el numero a elevar: ");
        int num2= input.nextInt();
        int resultado=(int) Math.pow(num1,num2);
        System.out.println(resultado);
    }
}
