import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteReadFile {

    public static void main(String[] args) {
        String fileName = "test.txt";

        // Write to file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, world!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from file
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
