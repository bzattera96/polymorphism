package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Rodado;

public class Bicicleta extends Rodado {
    private int cambios;
    private boolean esDeCiudad;

    public Bicicleta(int numeroRuedas, double velocidadMaxima, String color, double costo, int cambios, boolean esDeCiudad) {
        super(numeroRuedas, velocidadMaxima, color, costo);
        this.cambios = cambios;
        this.esDeCiudad = esDeCiudad;
    }

    public void cambiarCambio(int cambioElegido) {
        System.out.println("Cambio actual: " + cambioElegido);
    }
}
