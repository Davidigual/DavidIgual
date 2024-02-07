import java.util.Scanner;
    public class Average {
        // objeto Scanner para gestionar la entrada
        static Scanner sc;
        public static void main(String[] args) {
// inicicializamos el escanner
            sc = new Scanner(System.in);
// pedimos el número de elementos del array
            System.out.println("Cálculo de la media aritmética");
            System.out.println("¿Cuántos valores necesita introducir?");
            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("¿Cuántos valores necesita introducir?"
                        + "(Debe ser un entero)");

            }
            int length = sc.nextInt();
            sc.nextLine(); // limpiar scanner
// declarar array
            double[] values = new double[length];
// declarar indice para rellenar el array
            int index = 0;
// Pedimos introducir los valores
            System.out.println("Introduzca los valores (números reales)");
            System.out.println("Puede hacerlo uno a uno");
            System.out.println("o varios en una línea separados por espacios");
// vamos leyendo del scanner hasta completar la inserción
// de la cantida de valores esperada
            while (index < length) {
                while (!sc.hasNextDouble()) {
                    sc.nextLine();
                }
                values[index] = sc.nextDouble();
                index++;
            }
            System.out.println("Valores introducidos");
// recorremos el array con un for
// y vamos sumando el total
            double total = 0.0;
            for (int i = 0; i < values.length; i++) {
                System.out.println(values[i]);
                total += values[i];
            }
// calculamos la media
            double avg = total / length;
            System.out.println("Media aritmética: " + avg);
// recorrer el array para mostrar la desviación media
// ahora recorremos el array con un foreach
// Desviación media = abs(valor - avg)
            for (double d : values) {
                System.out.println("Valor: " + d
                        + " - Desviación media: " + Math.abs(d - avg));

            }
// cerrar scanner
            sc.close();
        }
    }
