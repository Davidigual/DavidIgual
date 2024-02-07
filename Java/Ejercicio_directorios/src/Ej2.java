import java.io.File;


public class Ej2 {
    public static void main(String[] args) {
        Ej2 ej2=new Ej2();
        Ej2.directorio();
        Ej2.mostardirectorio();
    }
    public static void directorio(){
        File fichero=new File("D:\\Users\\dam1\\Desktop\\EMPLEADO.docx");
        System.out.println(fichero.getAbsolutePath());
        System.out.println(fichero.isAbsolute());
        if (fichero.exists()){
            System.out.println("El archivo si existe");
            if (fichero.isDirectory()){
                System.out.println("Es un directorio");
            }else {
                System.out.println("Es un archivo");
            }
        }else {
            System.out.println("El archivo no existe");
        }
    }
    public static void mostardirectorio() {
        File fichero = new File("D:\\Users\\dam1\\Desktop\\DAM");
        String[] lista = fichero.list();
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}
