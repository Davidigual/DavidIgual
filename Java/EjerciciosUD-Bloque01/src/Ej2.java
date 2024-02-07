import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Ej2 ej2=new Ej2();
        Ej2.calculo();
    }
    public static void calculo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Dime la base de un rectangulo");
        float base= input.nextFloat();
        System.out.println("Dime la altura del rectangulo");
        float altura= input.nextFloat();
        float superficie=base*altura;
        float perimetro=(altura*2)+(base*2);
        System.out.println("El perimetro es:"+perimetro);
        System.out.println("La superficie es: "+superficie);

    }
}
