import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        Arraylist arraylist=new Arraylist();
        arraylist.Listas();
    }
    public void Listas(){
        ArrayList<String>lista=new ArrayList<>();
        lista.add("Perro");
        lista.add("Andres");
        lista.add("Aceituna");
        lista.add("Torpedo");
        System.out.println("Lista completa "+lista);
        lista.add(4,"Camion");
        System.out.println("Lista añadiendo camion"+lista);
        lista.remove(3);
        System.out.println("Lista eliminando el string cuyo valor es el 3 "+lista);
        lista.remove("Andres");
        System.out.println("Lista sin andres "+lista);

    }
}
