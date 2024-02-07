import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista_Basica {
    public static void main(String[] args) {
        List<String> coches= new ArrayList<String>(Arrays.asList("Volvo","Bmw","Mercedes","Renault"));
        coches.add("Audi");
        coches.add("Dacia");
        coches.add("Toyota");
        coches.add("Ford");
        System.out.println(coches);
        for (int i = 0; i < coches.size(); i++) {
           /* System.out.print(coches.get(i)+ " ");/*Los saca en horizontal con espacios*/
            /*System.out.println(coches.get(i));/*Los saca en vertical*/
            for (String coche:coches) {
                System.out.println(coche +" ");
            }
        }
    }
}
