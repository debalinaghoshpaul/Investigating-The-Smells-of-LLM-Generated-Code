import java.util.Scanner;

public class CompareString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string and character sequence
        System.out.println("Enter the string: ");
        String string = scanner.nextLine();

        System.out.println("Enter the character sequence: ");
        String sequence = scanner.nextLine();

        // Compare the string and character sequence
        int comparisonResult = string.compareTo(sequence);

        // Print the result
        if (comparisonResult == 0) {
            System.out.println("The string and character sequence are equal.");
        } else if (comparisonResult > 0) {
            System.out.println("The string is greater than the character sequence.");
        } else {
            System.out.println("The string is less than the character sequence.");
        }
    }
}
