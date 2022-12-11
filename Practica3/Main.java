package Practica3;

public class Main {
    public class MainPersona {
        public static void main(String[] args) {
            Persona persona1 = new Persona();

            Persona persona1 = new Persona("Felipe", "González");
            System.out.println("Persona1");
            System.out.println("Nombre: " + persona1.getNombre());
            persona1.setNombre("Felipe");
            System.out.println("Apellido: " + persona1.getNombre());
            persona1.setApellido("González");

        }
    }
}
