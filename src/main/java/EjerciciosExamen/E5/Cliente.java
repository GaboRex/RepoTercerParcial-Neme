package EjerciciosExamen.E5;

public class Cliente {
    public static void main(String[] args) {

        //samsung
        ICelular s=new Samsung();
        s=new MemoExterna(s);
        s = new MemoAlmacenamiento(s);
        s = new VidrioTemplado(s);
        s = new Carcasas(s);

        //Apple
        ICelular a = new Apple();
        a = new MemoExterna(a);
        a = new MemoAlmacenamiento(a);
        a = new Carcasas(a);

        //Xiaomi
        ICelular x = new Xiaomi();
        x = new Carcasas(x);
        x = new VidrioTemplado(x);
        x = new MemoExterna(x);

        //agregando
        System.out.println(s.agregarExtra());
        System.out.println();
        System.out.println(a.agregarExtra());
        System.out.println();
        System.out.println(x.agregarExtra());
    }
}
