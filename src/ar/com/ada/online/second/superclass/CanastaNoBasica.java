package ar.com.ada.online.second.superclass;

import java.util.Date;

public class CanastaNoBasica extends Articulo {
    public static final double IVA = 0.18;

    //constructor
    public CanastaNoBasica(String identificador, String nombre, double costo, Date fechaDeVencimiento, boolean canastaBasica) {
        super(identificador, nombre, costo, fechaDeVencimiento, false);
    }

    @Override
    public double ObtenerPrecio() {
        return (costo * GANANCIA) + (costo * IVA);
    }
}