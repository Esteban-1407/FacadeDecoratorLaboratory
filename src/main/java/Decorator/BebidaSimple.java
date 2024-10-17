package Decorator;

public class BebidaSimple implements Bebida{

    @Override
    public String obtenerDescripcion() {
        return "Bebida Simple";
    }

    @Override
    public double costo() {
        return 1.0;
    }
}
