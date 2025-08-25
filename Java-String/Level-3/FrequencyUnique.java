import java.util.Scanner;

public class FrequencyUnique {

    public static char[] findUniqueCharacters(String text) {
        int n = text.length();
        char[] result = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                result[index++] = ch;
            }
        }

        char[] finalResult = new char[index];
        for (int i = 0; i < index; i++) finalResult[i] = result[i];
        return finalResult;
    }

    public static String[][] frequency(String text) {
        int[] freq = new int[256];
        int n = text.length();

        for (int i = 0; i < n; i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = findUniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freq = frequency(text);
        System.out.println("Character frequencies:");
        for (String[] row : freq) {
            System.out.println(row[0] + " " + row[1]);
        }
    }
}

