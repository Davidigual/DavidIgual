import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
    Ej1 ej1=new Ej1();
    ej1.area();
    }
    public void area(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce la base del rectangulo");
        float base=input.nextInt();
        System.out.println("Introduce la altura del rectangulo");
        float altura=input.nextInt();
        float areas=base*altura;
        System.out.println(areas);
    }
}
