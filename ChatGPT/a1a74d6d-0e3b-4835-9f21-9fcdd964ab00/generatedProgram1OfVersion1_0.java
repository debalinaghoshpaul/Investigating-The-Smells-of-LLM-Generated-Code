import java.util.HashMap;
import java.util.Map;

public class CharacterIndexFinder {

    public static void main(String[] args) {
        // Create a map to store the characters of the alphabet and their corresponding indexes
        Map<Character, Integer> alphabetIndexMap = new HashMap<>();

        // Add the characters of the alphabet to the map along with their indexes
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetIndexMap.put(c, c - 'a');
        }

        // Print the index of each character of the alphabet
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println("Index of " + c + ": " + alphabetIndexMap.get(c));
        }
    }
}
