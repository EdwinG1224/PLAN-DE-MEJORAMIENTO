import model.Celda;
import model.ReclusoBajaPeligrosidad;
import model.ReclusoAltaPeligrosidad;
import controller.SistemaPrisiones;

public class Main {
    public static void main(String[] args) {
        SistemaPrisiones sistema = new SistemaPrisiones();

        Celda[] nuevasCeldas = {
            new Celda("Celda 1", true),
            new Celda("Celda 2", false),
            new Celda("Celda 3", false),
            new Celda("Celda 4", true),
            new Celda("Celda 5", false),
            new Celda("Celda 6", false),
            new Celda("Celda 7", true),
            new Celda("Celda 8", false),
            new Celda("Celda 9", false),
            new Celda("Celda 10", true),
            new Celda("Celda 11", false),
            new Celda("Celda 12", false)
        };

        sistema.agregarCeldas(nuevasCeldas);

        // Agregar reclusos
        sistema.agregarRecluso(new ReclusoBajaPeligrosidad("Juan"));
        sistema.agregarRecluso(new ReclusoBajaPeligrosidad("Carlos"));
        sistema.agregarRecluso(new ReclusoAltaPeligrosidad("Pedro"));
        sistema.agregarRecluso(new ReclusoBajaPeligrosidad("Luis"));
        sistema.agregarRecluso(new ReclusoBajaPeligrosidad("Fernando"));
        sistema.agregarRecluso(new ReclusoBajaPeligrosidad("Ana"));
        sistema.agregarRecluso(new ReclusoBajaPeligrosidad("Marta"));
        sistema.agregarRecluso(new ReclusoAltaPeligrosidad("Javier"));
        sistema.agregarRecluso(new ReclusoBajaPeligrosidad("Sofia"));
        sistema.agregarRecluso(new ReclusoBajaPeligrosidad("Pedro"));
        sistema.agregarRecluso(new ReclusoBajaPeligrosidad("Ricardo"));
        sistema.agregarRecluso(new ReclusoBajaPeligrosidad("Luisa"));

        sistema.asignarCeldas();
    }
}
