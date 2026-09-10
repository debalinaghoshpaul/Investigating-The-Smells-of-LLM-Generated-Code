import java.io.File;
import java.util.Arrays;

public class FileList {

    public static void main(String[] args) {
        // Get the current directory
        File directory = new File(".");

        // Get a list of all files and directories in the directory
        File[] files = directory.listFiles();

        // Print the list of files and directories
        System.out.println(Arrays.toString(files));
    }
}
