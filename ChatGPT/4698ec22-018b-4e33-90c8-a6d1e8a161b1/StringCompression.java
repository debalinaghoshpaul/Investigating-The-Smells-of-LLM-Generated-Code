import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    public static void main(String[] args) {
        String input = "aaaabbbbcccccddddeeee";
        String compressed = compress(input);
        System.out.println(compressed); // Output: a4b4c5d4e5
    }

    public static String compress(String input) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        StringBuilder compressed = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            compressed.append(entry.getKey()).append(entry.getValue());
        }

        return compressed.toString();
    }

    public static void testCases() {
        // Regular cases
        System.out.println(compress("aaaabbbbccccc")); // ab4c5
        System.out.println(compress("abcdef")); // abcdef
        System.out.println(compress("12345")); // 12345

        // Corner cases
        System.out.println(compress("")); // ""
        System.out.println(compress("a")); // a1
        System.out.println(compress("11111")); // 15
        System.out.println(compress("abcdefghijkl")); // abcdefghijkl
        System.out.println(compress("12345678901234567890")); // 12345678901234567890
    }
}
