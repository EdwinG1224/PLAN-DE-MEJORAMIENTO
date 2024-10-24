package model;

public abstract class Recluso {
    private String nombre;

    public Recluso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre; // Mostrar solo el nombre del recluso
    }
}
