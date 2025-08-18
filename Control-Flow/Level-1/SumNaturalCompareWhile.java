import java.util.Scanner;  
public class SumNaturalCompareWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Both are equal? " + (sum == formulaSum));
        } else {
            System.out.println("Not a natural number");
        }
    }
}
