import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String str) {
        Set<Character> charSet = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        while (right < str.length()) {
            if (!charSet.contains(str.charAt(right))) {
                charSet.add(str.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                charSet.remove(str.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
