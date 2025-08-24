import java.util.Scanner;

public class SplitWordsMinMax {
    public static String[] splitText(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        String[] words = new String[count + 1];
        String temp = "";
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                words[index++] = temp;
                temp = "";
            }
        }
        words[index] = temp;
        return words;
    }
    public static int strLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(strLength(words[i]));
        }
        return result;
    }
    public static int[] findMinMax(String[][] arr) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (Integer.parseInt(arr[i][1]) < Integer.parseInt(arr[minIndex][1])) {
                minIndex = i;
            }
            if (Integer.parseInt(arr[i][1]) > Integer.parseInt(arr[maxIndex][1])) {
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] wordLength = wordWithLength(words);
        int[] result = findMinMax(wordLength);

        System.out.println("Shortest Word: " + wordLength[result[0]][0] + " (Length: " + wordLength[result[0]][1] + ")");
        System.out.println("Longest Word: " + wordLength[result[1]][0] + " (Length: " + wordLength[result[1]][1] + ")");
    }
}

