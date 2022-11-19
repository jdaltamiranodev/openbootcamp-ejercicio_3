public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setTelefono("3158908804");
        persona.setNombre("Juan Pablo Rodriguez");

        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
        System.out.println(persona.getNombre());
    }
}

class Persona {
    private int edad;
    private String telefono;
    private String nombre;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}