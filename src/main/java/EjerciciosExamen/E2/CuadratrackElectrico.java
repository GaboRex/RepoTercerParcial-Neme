package EjerciciosExamen.E2;

public class CuadratrackElectrico implements ICuadratrack {
    private Cuadratrack cuadratrack;

    public CuadratrackElectrico(Cuadratrack cuadratrack) {
        this.cuadratrack = cuadratrack;
    }

    @Override
    public void llenarCombustible() {
        cuadratrack.cargar();
    }

    @Override
    public void estadoCombustible() {
        cuadratrack.estadoElectricidad();
    }
}
