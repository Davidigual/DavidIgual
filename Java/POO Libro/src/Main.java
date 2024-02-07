import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Don quijote","Cervantes");
        Libro libro2 = new Libro("Orgullo y prejuicio", "Jane Austen");
        Libro libro3 = new Libro("Frankenstein","Mary Shelley");
        Libro libro4 = new Libro("Don quijote", "Cervantes");
        Libro libro5 = new Libro("Don quijote", "Cervantes");
        Libro libro6 = new Libro("Don quijote", "Cervantes");
        Libro libro7 = new Libro("Los tres mosqueteros", "Alexandre Dumas");
        Libro libro8 = new Libro("Don quijote","Cervantes");
        Libro libro9 = new Libro("Cumbres borrascosas","Emily Brontë");
        ArrayList<String>listalibros=new ArrayList<>();

        //Libro[]lista={libro1,libro2,libro3,libro4,libro5,libro6,libro7,libro8,libro9};
        //listalibros.addAll(List.of(lista));
        //System.out.println(listalibros);
    }
}
