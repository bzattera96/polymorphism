package ar.com.ada.online.second.superclass;

import ar.com.ada.online.second.interfaces.Comprable;

import java.util.Date;

public class Alimento implements Comprable {
    protected String nombre;
    protected Date fechaExpiración;
    protected double costo;

    public Alimento(String nombre, Date fechaExpiración, double costo) {
        this.nombre = nombre;
        this.fechaExpiración = fechaExpiración;
        this.costo = costo;
    }

    @Override
    public String obtenerCaracteristicas() {
        return "Caracteristicas: nombre: " + nombre + ", expiración: " + fechaExpiración + " y costo: $" + costo + ".";
    }

    @Override
    public double definirCosto() {
        return costo;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = costo + (costo * 0.21);
        return precioFinal;
    }

    @Override
    public void comprar() {
        System.out.println("Item comprado.");
    }
}
