package EjerciciosExamen.E2;

import java.util.Random;

public class Cuadratrack implements ICuadratrackElectrico {
    private int bateria;

    public Cuadratrack(){
        bateria = 0;
    }

    @Override
    public void cargar() {
        System.out.println("\n---- Cargando bateria ----\n");
        bateria = new Random().nextInt(20);
        System.out.println("Capacidad: " + bateria);
        System.out.println();

    }

    @Override
    public void estadoElectricidad() {
        System.out.println("\n---- Estado bateria ----\n");
        System.out.println("Estado: " + new Random().nextInt(10));
        System.out.println();
    }
}
