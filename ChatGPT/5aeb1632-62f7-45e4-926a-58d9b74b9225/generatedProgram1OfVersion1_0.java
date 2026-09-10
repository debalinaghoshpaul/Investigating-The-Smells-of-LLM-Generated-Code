import java.io.File;

public class CheckFilePermissions {

    public static void main(String[] args) {
        // Create a file or directory
        File file = new File("test.txt");

        // Check if the file exists
        if (file.exists()) {
            // Check if the file has read permission
            if (file.canRead()) {
                System.out.println("The file has read permission.");
            } else {
                System.out.println("The file does not have read permission.");
            }

            // Check if the file has write permission
            if (file.canWrite()) {
                System.out.println("The file has write permission.");
            } else {
                System.out.println("The file does not have write permission.");
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
