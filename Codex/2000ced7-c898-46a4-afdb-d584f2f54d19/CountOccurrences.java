import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        String filePath = "C:/Users/debal/OneDrive/Desktop/PhD folder/text_files/numbers.txt";
        int targetNumber = 10;
        int count = 0;

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                if (number == targetNumber) {
                    count++;
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }

        System.out.println("Total occurrences of " + targetNumber + ": " + count);
    }
}
