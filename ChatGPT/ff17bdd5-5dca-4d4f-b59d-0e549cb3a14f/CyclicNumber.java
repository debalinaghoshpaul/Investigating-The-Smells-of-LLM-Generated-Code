import java.util.Scanner;

public class CyclicNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input number
        System.out.println("Input a number:");
        int number = scanner.nextInt();

        // Check if the number is cyclic
        boolean isCyclic = isCyclic(number);

        // Print the result
        if (isCyclic) {
            System.out.println("It is a cyclic number.");
        } else {
            System.out.println("It is not a cyclic number.");
        }
    }

    private static boolean isCyclic(int number) {
        // Convert the number to a string
        String numberString = Integer.toString(number);

        // Get the length of the number string
        int length = numberString.length();

        // Create a new string by rotating the number string by one digit
        String rotatedNumberString = numberString.substring(1) + numberString.charAt(0);

        // Convert the rotated number string back to an integer
        int rotatedNumber = Integer.parseInt(rotatedNumberString);

        // Check if the rotated number is a multiple of the original number
        return rotatedNumber % number == 0;
    }
}
