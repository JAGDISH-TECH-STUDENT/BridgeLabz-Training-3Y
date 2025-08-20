import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        int heightAmar = input.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int heightAkbar = input.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int heightAnthony = input.nextInt();

        // Youngest
        String youngest = "Amar";
        int minAge = ageAmar;

        if (ageAkbar < minAge) {
            youngest = "Akbar";
            minAge = ageAkbar;
        }
        if (ageAnthony < minAge) {
            youngest = "Anthony";
        }

        // Tallest
        String tallest = "Amar";
        int maxHeight = heightAmar;

        if (heightAkbar > maxHeight) {
            tallest = "Akbar";
            maxHeight = heightAkbar;
        }
        if (heightAnthony > maxHeight) {
            tallest = "Anthony";
        }

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        input.close();
    }
}
