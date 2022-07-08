package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.CanastaNoBasica;

import java.util.Date;

public class Cerveza extends CanastaNoBasica {
    private String tipo;
    private double volAlcohol;
    private boolean deHeladera; //si es de Heladera, se cobra un 0.05% más

    public Cerveza(String identificador, String nombre, double costo, Date fechaDeVencimiento, boolean canastaBasica, String tipo, double volAlcohol, boolean deHeladera) {
        super(identificador, nombre, costo, fechaDeVencimiento, canastaBasica);
        this.tipo = tipo;
        this.volAlcohol = volAlcohol;
        this.deHeladera = deHeladera;
    }

    public String getTipo() {
        return tipo;
    }

    public double getVolAlcohol() {
        return volAlcohol;
    }

    public boolean isDeHeladera() {
        return deHeladera;
    }

    @Override
    public double ObtenerPrecio() {
        double precioCerveza = (costo * GANANCIA) + (costo * IVA);

        if (deHeladera == true) {
            precioCerveza += precioCerveza * 0.05;
            //precioCerveza = precioCerveza + precioCerveza * 0.05;
        }
        return precioCerveza;
    }
}