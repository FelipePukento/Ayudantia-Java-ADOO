import java.util.Scanner;

public class test {   
    public static void main(String[] args) {

    // Tipos de datos en Java
        int edad = 20;   
        int año = 2025;                // Entero
        double precio = 99.9;          // Decimal
        char letra = 'A';              // Caracter
        String saludo = "Hola ";     // Cadena
        boolean activo = true;         // Lógico


        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String entrada = sc.nextLine();
        System.out.println("Hola " + entrada);

    }
}
