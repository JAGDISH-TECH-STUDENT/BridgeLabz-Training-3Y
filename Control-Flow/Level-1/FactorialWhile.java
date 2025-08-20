import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        long factorial = 1;
        int i = 1;

        // Loop to calculate factorial
        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

