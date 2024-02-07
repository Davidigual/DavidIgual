import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
    Ej10 ej10=new Ej10();
    Ej10.conversor();
    }
    public static void conversor(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce los grados");
        float grados= scanner.nextFloat();
        float farenheit=(grados * 9/8) + 32;
        System.out.println("En farenheit son:"+farenheit);
        System.out.println("En celsius son:"+grados);
    }
}
