import java.util.Scanner;

public class GeometryUtility {

    public static double getEuclideanDistance(int x1, int y1, int x2, int y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }

    public static double[] getLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double)(y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1 (x1 y1):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter coordinates for Point 2 (x2 y2):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double distance = getEuclideanDistance(x1, y1, x2, y2);
        double[] lineEquation = getLineEquation(x1, y1, x2, y2);

        System.out.printf("\nEuclidean Distance: %.2f\n", distance);
        System.out.printf("Line Equation: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);
    }
}

