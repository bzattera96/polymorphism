package ar.com.ada.online.second.superclass;

public abstract class FiguraGeometrica {
    protected String nombre;

    protected abstract double calcularArea();
    protected boolean esIsometrica(){
        return false;
    }
}