package EjerciciosExamen.E2;

import java.util.Random;

public class Gasolina implements ICuadratrack{
    private Random CantidadCombustible = new Random(50);

    public Gasolina() {
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
