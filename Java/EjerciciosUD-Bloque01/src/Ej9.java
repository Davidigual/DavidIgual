import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
    Ej9 ej9=new Ej9();
    Ej9.calculo();
    }
    public static void calculo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un numero");
        float num1= scanner.nextFloat();
        System.out.println("Introduce otro numero");
        float num2=scanner.nextFloat();
        float mayor=Math.max(num1,num2);
        float menor=Math.min(num1,num2);
        float calculoss=mayor-menor;
        System.out.println("El mayor es:"+mayor);
        System.out.println("La resta es: "+ calculoss);
    }
}
