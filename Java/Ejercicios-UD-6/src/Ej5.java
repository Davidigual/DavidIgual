public class Ej5 {
    public static void main(String[] args) {
        int numero1=878454565;
        int numero2=19;

        Ej5 ej5=new Ej5();
        ej5.producto(numero1,numero2);
    }
    public void producto(float numero1,float numero2){
        int num1=(int) numero1;
        int num2=(int) numero2;
        int multiplicacion=(int)(Math.multiplyExact(num1,num2));
        System.out.println(multiplicacion);
    }
}
