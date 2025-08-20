import java.util.Scanner;

public class BMIMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // [height, weight, BMI]
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter height (m) and weight (kg) for person " + (i + 1));
            double h = sc.nextDouble();
            double w = sc.nextDouble();

            if (h <= 0 || w <= 0) {
                System.out.println("Invalid input. Try again.");
                i--;
                continue;
            }

            personData[i][0] = h;
            personData[i][1] = w;
            personData[i][2] = w / (h * h);

            double bmi = personData[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + personData[i][0] +", Weight = " + personData[i][1] + ", BMI = " + personData[i][2] +", Status = " + status[i]);
        }
    }
}

