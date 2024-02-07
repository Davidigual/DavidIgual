import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sumando1 = 15;
        int sumando2 = 5;

        Calculadora calculadora = new Calculadora();
        calculadora.sumar(sumando1, sumando2);
        calculadora.restar(sumando1, sumando2);
        calculadora.multiplicacion(sumando1, sumando2);
        calculadora.division(sumando1, sumando2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la operacion a realizar: ");
        System.out.println("1 --> Sumar: ");
        System.out.println("2 --> Restar: ");
        System.out.println("3 --> Multiplicar: ");
        System.out.println("4 --> Dividir: ");
        int opcion = scanner.nextInt();
        System.out.println(opcion);

        System.out.println("Introduce tu primer numero");
        int operando1 = scanner.nextInt();

        System.out.println("Introduce tu segundo numero");
        int operando2 = scanner.nextInt();

        if (opcion == 1) {
            calculadora.sumar(operando1, operando2);
        } else if (opcion == 2) {
            calculadora.restar(operando1, operando2);
        } else if (opcion == 3) {
            calculadora.multiplicacion(operando1, operando2);
        } else if (opcion == 4) {
            calculadora.division(operando1, operando2);
        } else {
            System.exit(0);
        }
    }
}