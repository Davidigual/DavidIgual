public class Persona {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setNombre("David");
        persona.setApellido1("Perez");
        persona.setApellido2("Manolo");
        persona.setEmail("Jamones@iesch.org");
        persona.setTelefono(654485965);
    }
    String nombre;
    String apellido1;
    String apellido2;
    int telefono;
    String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona(String nombre, String apellido1, String apellido2, int telefono, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Persona:\n"+
                nombre+"\n"+
                apellido1+"\n"+
                apellido2+"\n"+
                telefono +
                email+"\n";
    }

    public Persona() {
    }
}

