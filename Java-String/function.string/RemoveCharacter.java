public class RemoveCharacter {
    public static String remove(String input, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c != ch) sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Modified: " + remove("Hello World", 'l'));
    }
}

