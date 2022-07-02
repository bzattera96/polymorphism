package ar.com.ada.online.second.superclass;

public class Canine extends Animal {
    protected boolean puedeSalir;

    public Canine(String breed, int age, String size, String name, String habitat, boolean puedeSalir) {
        super(breed, age, size, name, habitat);
        this.puedeSalir = puedeSalir;
    }

    @Override
    public void eat() {
        if (puedeSalir == false) {
            System.out.println("Soy " + name + " y estoy comiendo balanceado de cachorros.");
        } else {
            System.out.println("Soy " + name + " y estoy comiendo balanceado de caninos adultos.");
        }
    }

    @Override
    public void subir() {
        System.out.println("Soy " + name + " y estoy saltando.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Soy " + name + " y estoy ladrando.");
    }
}
