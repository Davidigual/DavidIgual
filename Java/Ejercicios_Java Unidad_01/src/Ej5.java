import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Ej5 ej5=new Ej5();
        ej5.calculo();
    }
    public void calculo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1=input.nextInt();
        System.out.println("Introduce otro numero");
        int num2=input.nextInt();
        System.out.println("Tus numeros son: " +num1+ " y el otro es " +num2);
        if (num1>num2){
            System.out.println("El " +num1+ " es mayor");
        }else{
            System.out.println("El " +num2+ " es mayor");
        }
        if (num1<num2){
            System.out.println("El " +num1+ " es menor");
        }else {
            System.out.println("El " +num2+ " es menor");
        }
        int mayor=Math.max(num1,num2);
        int menor=Math.min(num1,num2);
            if (mayor%menor== 0) {
                System.out.println("El numero " + num1 + " y el numero " + num2 + " son multiplos ");
        }else{
            System.out.println("No son multiplos estos numeros");
        }

    }
}

