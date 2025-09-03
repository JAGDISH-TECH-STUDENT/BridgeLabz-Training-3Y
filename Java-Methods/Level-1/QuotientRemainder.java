import java.util.Scanner;

public class QuotientRemainder {
    public static int[] compute(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and divisor: ");
        int num = sc.nextInt(), div = sc.nextInt();
        int[] result = compute(num, div);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
    }
}

