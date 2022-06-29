package EjerciciosExamen.E5;

public class MemoAlmacenamiento extends Decorator {

    public MemoAlmacenamiento(ICelular componente) {
        super(componente);
    }

    public Integer agregarExtra() {
        System.out.println("Anadir memoria alamacenamieto ----> 50$");
        return super.agregarExtra()+50;
    }
}
