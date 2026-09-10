import java.util.Scanner;

public class ConcatenateString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter the string: ");
        String string = scanner.nextLine();

        // Get the number of times to concatenate the string
        System.out.println("Enter the number of times to concatenate the string: ");
        int n = scanner.nextInt();

        // Concatenate the string with itself n times
        String concatenatedString = "";
        for (int i = 0; i < n; i++) {
            concatenatedString += string;
        }

        // Print the concatenated string
        System.out.println("The concatenated string is: " + concatenatedString);
    }
}
