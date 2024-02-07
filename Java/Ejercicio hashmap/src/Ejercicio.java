import java.util.HashMap;

public class Ejercicio {
    public static void main(String[] args) {
        Ejercicio ejercicio=new Ejercicio();
        ejercicio.hashmap();
    }
    public void hashmap() {
        HashMap<String, Integer> lista = new HashMap<>();
        lista.put("Perro", 1);
        lista.put("Ñu", 2);
        lista.put("Gato", 3);
        lista.put("Toro", 4);
        lista.put("Camion", 5);
        System.out.println(lista);
        Integer obtenerint = lista.get("Toro");
        System.out.println(obtenerint);
        Integer obtenerstring = lista.get("Perro");
        System.out.println(obtenerstring);
        lista.remove("Perro");
        System.out.println(lista);
    }
}
