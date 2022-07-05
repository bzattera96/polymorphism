package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.FiguraGeometrica;

import java.util.Objects;

public class Circulo extends FiguraGeometrica {
    private double radio;
    private final double PIGRIEGO = 3.14159265;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (radio * radio) * PIGRIEGO;
    }

    @Override
    public String toString() {
        return "Circulo: el cuadrado del radio de " + radio + " multiplicado por " + PIGRIEGO + " da un area de: " + calcularArea() + ". Es isometrico? " + esIsometrica() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return Double.compare(circulo.radio, radio) == 0 && Double.compare(circulo.PIGRIEGO, PIGRIEGO) == 0;
    }
}