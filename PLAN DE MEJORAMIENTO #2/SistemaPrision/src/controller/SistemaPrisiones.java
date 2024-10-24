package controller;

import java.util.ArrayList;
import java.util.List;
import model.Celda;
import model.Recluso;
import model.ReclusoBajaPeligrosidad;
import model.ReclusoAltaPeligrosidad;

public class SistemaPrisiones {
    private List<Celda> celdas = new ArrayList<>();
    private List<Recluso> reclusos = new ArrayList<>();

    public void agregarCelda(Celda celda) {
        celdas.add(celda);
    }

    public void agregarRecluso(Recluso recluso) {
        reclusos.add(recluso);
    }

    public void agregarCeldas(Celda[] nuevasCeldas) {
        for (Celda celda : nuevasCeldas) {
            agregarCelda(celda);
        }
    }

    public void asignarCeldas() {
        for (Recluso recluso : reclusos) {
            if (recluso instanceof ReclusoAltaPeligrosidad) {
                asignarCelda(recluso, true);
            } else if (recluso instanceof ReclusoBajaPeligrosidad) {
                asignarCelda(recluso, false);
            }
        }
    }

    private void asignarCelda(Recluso recluso, boolean altaSeguridad) {
        if (!celdas.isEmpty()) {
            Celda celdaAsignada = celdas.get(0);
            System.out.println("Asignando celda de " + (altaSeguridad ? "alta" : "baja") + " seguridad para: " + recluso + " a " + celdaAsignada);
            celdas.remove(celdaAsignada);
        } else {
            System.out.println("No hay celdas disponibles para " + recluso);
        }
    }
}
