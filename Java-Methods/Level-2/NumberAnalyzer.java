
import java.util.Scanner;

public class NumberAnalyzer {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        return Integer.compare(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (isPositive(numbers[i])) {
                System.out.println(isEven(numbers[i]) ? "Positive Even" : "Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 0) System.out.println("First and last are equal");
        else if (result > 0) System.out.println("First is greater than last");
        else System.out.println("First is less than last");
    }
}