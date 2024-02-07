import java.util.ArrayList;
public class Cities {
    public static void main(String[] args) {
// declaramos e inicializamos la lista
// debemos indicar el tipo de datos que
// contiene la lista
        ArrayList<String> cities = new ArrayList<String>();
// añadimos elementos a la colección
        cities.add("Alcañiz");
        cities.add("Calamocha");
        cities.add("Montalbán");
        cities.add("Alcorisa");
        cities.add("Sarrión");
        cities.add("Benasque");
// borramos un elemento
        cities.remove(5);
// insertamos un elemento en la posición que queramos
        cities.add(0, "Teruel");
// recorremos los elementos de la lista
        int length = cities.size();
        for (int i = 0; i < length; i++) {
// accedemos a los elementos indicando su posición
            System.out.println(cities.get(i));
        }
        System.out.println();
        System.out.println("Clear()");
// limpiamos la lista
        cities.clear();
// comprobamos el tamaño de la lista
        if (cities.size() == 0) {
            System.out.println("No hay elementos en el ArrayList");
        }
    }
}
