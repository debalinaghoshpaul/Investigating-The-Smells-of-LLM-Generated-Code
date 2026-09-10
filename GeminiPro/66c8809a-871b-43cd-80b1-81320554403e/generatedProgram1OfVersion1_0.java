import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterIndex {

    public static int findFirstUniqueCharacterIndex(String str) {
        Map<Character, Integer> characterCounts = new HashMap<>();

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            characterCounts.merge(c, 1, Integer::sum);
        }

        // Find the first character with count 1
        for (int i = 0; i < str.length(); i++) {
            if (characterCounts.get(str.charAt(i)) == 1) {
                return i;
            }
        }

        // No unique character found
        return -1;
    }

    public static void main(String[] args) {
        String str = "wresource";
        int index = findFirstUniqueCharacterIndex(str);
        System.out.println("First unique character of the above: " + index);
    }
}
