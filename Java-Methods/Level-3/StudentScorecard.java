import java.util.Scanner;

public class StudentScorecard {

    public static int[][] generateScores(int studentCount) {
        int[][] scores = new int[studentCount][3]; 
        for (int i = 0; i < studentCount; i++) {
            scores[i][0] = (int)(Math.random() * 50) + 50; 
            scores[i][1] = (int)(Math.random() * 50) + 50; 
            scores[i][2] = (int)(Math.random() * 50) + 50; 
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // [][0]=Total, [][1]=Average, [][2]=Percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                    (i + 1),
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int studentCount = scanner.nextInt();

        int[][] scores = generateScores(studentCount);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}

