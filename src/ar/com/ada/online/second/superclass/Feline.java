package ar.com.ada.online.second.superclass;

public class Feline extends Animal {
    protected boolean isDomestic;

    public Feline(String breed, int age, String size, String name, String habitat, boolean isDomestic) {
        super(breed, age, size, name, habitat);
        this.isDomestic = isDomestic;
    }

    @Override
    public void eat() {
        if(isDomestic == true) {
            System.out.println("Soy " + name + " y estoy comiendo el balanceado.");
        } else {
            System.out.println("Soy " + name + " y estoy yendo a cazar.");
        }
    }

    @Override
    public void subir() {
        System.out.println("Soy " + name + " y estoy trepandome.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Soy " + name + " y estoy maullando.");
    }
}
