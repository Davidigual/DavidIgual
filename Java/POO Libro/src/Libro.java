import java.util.ArrayList;

public class Libro {
    String titulo="";
    String autor="";
    public Libro() {

    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public void añadir(){
        ArrayList<String>listalibros=new ArrayList<>();
        listalibros.add(titulo);
        System.out.println(listalibros);
    }
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

}
