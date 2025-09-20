import java.util.*;

public class MostFrequentChar {
    public static char find(String input) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : input.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        char maxChar = input.charAt(0);
        for (char ch : freq.keySet()) {
            if (freq.get(ch) > freq.get(maxChar)) maxChar = ch;
        }
        return maxChar;
    }

    public static void main(String[] args) {
        System.out.println("Most Frequent: " + find("success"));
    }
}

