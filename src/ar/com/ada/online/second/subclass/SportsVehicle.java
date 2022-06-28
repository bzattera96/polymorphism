package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

public class SportsVehicle extends Vehicle {
    //atributos
    private Integer rpm;

    //constructores
    public SportsVehicle() {
    }

    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportsVehicle(String brand, String model, Integer year, Integer rpm) {
        super(brand, model, year);
        this.rpm = rpm;
    }

    //getters y setters
    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    //métodos

    @Override
    public String technicalSheet() {
        String aMostrar;

        if (rpm >= 0 && rpm <= 50) {
            aMostrar = "Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ". El auto es muy bonito, pero solo sirve para salir a pasear.";
        } else if (rpm >= 51 && rpm <= 300) {
            aMostrar = "Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ". Con este auto puedes desafiar a cualquiera en la pista.";
        } else if (rpm >= 301 && rpm <= 600) {
            aMostrar = "Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ". Si tienes este auto, debe considerar participar en NASCAR.";
        } else {
            aMostrar = "Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ". ¿Eres parte del elenco de rápidos y furiosos?";
        }

        return aMostrar;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}