public class WordReplacer {
    public static String replace(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        System.out.println("Replaced: " + replace("I love Java", "Java", "Python"));
    }
}

