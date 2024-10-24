package model;

public class Celda {
    private String nombre;
    private boolean altaSeguridad;

    public Celda(String nombre, boolean altaSeguridad) {
        this.nombre = nombre;
        this.altaSeguridad = altaSeguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isAltaSeguridad() {
        return altaSeguridad;
    }

    @Override
    public String toString() {
        return nombre; // Mostrar solo el nombre de la celda
    }
}
