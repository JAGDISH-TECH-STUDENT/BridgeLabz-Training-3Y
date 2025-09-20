public class ToggleCase {
    public static String toggle(String input) {
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) sb.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch)) sb.append(Character.toUpperCase(ch));
            else sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Toggled: " + toggle("Java123"));
    }
}

