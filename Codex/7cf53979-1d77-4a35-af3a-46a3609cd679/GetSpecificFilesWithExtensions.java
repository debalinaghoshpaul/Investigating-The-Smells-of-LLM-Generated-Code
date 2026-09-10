import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GetSpecificFilesWithExtensions {

    public static void main(String[] args) throws IOException {
        // Get the specified folder path
        String folderPath = "C:\\Users\\username\\Desktop\\test_folder";

        // Get the specified file extensions
        String[] extensions = {"txt", "csv", "xls"};

        // Get the list of files with the specified extensions
        List<File> files = getFilesWithExtensions(folderPath, extensions);

        // Print the list of files
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    public static List<File> getFilesWithExtensions(String folderPath, String[] extensions) throws IOException {
        // Create a list to store the files
        List<File> files = new ArrayList<>();

        // Get the files in the specified folder
        File folder = new File(folderPath);
        File[] allFiles = folder.listFiles();

        // Iterate over the files
        for (File file : allFiles) {
            // Check if the file is a file and not a directory
            if (file.isFile()) {
                // Get the file extension
                String extension = getFileExtension(file);

                // Check if the file extension is in the specified extensions list
                for (String ext : extensions) {
                    if (extension.equals(ext)) {
                        // Add the file to the list of files
                        files.add(file);
                        break;
                    }
                }
            }
        }

        // Return the list of files
        return files;
    }

    public static String getFileExtension(File file) throws IOException {
        Path path = Paths.get(file.getAbsolutePath());
        return Files.probeContentType(path).split("/")[1];
    }

    // Test
    public static void main(String[] args) {
        // Get the specific files with extensions from a specified folder
        String[] extensions = {"txt", "csv", "xls"};
        List<File> files = getFilesWithExtensions("C:\\Users\\username\\Desktop\\test_folder", extensions);
        for (File file : files) {
            System.out.println(file.getName());
        }

        // Test corner cases:
        // Empty folder:
        List<File> emptyFolderFiles = getFilesWithExtensions("C:\\Users\\username\\Desktop\\empty_folder", extensions);
        System.out.println(emptyFolderFiles.size()); // Expected: 0

        // Non-existent folder:
        List<File> nonExistentFolderFiles = getFilesWithExtensions("C:\\Users\\username\\Desktop\\non_existent_folder", extensions);
        System.out.println(nonExistentFolderFiles.size()); // Expected: 0

        // Invalid file path:
        try {
            List<File> invalidFilePathFiles = getFilesWithExtensions(null, extensions);
        } catch (IOException e) {
            System.out.println(e.getMessage()); // Expected: NullPointerException or IllegalArgumentException
        }
    }
}
