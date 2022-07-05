package ar.com.ada.online.second.superclass;

public abstract class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();
    public boolean esIsometrica(){
        return false;
    }
}