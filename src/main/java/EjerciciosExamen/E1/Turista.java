package EjerciciosExamen.E1;

import java.util.Random;

public class Turista implements ITurista {
    private String nombre;
    private double montoDinero;
    private String ci;

    public Turista(String nombre, int montoDinero, String ci) {
        this.nombre = nombre;
        this.montoDinero = montoDinero;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(double montoDinero) {
        this.montoDinero = montoDinero;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public void viajarLP(LaPaz laPaz) {
        System.out.println("\n Visitando LA PAAAAAAZ!! \n ");
        int monto = new Random().nextInt(50);
        if (montoDinero > monto){
            montoDinero = montoDinero - monto;
            System.out.println("Turista ---> Gastando " + monto + " Bs, saldo: " + montoDinero);
            double recibirMonto = laPaz.getDineroTurismo() + monto;
            laPaz.setDineroTurismo(recibirMonto);
            laPaz.mostrarInfo();
        } else {
            System.out.println("No tiene suficiente dinero para gastar en LP");
        }
    }

    @Override
    public void viajarCBBA(Cochabamba cochabamba) {
        System.out.println("\n Visitando COCHAAAAAAA!! \n ");
        double monto = cochabamba.getHabitantes()*0.1;
        if (montoDinero > monto){
            montoDinero = montoDinero - monto;
            System.out.println("Turista ---> Gastando " + monto + " Bs, saldo: " + montoDinero);
            double recibirMonto = cochabamba.getDineroTurismo() + monto;
            cochabamba.setDineroTurismo(recibirMonto);
            cochabamba.mostrarInfo();
        } else {
            System.out.println("No tiene suficiente dinero para gastar en Cocha");
        }
    }

    @Override
    public void viajarSCZ(SantaCruz santaCruz) {
        System.out.println("\n Visitando SANTA PUEEEE!!! \n ");
        double monto = santaCruz.getProvincias()*0.5;
        if (montoDinero > monto){
            montoDinero = montoDinero - monto;
            System.out.println("Turista ---> Gastando " + monto + " Bs, saldo: " + montoDinero);
            double recibirMonto = santaCruz.getDineroTurismo() + monto;
            santaCruz.setDineroTurismo(recibirMonto);
            santaCruz.mostrarInfo();
        } else {
            System.out.println("No tiene suficiente dinero para gastar en Santa Pue");
        }
    }
}
