import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Ej3 ej3=new Ej3();
        ej3.raiz();
    }
    public void raiz(){
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Introduce un numero :");
        float numero=Scanner.nextInt();
        float raices=(float)(Math.sqrt(numero));
        System.out.println(raices);
        Scanner.close();
    }
}
