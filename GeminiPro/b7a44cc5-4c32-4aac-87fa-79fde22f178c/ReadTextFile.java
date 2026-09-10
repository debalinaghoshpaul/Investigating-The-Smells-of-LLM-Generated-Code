import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {

    public static void main(String[] args) {
        // Create a File object
        File file = new File("input.txt");
        
         // Test case 1: File does not exist
        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        }

        try {
            // Create a Scanner object to read the file
            Scanner scanner = new Scanner(file);

            // Read the file line by line and print it
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Test case 2: Empty File
            if (scanner.hasNextLine()) {
                System.out.println("File is empty");
            }
            
            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
