import java.util.Random;

public class Ej7 {
    public static void main(String[] args) {
        Ej7 ej7=new Ej7();
        ej7.mayusculas();
        }
    public void mayusculas(){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char letra = (char) (random.nextInt(26)+'a');
           if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
               System.out.println(letra + " Es  vocal ");
            } else {
               System.out.println(letra + " Es consonante ");
            }
        }


    }
}
