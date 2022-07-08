package ar.com.ada.online.second.superclass;

import java.util.Date;

public abstract class Articulo {
    protected static final double GANANCIA = 1.2;
    protected String identificador;
    protected String nombre;
    protected double costo;
    protected Date fechaDeVencimiento;
    protected boolean canastaBasica;


    //constructor con protected para inicializar el valor de las variables.
    protected Articulo(String identificador, String nombre, double costo, Date fechaDeVencimiento, boolean canastaBasica) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.costo = costo;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.canastaBasica = canastaBasica;
    }

    public String getIdentificador() {
        return identificador;
    }

    public double getCosto() {
        return costo;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public boolean isCanastaBasica() {
        return canastaBasica;
    }

    //creamos otro metodo con "public" para poder invocarlo desde otras clases.
    public abstract double ObtenerPrecio();

    public String getNombre() {
        return nombre;
    }
}