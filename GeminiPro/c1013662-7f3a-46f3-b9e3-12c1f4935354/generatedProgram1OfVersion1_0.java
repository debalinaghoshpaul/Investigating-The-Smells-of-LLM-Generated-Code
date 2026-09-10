import java.util.Scanner;

public class CommonDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first number
        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();

        // Read the second number
        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();

        // Check if the numbers are between 25 and 75
        if (firstNumber < 25 || firstNumber > 75 || secondNumber < 25 || secondNumber > 75) {
            System.out.println("Invalid input. The numbers must be between 25 and 75.");
            return;
        }

        // Convert the numbers to strings
        String firstNumberString = String.valueOf(firstNumber);
        String secondNumberString = String.valueOf(secondNumber);

        // Iterate over the digits of the first number
        for (int i = 0; i < firstNumberString.length(); i++) {
            char firstNumberDigit = firstNumberString.charAt(i);

            // Iterate over the digits of the second number
            for (int j = 0; j < secondNumberString.length(); j++) {
                char secondNumberDigit = secondNumberString.charAt(j);

                // Check if the digits are the same
                if (firstNumberDigit == secondNumberDigit) {
                    System.out.println("true");
                    return;
                }
            }
        }

        // No common digit found
        System.out.println("false");
    }
}
