import java.util.*;

public class SecondMostFrequentCharacter {

    public static void main(String[] args) {
        String str = "aabbbccdd";
        char secondMostFrequentCharacter = findSecondMostFrequentCharacter(str);
        System.out.println("The second most frequent character in the string is: " + secondMostFrequentCharacter);
    }

    public static char findSecondMostFrequentCharacter(String str) {
        // Create a map to store the character frequencies
        Map<Character, Integer> characterFrequencies = new HashMap<>();

        // Iterate over the string and update the character frequencies
        for (char character : str.toCharArray()) {
            int frequency = characterFrequencies.getOrDefault(character, 0);
            characterFrequencies.put(character, frequency + 1);
        }

        // Find the character with the second highest frequency
        char secondMostFrequentCharacter = ' ';
        int secondHighestFrequency = 0;
        for (Character character : characterFrequencies.keySet()) {
            int frequency = characterFrequencies.get(character);
            if (frequency > secondHighestFrequency) {
                secondMostFrequentCharacter = character;
                secondHighestFrequency = frequency;
            }
        }

        return secondMostFrequentCharacter;
    }
}
