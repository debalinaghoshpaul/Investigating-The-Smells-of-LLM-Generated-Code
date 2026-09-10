import java.io.File;

public class FileSize {

    public static void main(String[] args) {
        // Get the file path from the user
        System.out.println("Enter the file path: ");
        String filePath = System.console().readLine();

        // Create a File object
        File file = new File(filePath);

        // Check if the file exists
        if (file.exists()) {
            // Get the file size in bytes
            long fileSize = file.length();

            // Print the file size
            System.out.println("The size of the file is: " + fileSize + " bytes");
        } else {
            // Print an error message
            System.out.println("The file does not exist");
        }
    }
}
