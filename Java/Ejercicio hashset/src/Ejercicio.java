import java.util.HashSet;

public class Ejercicio {
    public static void main(String[] args) {
        Ejercicio ejercicio=new Ejercicio();
        ejercicio.hashset();
    }
    public void hashset(){
        HashSet<Integer>hashSet=new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(13);
        hashSet.add(2);
        hashSet.add(10);
        System.out.println(hashSet);
        hashSet.remove(13);
        hashSet.remove(2);
        System.out.println(hashSet);
        boolean contiene_el_numero=hashSet.contains(10);
        System.out.println(contiene_el_numero);


    }
}
