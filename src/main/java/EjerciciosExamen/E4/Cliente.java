package EjerciciosExamen.E4;

public class Cliente {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
//-------------------------------------------------------------------------------------------------
        User us1 = new User("gisel12", 12, "pwi12");
        User us2 = new User("cristiano7", 7, "cr7");
        //-------------------------------------------------------------------------------------------------
        proxy.addUser(us1);
        proxy.addUser(us2);
        //-------------------------------------------------------------------------------------------------
        proxy.userLogin(us1, "gisel12", "pwi12");
        proxy.userLogin(us2, "cristiano7", "cr7");
        proxy.userLogin(us2, "cristiano7", "i12");

        proxy.atenderUsuarios();
    }
}

