package posnet;

/**
 *
 * 
 */
public class Persona {

    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;

    /**
     * 
     * @param DNI
     * @param nombre
     * @param apellido
     * @param telefono
     * @param mail 
     */
    public Persona(String DNI, String nombre, String apellido, String telefono, String mail) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }

    /**
     * 
     * @return String tiene nombreCompleto compuesto de nnombre más apellido
     */
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

}