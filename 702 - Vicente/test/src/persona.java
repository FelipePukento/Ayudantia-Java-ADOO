public class persona {

    private String nombre;
    private int edad;
    private String rut;
    private int telefono;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRut() {
        return rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + ", tengo " + edad + " años, mi RUT es " + rut + " y mi teléfono es " + telefono);
    }

    public persona(String nombre, int edad, String rut, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.telefono = telefono;
    }

    public static void main(String[] args) {
    persona persona1 = new persona("Vicente", 20, "20.123.456-7", 987654321);
    persona1.saludar();

    }
}
