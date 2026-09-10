import java.util.Scanner;

public class StringToCharArray {

    public static void main(String[] args) {
        // Get the input string from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Convert the string to a character array.
        char[] charArray = str.toCharArray();

        // Print the character array.
        System.out.println("The character array is: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
