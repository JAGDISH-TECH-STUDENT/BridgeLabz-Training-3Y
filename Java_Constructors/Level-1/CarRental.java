public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000.0;

    public CarRental() {
        this("Customer", "Generic", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total: " + calculateTotalCost());
    }
}

