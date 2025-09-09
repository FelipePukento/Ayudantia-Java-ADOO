public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private String RUT;
    //Construstructor
    public Persona(String nombre, String apellido, Integer edad, String RUT) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.RUT = RUT;
    }
    //GETTER NUESTRA MANERA DETRAER ATRIBUTOS PRIVADOS
    public String getRUT(){
        return RUT;
    }
    public String getApellido() {
        return apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
}
