import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Multiples of " + num + " below 100:");
        for (int i = num; i < 100; i += num) {
            System.out.println(i);
        }

        input.close();
    }
}
