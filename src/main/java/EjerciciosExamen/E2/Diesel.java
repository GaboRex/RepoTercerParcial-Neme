package EjerciciosExamen.E2;

import java.util.Random;

public class Diesel implements ICuadratrack{
    private Random CantidadCombustible = new Random(50);

    public Diesel() {
    }

    @Override
    public void llenarCombustible() {
        System.out.println("El cuadratrack tiene capacidad de : " + CantidadCombustible + "litros");
    }

    @Override
    public void estadoCombustible() {
        System.out.println("El cuadratrack tiene  : " + CantidadCombustible + "litros");
    }
}
