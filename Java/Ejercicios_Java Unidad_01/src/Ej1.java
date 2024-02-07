public class Ej1 {
    public static void main(String[] args) {
        int segundos = 9500;
        Ej1 ej1=new Ej1();
        ej1.calcular(segundos);
    }

    public void calcular(int segundos) {
        int horas = (segundos / 3600);
        int minutos = ((segundos - horas * 3600) / 60);
        int seg = (segundos -(horas * 3600 + minutos *60));
        System.out.println("Son" + horas + "horas" + minutos + "minutos" + seg + "segundos");
    }
}

