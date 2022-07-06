package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Producto;

public class Ropa extends Producto {
    private final double DESCUENTO = 0.15;
    private String tipoRopa;

    public Ropa(String tipoRopa, String nombre, double precioDeLista, int cantidad) {
        this.tipoRopa = tipoRopa;
        this.nombre = nombre;
        this.precioDeLista = precioDeLista;
        this.categoria = "Ropa";
        this.cantidad = cantidad;
    }

    @Override
    public double obtenerPrecioFinal() {
        double precio = precioDeLista;
        if (tipoRopa == "Mujer" || tipoRopa == "Niño") {
            precio = precioDeLista - (precioDeLista * DESCUENTO);
        }
        return precio;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecioDeLista() {
        return precioDeLista;
    }
}