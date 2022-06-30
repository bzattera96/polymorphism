package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

public class ElectricalVehicle extends Vehicle {
    //atributos
    private Integer potency;

    //constructores
    public ElectricalVehicle() {
    }

    public ElectricalVehicle(Integer potency) {
        this.potency = potency;
    }

    public ElectricalVehicle(String brand, String model, Integer year, Integer potency) {
        super(brand, model, year);
        this.potency = potency;
    }

    //getters y setters
    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    //métodos
    @Override
    public String technicalSheet() {
        String aMostrar;

        if(getYear() < 2007) {
            aMostrar = "No existe modelo para este año.";
        } else {
            aMostrar = "Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ". Es un auto de última tecnología!";
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
        return "ElectricalVehicle{" +
                "potency=" + potency +
                '}';
    }
}