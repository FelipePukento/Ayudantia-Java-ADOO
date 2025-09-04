public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo Persona
        Persona p1 = new Persona("Felipe", 22, "Gonzalez");
        Persona p2 = new Persona("Ada", 20, "Lovelace");

        // Usar métodos de los objetos
        p1.saludar();

        p2.saludar();

        // Acceder a datos con getters
        System.out.println("El nombre de p1 es: " + p1.getNombre());
        System.out.println("El apellido de p1 es: " + p1.apellido);
        //System.out.println("La edad de p1 es: " + p1.nombre); // No se puede acceder directamente a edad porque es private
        //p1.nombre = "Carlos";
        p1.apellido = "Pérez";

        System.out.println("La edad de p1 es: " + p1.getEdad());


    }
    
}
