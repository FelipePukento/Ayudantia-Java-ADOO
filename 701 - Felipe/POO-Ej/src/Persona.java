public class Persona {
    // Atributos (estado del objeto)
    private String nombre;
    public String apellido;
    private int edad;


    // Constructor (se llama al crear el objeto)
    public Persona(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    // Método (comportamiento del objeto)
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " " + apellido + " y tengo " + edad + " años.");
    }
        
    // Getters (acceso controlado)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
