import java.util.Scanner;

public class SpringSeasonChecker {
    public static boolean isSpring(int month, int day) {
        return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and day: ");
        int m = sc.nextInt(), d = sc.nextInt();
        System.out.println(isSpring(m, d) ? "It's a Spring Season" : "Not a Spring Season");
    }
}
