import ar.com.ada.online.second.subclass.*;
import ar.com.ada.online.second.superclass.*;

public class Main {
    public static final void main(String[] args) { //acordarse usar el final
        /*
        Vehicle[] array = new Vehicle[12];

        //vehicle[0] = new Vehicle();

        Vehicle vehicle1 = new Vehicle("Bugatti", "GJHDH1231", 2017);
        Vehicle vehicle2 = new Vehicle("Peugeot", "206", 2004);
        Vehicle vehicle3 = new Vehicle("Renault", "19", 2010);

        Vehicle electricalVehicle1 = new ElectricalVehicle("Fiat", "Uno", 2006, 13123);
        Vehicle electricalVehicle2 = new ElectricalVehicle("Renault", "Blabla", 2016, 456123);
        Vehicle electricalVehicle3 = new ElectricalVehicle("Volkswagen", "Suran", 2005, 123789);

        Vehicle sportsVehicle1 = new SportsVehicle("Fiat", "vfndjkvnjfk", 2003, 101);
        Vehicle sportsVehicle2 = new SportsVehicle("BMW", "M2", 2019, 402);
        Vehicle sportsVehicle3 = new SportsVehicle("Nissan", "JT-R", 2011, 317);

        Vehicle truck1 = new Truck("Jeep", "FBNJGN123", 1999, 87);
        Vehicle truck2 = new Truck("Volvo", "FBN123", 2005, 123);
        Vehicle truck3 = new Truck("Mitsubishi", "FB456456", 2008, 50);

        array[0] = vehicle1;
        array[1] = vehicle2;
        array[2] = vehicle3;
        array[3] = sportsVehicle1;
        array[4] = sportsVehicle2;
        array[5] = sportsVehicle3;
        array[6] = electricalVehicle1;
        array[7] = electricalVehicle2;
        array[8] = electricalVehicle3;
        array[9] = truck1;
        array[10] = truck2;
        array[11] = truck3;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].technicalSheet());
        }

        Animal[] arrayDeAnimales = new Animal[14];
        arrayDeAnimales[0] = new Animal("Elefante", 5, "Pequeño", "Dumbo", "Desierto");
        arrayDeAnimales[1] = new Animal("Aguila", 2, "Grande", "Teresa", "Alpes");
        arrayDeAnimales[2] = new Feline("Tigre", 3, "Grande", "Tigre", "Jungla", false);
        arrayDeAnimales[3] = new Feline("Pantera", 1, "Mediana", "Rosa", "Jungla", false);
        arrayDeAnimales[4] = new Canine("Chacal", 2, "Grande", "Jorge", "Bosque", true);
        arrayDeAnimales[5] = new Canine("Coyote", 1, "Grande", "Maria", "Australia", true);
        arrayDeAnimales[6] = new Lion("Leon", 2, "Mediano", "Carlos", "Africa", false);
        arrayDeAnimales[7] = new Lion("Leon", 1, "Grande", "José", "Africa", false);
        arrayDeAnimales[8] = new Cat("Gato", 2, "Mediano", "Lulú", "Casa de alguien", true);
        arrayDeAnimales[9] = new Cat("Gato", 2, "Pequeño", "Mish", "Casa de otro", true);
        arrayDeAnimales[10] = new Wolf("Lobo", 8, "Grande", "Manchas", "Romania", true);
        arrayDeAnimales[11] = new Wolf("Lobo", 1, "Peque", "Ojoslindos", "Irlanda", false);
        arrayDeAnimales[12] = new Dog("Perro", 1, "Grande", "Firulais", "Cordoba", false);
        arrayDeAnimales[13] = new Dog("Perro", 5, "Mediano", "Firulais2", "Cordoba", true);

        for(int i = 0; i < arrayDeAnimales.length; i++) {
            arrayDeAnimales[i].eat();
            arrayDeAnimales[i].subir();
            arrayDeAnimales[i].emitirSonido();
        }
        */

        Rectangulo rectangulo1 = new Rectangulo(3, 2);
        Rectangulo rectangulo2 = new Rectangulo(3, 2);
        Rectangulo rectangulo3 = new Rectangulo(3, 3);

        Triangulo triangulo = new Triangulo(4, 4, 4, 8);
        Circulo circulo = new Circulo(2);

        System.out.println(triangulo.toString());
        System.out.println(circulo.toString());

        System.out.println(rectangulo1.equals(rectangulo2));
        System.out.println(rectangulo1.equals(rectangulo3));


    }
}
