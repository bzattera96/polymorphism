import ar.com.ada.online.second.subclass.ElectricalVehicle;
import ar.com.ada.online.second.subclass.SportsVehicle;
import ar.com.ada.online.second.subclass.Truck;
import ar.com.ada.online.second.superclass.Vehicle;

public class Main {
    public static final void main(String[] args) { //acordarse usar el final
        Vehicle[] array = new Vehicle[12];

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
    }
}
