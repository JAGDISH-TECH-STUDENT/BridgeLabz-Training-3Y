public class PalindromeCheck {
    public static boolean isPalindrome(String input) {
        int left = 0, right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is Palindrome: " + isPalindrome("madam"));
    }
}

