package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Producto;

public class Herramientas extends Producto {
    private final double DESCUENTO = 0.05;
    private String metodoPago;

    public Herramientas(String metodoPago, String nombre, double precioDeLista) {
        this.metodoPago = metodoPago;
        this.nombre = nombre;
        this.precioDeLista = precioDeLista;
        this.categoria = "Herramientas";
    }

    @Override
    public double obtenerPrecioFinal() {
        double precio = precioDeLista;
        if (metodoPago.equals("Tarjeta de Credito")) {
            precio = precioDeLista - (precioDeLista * DESCUENTO);
        }
        return precio;
    }
}