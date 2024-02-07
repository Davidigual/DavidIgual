public class Main {
    public static void main(String[] args){
    Persona persona=new Persona();
    Persona persona1=new Persona("Ale","Borja","Toñales");
    persona.setDni("18456956L");
    persona.setNombre("Paco");
    persona.setApellidos("Antoñalocaolas");

    Coche coche=new Coche("Bmw","3789-KIL");
        System.out.println(persona);
        persona1.addcoche(coche);
        System.out.println(persona1);


    }
}