import java.util.TreeMap;

public class Ejercicio {
    public static void main(String[] args) {
        Ejercicio ejercicio=new Ejercicio();
        ejercicio.treemap();
    }
    public void treemap(){
        TreeMap<String,Integer>lista=new TreeMap<>();
        lista.put("Bufalo",1);
        lista.put("Camion",2);
        lista.put("Pollo",3);
        lista.put("Perro",4);
        lista.put("Gato",5);
        System.out.println(lista);
        Integer obtenervalor=lista.get("Perro");
        System.out.println(obtenervalor);
        lista.remove("Perro");
        System.out.println(lista);
    }
}
