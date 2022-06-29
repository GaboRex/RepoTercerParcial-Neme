package EjerciciosExamen.E5;

public class Apple implements ICelular{
    @Override
    public Integer agregarExtra() {
        System.out.println("Accesorios + Iphone ----> 5000$");
        return 2400;
    }
}
