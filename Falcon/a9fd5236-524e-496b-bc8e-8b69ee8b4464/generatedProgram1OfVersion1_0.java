import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PositiveNumbersException {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("numbers.txt"));
            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                if (number > 0) {
                    throw new IllegalArgumentException("The number " + number + " is positive.");
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file numbers.txt could not be found.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
