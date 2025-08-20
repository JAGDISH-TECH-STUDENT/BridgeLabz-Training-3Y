import java.util.Scanner;

public class MultiStudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[][] marks = new int[students][subjects];
        double[] percentage = new double[students];
        String[] grade = new String[students];

        for (int i = 0; i < students; i++) {
            int total = 0;
            System.out.println("Enter marks for Student " + (i + 1));
            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0 || marks[i][j] > 100) {
                    System.out.println("Invalid marks. Try again.");
                    j--;
                    continue;
                }
                total += marks[i][j];
            }
            percentage[i] = (double) total / subjects;
            if (percentage[i] >= 90) grade[i] = "A+";
            else if (percentage[i] >= 80) grade[i] = "A";
            else if (percentage[i] >= 70) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else if (percentage[i] >= 50) grade[i] = "D";
            else grade[i] = "F";
        }

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) + ": Percentage = " + percentage[i] + "%, Grade = " + grade[i]);
        }
    }
}
