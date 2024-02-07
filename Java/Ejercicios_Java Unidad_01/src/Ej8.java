import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Ej8 ej8=new Ej8();
        ej8.calculo();
    }
    public void calculo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce una arista");
        float arista=input.nextInt();
        float volumen=(float)Math.pow(arista,3);
        System.out.println(volumen);
    }
}
