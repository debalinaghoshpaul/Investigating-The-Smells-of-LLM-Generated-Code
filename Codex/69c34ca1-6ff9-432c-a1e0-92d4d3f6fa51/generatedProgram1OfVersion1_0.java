import java.util.HashMap;
import java.util.Map;

public class CheckIfLettersOfSecondStringArePresentInFirstString {

    public static boolean checkIfLettersArePresent(String firstString, String secondString) {
        Map<Character, Integer> firstStringCharacterCount = new HashMap<>();
        for (char character : firstString.toCharArray()) {
            if (firstStringCharacterCount.containsKey(character)) {
                firstStringCharacterCount.put(character, firstStringCharacterCount.get(character) + 1);
            } else {
                firstStringCharacterCount.put(character, 1);
            }
        }

        for (char character : secondString.toCharArray()) {
            if (!firstStringCharacterCount.containsKey(character)) {
                return false;
            } else {
                int count = firstStringCharacterCount.get(character);
                if (count == 0) {
                    return false;
                } else {
                    firstStringCharacterCount.put(character, count - 1);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String firstString = "Hello";
        String secondString = "Hel";
        System.out.println(checkIfLettersArePresent(firstString, secondString)); // true

        firstString = "Hello";
        secondString = "World";
        System.out.println(checkIfLettersArePresent(firstString, secondString)); // false
    }
}
