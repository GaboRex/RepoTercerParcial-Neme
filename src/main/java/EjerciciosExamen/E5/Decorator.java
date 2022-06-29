package EjerciciosExamen.E5;

public class Decorator implements ICelular{
    private ICelular componente;
    public Decorator(ICelular componente) {
        this.componente=componente;
    }
    @Override
    public Integer agregarExtra() {
        return componente.agregarExtra();
    }
}
