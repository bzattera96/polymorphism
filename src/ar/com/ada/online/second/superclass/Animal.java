package ar.com.ada.online.second.superclass;

public class Animal {
    protected String breed;
    protected int age;
    protected String size;
    protected String name;
    protected String habitat;

    public Animal(String breed, int age, String size, String name, String habitat) {
        this.breed = breed;
        this.age = age;
        this.size = size;
        this.name = name;
        this.habitat = habitat;
    }

    public void eat() {
        System.out.println("Soy " + name + " y estoy comiendo.");
    }

    public void subir() {
        System.out.println("Soy " + name + " y estoy subiendo.");
    }

    public void emitirSonido() {
        System.out.println("Soy " + name + " y estoy emitiendo sonido.");
    }
}