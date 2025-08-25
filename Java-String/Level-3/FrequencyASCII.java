import java.util.Scanner;

public class FrequencyASCII {

    public static String[][] frequency(String text) {
        int[] freq = new int[256];
        int n = text.length();

        for (int i = 0; i < n; i++) {
            freq[text.charAt(i)]++;
        }

        String[][] result = new String[n][2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (freq[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; 
                index++;
            }
        }
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freq = frequency(text);
        System.out.println("Character frequencies:");
        for (String[] row : freq) {
            System.out.println(row[0] + "  " + row[1]);
        }
    }
}

