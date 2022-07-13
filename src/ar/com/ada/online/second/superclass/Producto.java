package ar.com.ada.online.second.superclass;

public abstract class Producto {
    protected String nombre;
    protected String categoria;
    protected double precioDeLista;

    public abstract double obtenerPrecioFinal();
    public String getNombre() {
        return nombre;
    }
    public double getPrecioDeLista() {
        return precioDeLista;
    }
    public String getCategoria() {
        return categoria;
    }
}