public class NumberChecker3 {

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

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int number = 101;

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + NumberChecker.countDigits(number));

        int[] digits = NumberChecker.getDigitsArray(number);
        System.out.print("Digits Array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        int[] reversed = NumberChecker3.reverseDigits(digits);
        System.out.print("Reversed Digits: ");
        for (int d : reversed) System.out.print(d + " ");
        System.out.println();

        System.out.println("Arrays Equal: " + NumberChecker3.areArraysEqual(digits, reversed));
        System.out.println("Palindrome: " + NumberChecker3.isPalindrome(number));
        System.out.println("Duck Number: " + NumberChecker3.isDuckNumber(digits));
    }
}

