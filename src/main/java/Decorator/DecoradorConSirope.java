package Decorator;

public class DecoradorConSirope extends DecoradorBebida{
    public DecoradorConSirope(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", con sirope";
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.3; // Añade el costo del sirope
    }
}
