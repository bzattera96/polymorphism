package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

public class Truck extends Vehicle {
    //atributos
    private Integer maxLoad;

    //constructores
    public Truck(String brand, String model, Integer year, Integer maxLoad) {
        super(brand, model, year);
        this.maxLoad = maxLoad;
    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck() {
    }

    //getters y setters
    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    //métodos
    @Override
    public String technicalSheet() {
        String aMostrar;

        if (maxLoad <= 100) {
            aMostrar = "Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ". Para iniciar un negocio de flete, está muy bien este auto.";
        } else {
            aMostrar = "Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ". Tienes que usar este auto en el campo, es una máquina de trabajo!!";
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
        return "Truck{" +
                "maxLoad=" + maxLoad +
                '}';
    }
}