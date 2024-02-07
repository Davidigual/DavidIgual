public  class Circulo  extends Figura{
    private float radio;


    public Circulo(String nombre_figura,double radio) {
        super(nombre_figura);
        this.radio=(float) radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }


    @Override
    public int perimetro() {
       float perimetro=(float) ((this.radio*2)*3.14);

        return (int) perimetro;
    }

    @Override
    public int area() {
        float area = (float) ((this.radio*this.radio) * 3.14);
        return (int) area;
    }

    @Override
    public String toString() {
        return super.toString()+" El radio es: " +radio;
    }
}

