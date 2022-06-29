package EjerciciosExamen.E1;

public class Cliente {
    public static void main(String[] args) {
            Turista turista = new Turista("Gisel Flores", 300, "12609163");
//CREANDO LP,SCZ Y CBBA
            LaPaz lp = new LaPaz(40, 300, "Frio");
            SantaCruz scz = new SantaCruz(50, 500, "Calido");
            Cochabamba cbba = new Cochabamba(28, 250, "Templado");

            lp.gastarDinero(turista);
            scz.gastarDinero(turista);
            cbba.gastarDinero(turista);
        }
    }
