import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
    Ej7 ej7=new Ej7();
    Ej7.bisiesto();
    }
    public static void bisiesto(){
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce un año");
        int anio= input.nextInt();
        if (anio % 4 ==0){
            if (anio%100==0){
                if (anio%400==0){

                }
            }else{
                System.out.println("El año es bisiesto");
            }
        }else {
            System.out.println("El año no es bisiesto");
        }
    }
}
