import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
      Ej7 ej7=new Ej7();
      ej7.elevado();
    }
    public void elevado(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1=input.nextInt();
        System.out.println("Introduce otro numero");
        int num2=input.nextInt();
        int elevado= (int)Math.pow(num1,num2);
        System.out.println(elevado);

    }
}
