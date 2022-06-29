package EjerciciosExamen.E5;

public class MemoExterna extends Decorator {

    public MemoExterna(ICelular componente) {
        super(componente);
    }

    public Integer agregarExtra() {
        System.out.println("Anadir memoria externa ----> 200$");
        return super.agregarExtra()+200;
    }
}
