package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.CanastaBasica;

import java.util.Date;

public class Arroz extends CanastaBasica {
    private String tipo;

    //constructor
    public Arroz(String identificador, String nombre, double costo, Date fechaDeVencimiento, String tipo) {
        super(identificador, nombre, costo, fechaDeVencimiento);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    //no sobreescribo el método porque nos funciona el que tenemos en el padre(canastaBasica).
}