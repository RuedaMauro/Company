package models;

public class EmpleadoModel {

    private String nombre;
    private String apellido;
    private String seccion;
    private static int id = 1;

    public EmpleadoModel(){}

    public EmpleadoModel(String nom, String ape){
        nombre = nom;
        apellido = ape;
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

    public void create() {
        System.out.println("¡Bienvenido Empleado " + id + " " + nombre + " " + apellido + "!");
        id++;
    }
}
