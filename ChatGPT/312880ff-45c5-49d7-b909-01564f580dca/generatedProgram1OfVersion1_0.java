import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {

    public static void main(String[] args) {
        try {
            // Create a file object
            File file = new File("test.txt");

            // Create a FileWriter object
            FileWriter writer = new FileWriter(file, true);

            // Write text to the file
            writer.write("Hello world!\n");
            writer.write("This is a test of the appendToFile method.\n");

            // Close the file
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
