import java.util.Scanner;
public class FirstIsSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
        boolean isSmallest = num1 < num2 && num1 < num3;
        System.out.println("Is the first number the smallest? "+": " + isSmallest);
    }
}
