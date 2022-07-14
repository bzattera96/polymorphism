package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Rodado;

public class CarritoBebé extends Rodado {
    private boolean esTresEnUno;
    private double peso;
    private boolean esParaguitas;
    private boolean estáAbierto;

    public CarritoBebé(int numeroRuedas, double velocidadMaxima, String color, double costo, boolean esTresEnUno, double peso, boolean esParaguitas, boolean estáAbierto) {
        super(numeroRuedas, velocidadMaxima, color, costo);
        this.esTresEnUno = esTresEnUno;
        this.peso = peso;
        this.esParaguitas = esParaguitas;
        this.estáAbierto = estáAbierto;
    }

    public void abrir() {
        estáAbierto = true;
        System.out.println("Cochecito abierto.");
    }

    public void cerrar() {
        estáAbierto = false;
        System.out.println("Cochecito cerrado.");
    }
}
