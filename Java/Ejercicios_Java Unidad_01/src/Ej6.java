import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Ej6 ej6=new Ej6();
        ej6.calculo();
    }
    public void calculo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce un numero");
        float num1=input.nextInt();
        System.out.println("Introduce otro numero");
        float num2=input.nextInt();
        float cociente=num1/num2;
        DecimalFormat decimales=new DecimalFormat("#.000");
        System.out.println("El cociente es: "+decimales.format(cociente));
    }

}
