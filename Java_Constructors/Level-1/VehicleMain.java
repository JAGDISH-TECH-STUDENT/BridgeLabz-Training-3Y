public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Jagdish", "Bike");
        Vehicle v2 = new Vehicle("Neha", "Car");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(2000.0);
        v1.displayVehicleDetails();
    }
}

