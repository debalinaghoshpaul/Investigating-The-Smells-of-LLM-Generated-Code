import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class SpellChecker {
    private static HashSet<String> dictionary;

    public static void main(String[] args) {
        // Load dictionary from words.txt file
        loadDictionary();

        // Read text file
        String filePath = "path/to/your/text/file.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                // Remove punctuation and split line into words
                String[] words = line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

                // Check each word for misspelling
                for (String word : words) {
                    if (!dictionary.contains(word)) {
                        System.out.println("Potentially misspelled word: " + word + " (Line " + lineNumber + ")");
                    }
                }

                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadDictionary() {
        dictionary = new HashSet<>();
        String dictionaryFilePath = "path/to/your/words.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(dictionaryFilePath))) {
            String word;
            while ((word = br.readLine()) != null) {
                dictionary.add(word.toLowerCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}