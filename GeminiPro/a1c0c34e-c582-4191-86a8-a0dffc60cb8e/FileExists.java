import java.io.File;

public class FileExists {

    public static void main(String[] args) {
        // Test cases
        String[] paths = {
            "existing_file.txt",
            "non_existing_file.txt",
            "existing_directory",
            "non_existing_directory",
            null,
            "",
        };

        for (String path : paths) {
            // Check if the file or directory exists
            boolean exists = new File(path).exists();

            // Print the result
            System.out.printf("%s exists: %s\n", path, exists);
        }
    }
}
