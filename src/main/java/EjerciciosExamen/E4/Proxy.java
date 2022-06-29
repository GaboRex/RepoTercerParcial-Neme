package EjerciciosExamen.E4;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements IServidor {
    private IServidor Server1;
    private IServidor Server2;
    private List<User> listUsers;


    public Proxy() {
        System.out.println("\n -----Iniciando proxy y servers-----  \n");
        System.out.println();
        listUsers = new ArrayList<>();
        Server1 = new Server1();
        Server2 = new Server2();
    }

    public void addUser(User user){
        listUsers.add(user);
    }

    @Override
    public void userLogin(User user, String username, String pwd){
        if (username.equals(user.getUsername()) && pwd.equals(user.getPwd())){
            if (esPrimo(user.getId())){
                Server1.userLogin(user, username, pwd);
            } else {
                Server2.userLogin(user, username, pwd);
            }
        } else {
            System.out.println("Datos incorrectos ---> " + username + ", " + pwd);
            System.out.println();
        }
    }
    @Override
    public void atenderUsuarios() {
        Server1.atenderUsuarios();
        Server2.atenderUsuarios();
    }
    public boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
}
