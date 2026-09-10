import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "leetcode";
        int result = firstNonRepeatingCharacter(str);
        System.out.println("The index of the first non-repeating character is: " + result);
    }

    public static int firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character in the string
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCountMap.get(c) == 1) {
                return i;
            }
        }

        // No non-repeating character found
        return -1;
    }
}
