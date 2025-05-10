class Persona {
String nombre;

}
public class ejerPasr2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Rick";
        cambiarNombre (persona);
        System.out.println("");

    }
    public static void cambiarNombre(Persona persona) {
        persona.nombre= "Morty";
        
    }
}
