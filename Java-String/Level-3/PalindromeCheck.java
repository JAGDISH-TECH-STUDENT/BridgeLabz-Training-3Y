import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)){ 
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end){ 
            return true;
        }
        if (text.charAt(start) != text.charAt(end)){ 
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeArray(String text) {
        char[] arr = text.toCharArray();
        char[] rev = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = text.charAt(arr.length - 1 - i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != rev[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Logic 1: " + (isPalindrome(text) ?"Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2: " + (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3: " + (isPalindromeArray(text) ? "Palindrome" : "Not Palindrome"));
    }
}

