package EjerciciosExamen.E5;

public class Carcasas  extends Decorator {

    public Carcasas(ICelular componente) {
        super(componente);
    }

    public Integer agregarExtra() {
        System.out.println("Anadimos carcasa ----> 20$");
        return super.agregarExtra() + 20;
    }
}
