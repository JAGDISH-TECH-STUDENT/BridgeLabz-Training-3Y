import java.util.Scanner;

public class ChocolateDistributor {
    public static int[] distribute(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates and children: ");
        int choco = sc.nextInt(), kids = sc.nextInt();
        int[] result = distribute(choco, kids);
        System.out.println("Each child gets: " + result[0] + ", Remaining: " + result[1]);
    }
}
