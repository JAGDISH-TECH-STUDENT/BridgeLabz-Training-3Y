import java.util.Scanner;

public class UniqueCharactersFinder {

    public static int findLength(String text) {
        int count = 0;
       if(text==null){
        return 0;
       }
       for(char c:text.toCharArray()){
            count++;
       }
        return count;
    }

    public static char[] findUniqueCharacters(String text) {
        int n = findLength(text);
        char[] result = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                result[index++] = ch;
            }
        }
        char[] finalResult = new char[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = findUniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }
}


