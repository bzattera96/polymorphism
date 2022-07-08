package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.CanastaBasica;

import java.util.Date;

public class Leche extends CanastaBasica {
    private boolean entera;

    public Leche(String identificador, String nombre, double costo, Date fechaDeVencimiento, boolean entera) {
        super(identificador, nombre, costo, fechaDeVencimiento);
        this.entera = entera;
    }

    public boolean isEntera() {
        return entera;
    }

    //sobreescribimos el metodo Obtener precio
    //llamamos al metodo del padre que ya nos esta calculando el costo * GANANCIA

    @Override
    public double ObtenerPrecio() {
        double precioFinal = super.ObtenerPrecio();
        //si no es entera se le multiplica 1.05, si no , se le retorna el precio final
        if (!entera) {
            precioFinal = precioFinal * 1.05;
        }
        return precioFinal;

    }
}
