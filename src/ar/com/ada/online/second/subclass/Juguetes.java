package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Producto;

public class Juguetes extends Producto {
    private final double DESCUENTO = 0.25;

    public Juguetes(String nombre, double precioDeLista) {
        this.categoria = "Juguetes";
        this.nombre = nombre;
        this.precioDeLista = precioDeLista;
    }

    @Override
    public double obtenerPrecioFinal() {
        double precio = precioDeLista;
        if (precioDeLista > 3000) {
            precio = precioDeLista - (precioDeLista * DESCUENTO);
        }
        return precio;
    }
}