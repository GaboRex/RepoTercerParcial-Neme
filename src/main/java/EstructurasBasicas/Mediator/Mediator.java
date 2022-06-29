package EstructurasPatrones.Mediator;

public interface Mediator {
    void send(String msg, Colleague colleague);
}
