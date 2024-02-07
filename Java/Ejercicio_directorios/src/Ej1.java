import java.io.File;
import java.io.IOException;

public class Ej1 {
    public static void main(String[] args) {
        Ej1 ej1=new Ej1();
        Ej1.Analizarfichero();

    }
    public static void Analizarfichero(){
        File fichero= new File("D:\\Users\\dam1\\Desktop\\EMPLEADO.docx");
        System.out.println(fichero.getAbsolutePath());
        System.out.println(fichero.getAbsoluteFile());
        System.out.println(fichero.getName());
        System.out.println(fichero.exists());
        String nombre="D:\\Users\\dam1\\Desktop\\EMPLEADO.docx";
        String extension=nombre.substring(nombre.lastIndexOf(".")+1);
        System.out.println(extension);

    }
}
