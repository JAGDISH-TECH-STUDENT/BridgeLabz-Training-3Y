import java.util.Scanner;

public class TrimString {

   public static int[] trimIndexes(String text) {
        int s = 0, e = text.length() - 1;
        while (s < text.length() && text.charAt(s) == ' '){ 
            s++;
        }
        while (e>= 0 && text.charAt(e) == ' '){ 
            e--;
        }
        return new int[]{s, e};
    }

    
    public static String mySubstring(String text, int s, int e) {
        String result = "";
        for (int i = s; i <= e; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    
    public static boolean myEquals(String s1, String s2) {
        if (s1.length() != s2.length()){ 
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)){ 
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text with spaces:");
        String text = sc.nextLine();

        int []index = trimIndexes(text);
        String trimmed = mySubstring(text, index[0], index[1]);
        String builtinTrim = text.trim();

        System.out.println("Trimmed (manual): '" + trimmed + "'");
        System.out.println("Trimmed (built-in): '" + builtinTrim + "'");
        System.out.println("Are both equal " + myEquals(trimmed, builtinTrim));
    }
}

