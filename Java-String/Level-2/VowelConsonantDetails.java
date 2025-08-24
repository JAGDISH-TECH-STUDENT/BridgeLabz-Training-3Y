import java.util.Scanner;

public class VowelConsonantDetails {

    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] findCharDetails(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharType(text.charAt(i));
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Character | Type");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("    " + arr[i][0] + "      | " + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[][] result = findCharDetails(text);
        displayTable(result);
    }
}

