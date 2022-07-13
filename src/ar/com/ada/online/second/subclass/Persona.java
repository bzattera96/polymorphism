package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.interfaces.LivingBeing;

public class Persona implements LivingBeing {
    public String name;
    public String phoneNumber;
    public String email;

    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }


    @Override
    public void eat(String name) {
        System.out.println("Soy una persona y estoy comiendo " + name + ".");
    }

    @Override
    public void sleep() {
        System.out.println("Soy una persona y estoy durmiendo");
    }

    @Override
    public void communicate() {
        System.out.println("Soy una persona y me estoy comunicando.");
    }
}
