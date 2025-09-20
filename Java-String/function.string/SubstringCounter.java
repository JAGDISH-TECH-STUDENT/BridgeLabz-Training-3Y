public class SubstringCounter {
    public static int count(String text, String sub) {
        int count = 0, index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Occurrences: " + count("banana", "ana"));
    }
}

