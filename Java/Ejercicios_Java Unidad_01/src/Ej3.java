import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
    Ej3 ej3=new Ej3();
    ej3.calculo();
    }
    public void calculo(){
        Scanner input =new Scanner(System.in);
        System.out.println("Dime la base del rectangulo: ");
        int base=input.nextInt();
        System.out.println("Dime la altura del rectangulo: ");
        int altura=input.nextInt();
        int area=base*altura;
        System.out.println(area);


    }
}
