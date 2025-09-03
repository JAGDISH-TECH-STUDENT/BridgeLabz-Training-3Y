import java.util.Scanner;

public class NumberSignChecker {
    public static int check(int number) {
        return number > 0 ? 1 : number < 0 ? -1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Result: " + check(num));
    }
}
