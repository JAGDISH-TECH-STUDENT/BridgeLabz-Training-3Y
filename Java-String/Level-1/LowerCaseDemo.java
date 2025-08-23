import java.util.Scanner;

public class LowerCaseDemo {
    public static String customToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compare(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String custom = customToLower(text);
        String builtIn = text.toLowerCase();

        System.out.println("Equal :" + compare(custom, builtIn));
    }
}


