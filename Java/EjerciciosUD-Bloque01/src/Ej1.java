import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
    Ej1 ej1=new Ej1();
    Ej1.calculo();
    }
    public static void calculo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce el lado de un cuadrado");
        float lado= input.nextFloat();
        float superficie=lado*lado;
        float perimetro=lado+lado+lado+lado;
        System.out.println("La superficie es: "+superficie);
        System.out.println("El perimetro es: "+perimetro);
    }
}
