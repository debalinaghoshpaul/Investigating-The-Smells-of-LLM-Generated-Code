import java.util.*;

public class CountOccurrenceOfWords {
  public static void main(String[] args) {
    // Set text in a string
    String text = "Good morning. Have a good class. " +
      "Have a good visit. Have fun!";

    // Create a TreeMap to store words and their counts
    Map<String, Integer> map = new TreeMap<>();

    // Split the words in the text
    String[] words = text.split("[\\s+\\p{P}]");

    // Count the occurrences of each word
    for (String word : words) {
      String key = word.toLowerCase();

      if (key.length() > 0) {
        if (!map.containsKey(key)) {
          map.put(key, 1);
        }
        else {
          int count = map.get(key);
          map.put(key, count + 1);
        }
      }
    }

    // Get all entries from the map
    List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

    // Sort the entries by values
    Collections.sort(entries, (entry1, entry2) -> {
      return entry1.getValue() - entry2.getValue();
    });

    // Print the words and their occurrences
    for (Map.Entry<String, Integer> entry : entries) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
