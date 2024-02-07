import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Ej4 ej4=new Ej4();
        ej4.aleatorio();
        ej4.random();
        ej4.randon_pro();
    }
    public void aleatorio(){
        int numero=(int) (Math.random()*101);
        System.out.println("El numero aleatorio es:"+numero);
    }
    public void random(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num=input.nextInt();
        for (int i = 0; i < 3; i++) {
            int numero = (int) (Math.random() * num + 0);
            System.out.println("Los numeros aleatorios del rango son: " + numero);
        }
    }
    public void randon_pro(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num=input.nextInt();
        System.out.println("Introduce otro numero");
        int num2= input.nextInt();
        for (int i = 0; i < 15; i++) {
            int numero=(int) (Math.random()*(num2-num)+num);
            System.out.println(numero);
        }
    }
}
