package model;
public class Persona{
    private String nombre;
    private String apellido;
    private int id;
    private String genero;

    public Persona(String nombre, String apellido, int id, String genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public String getGenero() {
        return genero;
    }

}