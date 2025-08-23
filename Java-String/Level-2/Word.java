import java.util.Scanner;

public class Word {

    // Method to split text into words using charAt()
    public static String[] splitWords(String text) {
        String[] words = new String[100]; // assuming max 100 words
        int wordCount = 0;
        String currentWord = "";

        for (int i = 0; i != getLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (!currentWord.equals("")) {
                    words[wordCount++] = currentWord;
                    currentWord = "";
                }
            }
        }

        // Add last word if any
        if (!currentWord.equals("")) {
            words[wordCount++] = currentWord;
        }

        // Trim unused array slots
        String[] result = new String[wordCount];
        for (int i = 0; i != wordCount; i++) {
            result[i] = words[i];
        }

        return result;
    }

    // Method to calculate string length without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string reached
        }
        return count;
    }

    // Method to create 2D array of word and its length
    public static String[][] getWordLengthTable(String[] words) {
        String[][] table = new String[getLengthArray(words)][2];
        for (int i = 0; i != getLengthArray(words); i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }

    // Helper method to get array length without using .length
    public static int getLengthArray(String[] arr) {
        int count = 0;
        try {
            while (true) {
                String temp = arr[count];
                count++;
            }
        } catch (Exception e) {
            // End of array reached
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] table = getWordLengthTable(words);

        System.out.println("\nWord\tLength");
        System.out.println("---------------");
        for (int i = 0; i != getLengthArray(table); i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }

        sc.close();
    }
    // Overloaded method to get length of 2D String array
public static int getLengthArray(String[][] arr) {
    int count = 0;
    try {
        while (true) {
            String[] temp = arr[count];
            count++;
        }
    } catch (Exception e) {
        // End of array reached
    }
    return count;
}

}

