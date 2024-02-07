import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Ej14 ej14=new Ej14();
        Ej14.recorrer();
    }
    public static void recorrer(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero= scanner.nextInt();
        if (numero==0)numero++;
        System.out.println(Math.floor(Math.log10(Math.abs(numero))+1));
    }
}
