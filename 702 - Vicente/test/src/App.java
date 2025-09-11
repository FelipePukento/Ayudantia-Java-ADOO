public class App {
    public static void main(String[] args) throws Exception {
        persona persona1 = new persona("Vicente", 20, "20.123.456-7", 987654321);

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("RUT: " + persona1.getRut());
        System.out.println("Teléfono: " + persona1.getTelefono());

        perro perro1 = new perro("Firulais", "Labrador", 3);

        System.out.println("Nombre: " + perro1.getNombre());
        System.out.println("Raza: " + perro1.getRaza());
        System.out.println("Edad: " + perro1.getEdad());

        persona1.saludar();
        perro1.saludar();

    }
}

