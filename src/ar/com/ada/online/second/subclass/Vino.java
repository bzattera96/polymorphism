package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.CanastaNoBasica;

import java.util.Date;

public class Vino extends CanastaNoBasica {
    private int añejamiento;

    //constructor
    public Vino(String identificador, String nombre, double costo, Date fechaDeVencimiento, boolean canastaBasica, int aniejamiento) {
        super(identificador, nombre, costo, fechaDeVencimiento, canastaBasica);
        this.añejamiento = aniejamiento;
    }

    public int getAñejamiento() {
        return añejamiento;
    }

    @Override
    public double ObtenerPrecio() {
        double precioFinal = super.ObtenerPrecio();
        int multiplicador = calcularMultiplicador();

        return precioFinal + (precioFinal * (multiplicador / 10));
    }

    private int calcularMultiplicador() {
        return añejamiento / 5;
    }
}
