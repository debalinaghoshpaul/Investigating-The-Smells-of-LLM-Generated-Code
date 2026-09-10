import java.util.*;

public class WordCount {

    public static void main(String[] args) {
        // Create a map to store the word counts
        Map<String, List<Integer>> wordCounts = new HashMap<>();

        // Read the input
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String word = parts[0];
            int pageNumber = Integer.parseInt(parts[1]);

            // Add the word to the map
            List<Integer> pageNumbers = wordCounts.getOrDefault(word, new ArrayList<>());
            pageNumbers.add(pageNumber);
            wordCounts.put(word, pageNumbers);
        }

        // Print the word counts
        for (Map.Entry<String, List<Integer>> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
