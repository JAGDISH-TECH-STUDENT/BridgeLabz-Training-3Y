
public class CountVowelsConsonants {
    public static void count(String input) {
        int vowels = 0, consonants = 0;
        input = input.toLowerCase();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    public static void main(String[] args) {
        count("Hello World");
    }
}

