package date16_sep.inheritance;
public class Vehicle1 {
    protected int maxSpeed;
    protected String model;

    public Vehicle1(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}
