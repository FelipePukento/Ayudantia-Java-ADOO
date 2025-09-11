public class perro {

    private String nombre;
    private String raza;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void saludar() {
        System.out.println("Guau guau, mi nombre es " + nombre + ", soy de la raza " + raza + " y tengo " + edad + " años.");
    }

    public perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    public static void main(String[] args) {
        
    }

}
