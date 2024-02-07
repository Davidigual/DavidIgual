import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
    Ej3 ej3=new Ej3();
    Ej3.calculo();
    }
    public static void calculo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce el radio de la circuferencia");
        float radio= input.nextFloat();
        double area=(radio*2)*3.14;
        double circunferencia=(3.14*(radio*2));
        System.out.println("El area es:"+area);
        System.out.println("La circunferencia es: "+circunferencia);
    }
}
