package inheritance;
public class Main {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle(250, "Tesla Model S");
        PetrolVehicle honda = new PetrolVehicle(180, "Honda Civic");

        tesla.displayInfo();
        tesla.charge();

        honda.displayInfo();
        honda.refuel();
    }
}

