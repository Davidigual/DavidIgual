import java.util.HashSet;
import java.util.Objects;
import java.util.TreeMap;

public class Libro {
    public static void main(String[] args) {
        Libro libro1=new Libro("1","Camello","Antonio");
        Libro libro2=new Libro("1","Camello","Antonio");
        Libro libro3=new Libro("4","Tiburones","Penolope");
        Libro libro4=new Libro("7","Camiones Furiosos","Torpedo");

        HashSet<Libro>libros=new HashSet<>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        System.out.println("El hashset con los libros es:"+libros);
        libros.remove(libro3);
        System.out.println("El hashset con un libro eliminado "+libros);
        boolean existe=libros.contains(libro3);
        System.out.println("Existe el libro en la lista? "+existe);

        TreeMap<String,Libro>libros2=new TreeMap<>();
        libros2.put(libro1.getIsbn(),libro1);
        libros2.put(libro3.getIsbn(),libro3);
        libros2.put(libro4.getIsbn(),libro4);
        System.out.println("Libros añadidos en el TreeMap "+libros2);
        libros2.remove(libro1.getIsbn(),libro1);
        System.out.println("Lista con un libro eliminado "+libros2);
        for (Libro isbn:libros2.values()){
            System.out.println("Print del for "+isbn);
        }


    }
     private String isbn;
    private String titulo;
    private String Autor;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.Autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                '}';
    }
}