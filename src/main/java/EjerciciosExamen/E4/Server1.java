package EjerciciosExamen.E4;

import java.util.ArrayList;
import java.util.List;

public class Server1 implements IServidor {
    private List<User> listOfUsers;

    public Server1() {
        listOfUsers = new ArrayList<>();
    }

    @Override
    public void userLogin(User user, String username, String pwd) {
        listOfUsers.add(user);
    }

    @Override
    public void atenderUsuarios() {
        for (User user:listOfUsers) {
            System.out.println("Server1 atendiendo a usuario con id ------>" + user.getId());
            user.mostrarInfo();
        }
    }
}
