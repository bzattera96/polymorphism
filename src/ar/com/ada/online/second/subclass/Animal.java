package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.interfaces.LivingBeing;

public class Animal implements LivingBeing {
    public String tipo;
    public String habitat;

    @Override
    public void eat(String name) {
        System.out.println("Soy un animal y estoy comiendo " + name + ".");
    }

    @Override
    public void sleep() {
        System.out.println("Soy un animal y estoy durmiendo.");
    }

    @Override
    public void communicate() {
        System.out.println("Soy un animal y me estoy comunicando.");
    }
}
