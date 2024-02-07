public class Calculadora {
    public int sumar(int sumando1, int sumando2) {
        System.out.println("La suma es: " + (sumando1 + sumando2));
        return sumando1 + sumando2;
    }

    public int restar(int sumando1, int sumando2) {
        System.out.println("La resta es: " + (sumando1 - sumando2));
        return sumando1 - sumando2;
    }

    public int multiplicacion(int sumando1, int sumando2) {
        System.out.println("La multiplicacion es: " + sumando1 * sumando2);
        return sumando1 * sumando2;
    }

    public int division(int sumando1, int sumando2) {
        System.out.println("La division de " + sumando1 + " entre " + sumando2 + " es " + sumando1 / sumando2);
        return sumando1 / sumando2;
    }
}

