import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileLineByLine {

    public static void main(String[] args) {
        // Get the file path from the user.
        System.out.println("Enter the file path: ");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();

        // Read the file line by line.
        try {
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
