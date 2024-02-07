public class Figura {

    public Figura(String nombre_figura) {
        this.nombre_figura = nombre_figura;
    }

    String nombre_figura = "";

    public Figura() {
    }


    public String getNombre_figura() {
        return nombre_figura;
    }

    public void setNombre_figura(String nombre_figura) {
        this.nombre_figura = nombre_figura;
    }

    public int area() {
        return 0;
    }

    public int perimetro() {
        return 0;
    }

    public String toString() {
        return "La figura es: " + this.nombre_figura + " el area es : " + this.area() + " el perimetro es : " + this.perimetro();
    }

}

