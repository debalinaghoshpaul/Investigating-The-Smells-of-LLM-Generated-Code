import java.util.Scanner;

public class FirstDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input integer.
        int number = scanner.nextInt();

        // Extract the first digit.
        int firstDigit = number % 10;

        // Print the first digit.
        System.out.println(firstDigit);
    }
}
