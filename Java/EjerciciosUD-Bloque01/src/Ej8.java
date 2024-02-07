import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Ej8 ej8=new Ej8();
        Ej8.decimal();
    }
    public static void decimal(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un numero");
        float numero= scanner.nextFloat();
        if (numero%1==0){
            System.out.println("No es un numero decimal");
        }else {
            System.out.println("Es un numero decimal");
        }

    }
}
