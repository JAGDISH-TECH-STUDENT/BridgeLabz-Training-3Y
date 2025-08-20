import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] freq = new int[10]; // Index 0–9 for digits

        while (number != 0) {
            int digit = number % 10;
            freq[digit]++;
            number /= 10;
        }

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i] + " time(s)");
            }
        }
    }
}
