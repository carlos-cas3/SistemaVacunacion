package sistemavacunacion.entities;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    private String generarNombreC(String nombre, String apellido){
        return nombre + " " + apellido;
    }
    
    
    
}