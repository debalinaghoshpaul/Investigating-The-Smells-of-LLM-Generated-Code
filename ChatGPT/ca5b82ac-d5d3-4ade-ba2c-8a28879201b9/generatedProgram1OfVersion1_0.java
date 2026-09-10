import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StoreTextFileContentLineByLineInAnArray {

    public static void main(String[] args) throws IOException {
        // Create a File object
        File file = new File("test.txt");

        // Create an ArrayList to store the lines of the file
        List<String> lines = new ArrayList<>();

        // Read the file line by line
        try {
            lines = Files.readAllLines(Paths.get(file.getPath()));
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        // Print the lines of the file
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
