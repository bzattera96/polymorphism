package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.interfaces.Communication;

public class DrawingPad implements Communication {
    public String sensibility;
    public String brand;

    public DrawingPad(String sensibility, String brand) {
        this.sensibility = sensibility;
        this.brand = brand;
    }

    @Override
    public void communicate() {
        System.out.println("I'm creating a manga story with a " + brand + " drawing pad with " + sensibility + " sensibility.");
    }

    @Override
    public void express() {
        System.out.println("I'm expressing my ideals.");
    }
}
