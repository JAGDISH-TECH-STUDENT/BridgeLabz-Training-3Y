import java.util.Scanner;

public class WordSplitter {
    public static String[] splitWords(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' '){
                wordCount++;
            }
            
        }
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[wordIndex++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] customSplit = splitWords(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("Custom Split:");
        for (String word : customSplit) System.out.println(word);

        System.out.println("Built-in Split:");
        for (String word : builtInSplit) System.out.println(word);

        System.out.println("Are both splits equal? " + compareArrays(customSplit, builtInSplit));
    }
}

