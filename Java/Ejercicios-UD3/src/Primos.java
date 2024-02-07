import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {

    }
    public static void primos(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num= scanner.nextInt();
        for (int i = 0; i <num ; i++) {
            if (num%2==0){
                System.out.println("El numero es primo");
            }else {
                System.out.println("El numero no es primo");
            }

        }
    }
}
