import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharIndex {

    public static int findFirstNonRepeating(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Count the frequency of each character in the input string
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the index of the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (charCountMap.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1; // If no non-repeating character found
    }

    public static void main(String[] args) {
        String input = "leetcode";
        int index = findFirstNonRepeating(input);
        
        if (index != -1) {
            System.out.println("The index of the first non-repeating character in the string '" + input + "' is: " + index);
        } else {
            System.out.println("No non-repeating character found in the string '" + input + "'.");
        }
    }
}
