public class LongestWordFinder {
    public static String find(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println("Longest Word: " + find("Java is a powerful language"));
    }
}

