package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.FiguraGeometrica;

import java.util.Objects;

public class Triangulo extends FiguraGeometrica {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double altura;

    public Triangulo(double ladoA, double ladoB, double ladoC, double altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.altura = altura;
        this.nombre = "Triangulo";
    }

    @Override
    public double calcularArea() {
        return (ladoA * altura) / 2;
    }

    @Override
    public boolean esIsometrica() {
        boolean esIso = false;
        if (ladoB == ladoA && ladoB == ladoC) {
            esIso = true;
        }
        return esIso;
    }

    @Override
    public String toString() {
        return nombre + ": el lado " + ladoA + " multiplicado por el lado " + altura + " dividido 2, da un area de: " + calcularArea() + ". Es isometrico? " + esIsometrica() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangulo triangulo = (Triangulo) o;
        return Double.compare(triangulo.ladoA, ladoA) == 0 && Double.compare(triangulo.altura, altura) == 0;
    }
}