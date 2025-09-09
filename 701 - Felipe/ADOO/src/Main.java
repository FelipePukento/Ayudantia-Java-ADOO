public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo Persona
        Persona p1 = new Persona("Tomas", "Rivas", 20, "21695878-5");
        Persona p2 = new Persona("Felipe", "Gonzalez", 22, "20456789-3");
        Persona p3 = new Persona("Maria", "Lopez", 19, "21543210-7");
        Persona p4 = new Persona("Juan", "Perez", 25, "21876543-2");
        Persona p5 = new Persona("Ana", "Martinez", 21, "21765432-1");
        
        
        
        System.out.println(p1.getRUT());
        System.out.println(p1.getApellido());
        System.out.println("Hola Mundo");
        
    }
    
}