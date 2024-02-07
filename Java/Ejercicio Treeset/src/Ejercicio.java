import java.util.TreeSet;

public class Ejercicio {
    public static void main(String[] args) {
        Ejercicio ejercicio=new Ejercicio();
        ejercicio.treeset();
    }
    public void treeset(){
        TreeSet<Integer>lista=new TreeSet<>();
        lista.add(1);
        lista.add(16);
        lista.add(14);
        lista.add(13);
        lista.add(12);
        lista.add(11);
        System.out.println(lista);
        lista.remove(16);
        lista.remove(1);
        System.out.println(lista);
        boolean contiene_el_treeset=lista.contains(11);
        System.out.println(contiene_el_treeset);

    }
}
