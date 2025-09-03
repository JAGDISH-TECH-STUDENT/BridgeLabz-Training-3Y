import java.util.Scanner;

public class TrigonometryCalculator {
    public static double[] calculate(double angleDegrees) {
        double rad = Math.toRadians(angleDegrees);
        return new double[]{Math.sin(rad), Math.cos(rad), Math.tan(rad)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] result = calculate(angle);
        System.out.println("Sine: " + result[0] + ", Cosine: " + result[1] + ", Tangent: " + result[2]);
    }
}


