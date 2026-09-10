import java.util.*;

public class CheckPermutation {

    // Function to check if two strings are permutations of each other
    public static boolean isPermutation(String str1, String str2) {
        // Check if the strings are the same length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a map to store the frequency of each character in str1
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Iterate over str2 and check if each character is present in map
        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }

            // Decrement the frequency of the character in map
            map.put(c, map.get(c) - 1);
        }

        // If all characters in str2 are present in map, then the strings are permutations of each other
        return true;
    }

    // Main method
    public static void main(String[] args) {
        // Test cases
        String[][] testCases = {
                {"xxyz", "yxzx"},
                {"", ""},
                {"abc", "def"}
        };

        for (String[] testCase : testCases) {
            String str1 = testCase[0];
            String str2 = testCase[1];
            boolean result = isPermutation(str1, str2);
            System.out.println("Original strings: " + str1 + " " + str2 + "\nIs permutation: " + result);
        }
    }
}
