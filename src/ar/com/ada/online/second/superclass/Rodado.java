package ar.com.ada.online.second.superclass;

import ar.com.ada.online.second.interfaces.Comprable;

public class Rodado implements Comprable {
    protected int numeroRuedas;
    protected double velocidadMaxima;
    protected String color;
    protected double costo;

    public Rodado(int numeroRuedas, double velocidadMaxima, String color, double costo) {
        this.numeroRuedas = numeroRuedas;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.costo = costo;
    }

    @Override
    public String obtenerCaracteristicas() {
        return "Caracteristicas: ruedas: " + numeroRuedas + ", velocidad maximo: " + velocidadMaxima + ", color: " + color + " y costo: $" + costo + ".";
    }

    @Override
    public double definirCosto() {
        return costo;
    }

    @Override
    public double calcularPrecioFinal() {
        return costo + (costo * 0.21);
    }

    @Override
    public void comprar() {
        System.out.println("Item comprado.");
    }
}
