import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NonduplicateNames {

    public static void main(String[] args) {
        // Check if the user has provided any command-line arguments.
        if (args.length == 0) {
            System.out.println("Usage: java NonduplicateNames <list of text files>");
            return;
        }

        // Create a set to store the names of the students who have attended at least one day of the course.
        Set<String> names = new HashSet<>();

        // Iterate over the command-line arguments.
        for (String filename : args) {
            // Try to open the file.
            try (Scanner scanner = new Scanner(new File(filename))) {
                // Read the names from the file.
                while (scanner.hasNextLine()) {
                    String name = scanner.nextLine();
                    names.add(name);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found: " + filename);
            }
        }

        // Sort the names in ascending order.
        String[] sortedNames = names.toArray(new String[names.size()]);
        Arrays.sort(sortedNames);

        // Print the sorted names.
        for (String name : sortedNames) {
            System.out.println(name);
        }
    }
}
