public class NumberChecker2 {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshad(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }

        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int number = 21;

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + NumberChecker2.countDigits(number));

        int[] digits = NumberChecker2.getDigitsArray(number);
        System.out.print("Digits Array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Sum of Digits: " + NumberChecker2.sumOfDigits(digits));
        System.out.println("Sum of Squares: " + NumberChecker2.sumOfSquares(digits));
        System.out.println("Harshad Number: " + NumberChecker2.isHarshad(number));

        System.out.println("Digit Frequencies:");
        int[][] freq = NumberChecker2.digitFrequency(digits);
        for (int[] row : freq) {
            if (row[1] > 0){
                System.out.println("Digit " + row[0] + ": " + row[1]);
            }
        }
    }
}




