import java.util.Scanner;
public class BonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double bonus;

        // Calculate bonus based on salary
        if (salary >= 100000) {
            bonus = salary * 0.10;
        } else if (salary >= 50000) {
            bonus = salary * 0.07;
        } else {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus: Rupees is " + bonus);
    }
}
