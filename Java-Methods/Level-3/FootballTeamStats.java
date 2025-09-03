import java.util.Random;

public class FootballTeamStats {

    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + rand.nextInt(101);
        }
        return heights;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr){ 
            sum += val;
        }
        return sum;
    }

    public static double findMean(int[] arr) {
        return findSum(arr) / (double) arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int val : arr){ 
            if (val < min) min = val;
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int val : arr){ 
            if (val > max) max = val;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.println("Player Heights:");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.printf("Mean Height: %.2f cm%n", findMean(heights));
    }
}
