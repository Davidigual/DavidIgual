import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Ej4 ej4=new Ej4();
        Ej4.media();
    }
    public static void media(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce un numero");
        float num1= input.nextFloat();
        System.out.println("Introduce otro numero");
        float num2= input.nextFloat();
        System.out.println("Introduce otro numero");
        float num3= input.nextFloat();
        float media=(num1+num2+num3)/3;
        System.out.println("La media con decimales es: "+media);
        System.out.println(Math.round(media));
    }
}
