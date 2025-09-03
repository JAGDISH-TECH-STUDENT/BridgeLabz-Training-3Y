import java.util.Scanner;

public class HandshakeCalculator {
    public static int calculate(int students) {
        return (students * (students - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.println("Maximum handshakes: " + calculate(n));
    }
}

