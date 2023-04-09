package ar.utn.edu.ap.pronosticos;

public class Equipo extends Object {
    private String nombre;
    private String descripcion;

    public Equipo(String nombre) {
        super();
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
