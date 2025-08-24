import java.util.Random;

public class StudentVoting {

    public static int[] generateAges(int n) {
        Random r = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = r.nextInt(80); 
        }
        return ages;
    }

    
    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "False";
            } else if (ages[i] >= 18) {
                result[i][1] = "True";
            } else {
                result[i][1] = "False";
            }
        }
        return result;
    }

  
    public static void display(String[][] arr) {
        System.out.println("Age | Can Vote");
        System.out.println("--------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " + arr[i][0] + "  | " + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = checkVoting(ages);
        display(result);
    }
}

