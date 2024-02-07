import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
    Ej11 ej11=new Ej11();
    Ej11.ordenados();
    }
    public static void ordenados(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un numero");
        float num1= scanner.nextFloat();
        System.out.println("Introduce un numero");
        float num2= scanner.nextFloat();
        System.out.println("Introduce un numero");
        float num3= scanner.nextFloat();
        if (num1<num2&&num2<num3) {
            if (num3 > num2 && num2 > num1) {
                System.out.println("Estan ordenados");
            }
            }else {
            System.out.println("No estan ordenados");
        }
    }
}
