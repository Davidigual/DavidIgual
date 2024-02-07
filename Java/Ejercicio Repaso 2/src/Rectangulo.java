public  class Rectangulo extends Figura{
    private float altura;
    private float base;

    public Rectangulo(String nombre_figura,float altura,float base) {
        super(nombre_figura);
        this.altura= (float) altura;
        this.base=(float) base;

    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public int perimetro() {
        float perimetro=(this.base+this.base)*(this.altura+this.altura);
        return (int)perimetro;
    }

    @Override
    public int area() {
        float area=this.base*this.altura;
        return (int)area;
    }

    @Override
    public String toString() {
        return super.toString()+" La base es: "+base+" La altura es: "+altura;
    }
}
