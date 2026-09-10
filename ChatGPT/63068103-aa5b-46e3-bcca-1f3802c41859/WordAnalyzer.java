import java.util.*;

public class WordAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the text:");
        String text = scanner.nextLine();
        
        String[] words = text.split(" ");
        
        Map<String, Integer> wordFrequency = new HashMap<>();
        String mostFrequentWord = "";
        int maxFrequency = 0;
        
        String longestWord = "";
        int maxLength = 0;
        
        for (String word : words) {
            // Calculate word frequency
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            if (wordFrequency.get(word) > maxFrequency) {
                maxFrequency = wordFrequency.get(word);
                mostFrequentWord = word;
            }
            
            // Calculate longest word
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        
        System.out.println("Most frequent word: " + mostFrequentWord);
        System.out.println("Longest word: " + longestWord);
    }
}
