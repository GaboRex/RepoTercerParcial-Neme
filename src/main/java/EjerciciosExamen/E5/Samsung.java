package EjerciciosExamen.E5;

public class Samsung implements ICelular{
    @Override
    public Integer agregarExtra() {
        System.out.println("Accesorios + Samsung ----> 4000$");
        return 4000;
    }
}
