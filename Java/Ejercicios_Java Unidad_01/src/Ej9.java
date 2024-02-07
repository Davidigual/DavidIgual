import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Ej9 ej9=new Ej9();
        ej9.media();
    }
    public void media(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce una nota");
        int nota1=input.nextInt();
        System.out.println("Introduce otra nota");
        int nota2=input.nextInt();
        System.out.println("Introduce la ultima nota");
        int nota3=input.nextInt();
        float media= (nota1+nota2+nota3)/3;
        System.out.println("La media es: "+media);
    }
}
