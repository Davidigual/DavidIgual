import java.io.File;
public class Directorios {
    public static void main(String args[]){
        File directorio = new File("D:\\Users\\dam1\\Desktop\\prueba");
        if (!directorio.exists()) {
            if (directorio.mkdirs ()){
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }
}
