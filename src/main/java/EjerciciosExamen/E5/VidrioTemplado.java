package EjerciciosExamen.E5;

public class VidrioTemplado extends Decorator {

    public VidrioTemplado(ICelular componente) {
        super(componente);
    }

    public Integer  agregarExtra() {
        System.out.println("Anadir vidrio templado ----> 5");
        return super.agregarExtra()+5;
    }
}
