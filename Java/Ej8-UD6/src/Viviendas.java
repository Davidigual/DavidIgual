public class Viviendas {
    int precio = 0;
    int superficie = 0;
    boolean tienegarage = true;

    public Viviendas(int precio, int superficie, boolean tienegarage) {
        this.precio = precio;
        this.superficie = superficie;
        this.tienegarage = tienegarage;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public boolean isTienegarage() {
        return tienegarage;
    }

    public void setTienegarage(boolean tienegarage) {
        this.tienegarage = tienegarage;
    }

    public void meinteresa() {
        if (precio < 150000 && superficie >= 80 && tienegarage == true) {
            System.out.println("Me interesa");
        } else {
            System.out.println("No me interesa");
        }
    }
}
