public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0; 
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}
