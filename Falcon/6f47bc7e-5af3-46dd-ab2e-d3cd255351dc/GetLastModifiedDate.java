import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;

public class GetLastModifiedDate {

    public static void main(String[] args) {
        // Get the file path
        String filePath = "C:\\Users\\user\\Desktop\\test.txt";

        // Convert the file path to a Path object
        Path path = Paths.get(filePath);

        // Get the file's attributes
        BasicFileAttributes attr;
        try {
            attr = Files.readAttributes(path, BasicFileAttributes.class);
        } catch (Exception e) {
            System.out.println("Error getting file attributes: " + e.getMessage());
            return;
        }

        // Get the last modified date
        long lastModifiedTime = attr.lastModifiedTime().toMillis();

        // Convert the last modified date to a human-readable format
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String lastModifiedDate = sdf.format(lastModifiedTime);

        // Print the last modified date
        System.out.println("Last modified date: " + lastModifiedDate);
    }
}
