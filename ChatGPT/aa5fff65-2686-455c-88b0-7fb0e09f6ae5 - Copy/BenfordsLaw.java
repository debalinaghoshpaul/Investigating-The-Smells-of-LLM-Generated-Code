import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BenfordsLaw {

    public static void main(String[] args) {
        int[] count = new int[10]; // Array to store digit counts
        
        try {
            File file = new File("numbers.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                int firstDigit = Integer.parseInt(String.valueOf(num).substring(0, 1));
                count[firstDigit]++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
            e.printStackTrace();
        }

        System.out.println("Digit\tPercentage");
        for (int i = 1; i < 10; i++) {
            double percentage = (double) count[i] * 100 / count[1]; // Calculate percentage
            System.out.println(i + "\t" + String.format("%.2f", percentage) + "%");
        }
    }
}
