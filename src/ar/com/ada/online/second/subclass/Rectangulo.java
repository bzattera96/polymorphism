package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.FiguraGeometrica;

import java.util.Objects;

public class Rectangulo extends FiguraGeometrica {
    private double ladoA;
    private double ladoB;

    public Rectangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.nombre = "Rectangulo";
    }

    @Override
    public double calcularArea() {
        return ladoA * ladoB;
    }

    @Override
    public boolean esIsometrica() {
        boolean esIso = false;
        if (ladoB == ladoA) {
            esIso = true;
        }
        return esIso;
    }

    @Override
    public String toString() {
        return nombre + ": el lado " + ladoA + " multiplicado por el lado " + ladoB + " da un area de: " + calcularArea() + ". Es isometrico? " + esIsometrica() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangulo that = (Rectangulo) o;
        return Double.compare(that.ladoA, ladoA) == 0 && Double.compare(that.ladoB, ladoB) == 0;
    }
}
