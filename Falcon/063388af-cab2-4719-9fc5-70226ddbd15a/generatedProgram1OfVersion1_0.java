import java.io.File;

public class CheckIfPathIsDirectoryOrFile {

    public static void main(String[] args) {
        // Test cases
        String[] paths = {
                "/home/user/Documents/file.txt",  // File
                "/home/user/Documents/directory/",  // Directory
                "/home/user/non-existing-path",  // Non-existing path
                "/home/user/Documents/empty-file.txt",  // Empty file
                "/home/user/Documents/directory/file.txt",  // File inside a directory
                "/home/user/Documents/directory/"  // Directory with trailing slash
        };

        for (String path : paths) {
            File file = new File(path);

            // Check if the path is a directory
            if (file.isDirectory()) {
                System.out.println(path + " is a directory.");
            }
            // Check if the path is a file
            else if (file.isFile()) {
                System.out.println(path + " is a file.");
            }
            // Check if the path does not exist
            else {
                System.out.println(path + " does not exist.");
            }
        }
    }
}
