public class Main {
    public static void main(String[] args) {
        Circulo circulo1=new Circulo("Canelo",4);
        circulo1.area();
        circulo1.perimetro();
        System.out.println(circulo1.toString());
        Rectangulo rectangulo=new Rectangulo("Manito",5,6);
        rectangulo.area();
        rectangulo.perimetro();
        System.out.println(rectangulo.toString());

    }
}
