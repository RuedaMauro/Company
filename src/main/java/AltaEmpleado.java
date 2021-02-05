import java.util.*;

class AltaEmpleado {

    private String nombre;
    private String apellido;
    private String seccion;
    private int id;
    private static int idSiguiente = 1;


    public AltaEmpleado(String nom, String ape){
        nombre = nom;
        apellido = ape;
        id = idSiguiente;
        idSiguiente++;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdSiguiente() {
        return idSiguiente;
    }

    public static void setIdSiguiente(int idSiguiente) {
        AltaEmpleado.idSiguiente = idSiguiente;
    }

}
