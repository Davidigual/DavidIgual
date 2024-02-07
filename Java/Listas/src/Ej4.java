import java.util.ArrayList;

public class Ej4 {
    public static void main(String[] args) {
        Ej4 ej4=new Ej4();
        Ej4.listas();
    }
    public static void listas(){
        String lista="Matematicas,Fisica,Fol,Ingles";
        ArrayList<String>listaasignaturas=new ArrayList<>();
        listaasignaturas.add(lista);
        System.out.println("Yo estudio"+lista);
    }
}
