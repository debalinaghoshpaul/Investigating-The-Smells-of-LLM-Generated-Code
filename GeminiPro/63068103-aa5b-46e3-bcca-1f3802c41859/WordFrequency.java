import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the text
        String text = scanner.nextLine();

        // Split the text into words
        String[] words = text.split(" ");

        // Create a map to store the word frequencies
        Map<String, Integer> wordFrequencies = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            if (wordFrequencies.containsKey(word)) {
                wordFrequencies.put(word, wordFrequencies.get(word) + 1);
            } else {
                wordFrequencies.put(word, 1);
            }
        }

        // Find the word with the highest frequency
        String mostFrequentWord = "";
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        // Find the word with the most letters
        String longestWord = "";
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        // Print the most frequent word and the word with the most letters
        System.out.println("Most frequent word: " + mostFrequentWord);
        System.out.println("Word with the most letters: " + longestWord);
    }
}
