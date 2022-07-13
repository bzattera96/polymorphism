package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.interfaces.Communication;

public class Canvas implements Communication {
    public String material;
    public double area;

    public Canvas(String material, double area) {
        this.material = material;
        this.area = area;
    }

    @Override
    public void communicate() {
        System.out.println("I'm painting on a " + material + " canvas of " + area + " inches.");
    }

    @Override
    public void express() {
        System.out.println("I'm expressing my happiness.");
    }
}
