import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        String filePath = "C:/Users/debal/OneDrive/Desktop/PhD folder/text_files/numbers_two.txt";
        double sum = 0;
        int count = 0;

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                double number = Double.parseDouble(line);
                sum += number;
                count++;
            }

            scanner.close();

            if (count > 0) {
                double average = sum / count;
                System.out.println("Average: " + average);
            } else {
                System.out.println("No numbers found in the file.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in the file.");
        }
    }
}
