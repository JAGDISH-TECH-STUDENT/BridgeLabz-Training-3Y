import java.util.Scanner;
public class CountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
        while (counter >= 1) {
            System.out.println("Countdown: " + counter);
            counter--;
        }
        System.out.println("Rocket Launch!");
    }
}
