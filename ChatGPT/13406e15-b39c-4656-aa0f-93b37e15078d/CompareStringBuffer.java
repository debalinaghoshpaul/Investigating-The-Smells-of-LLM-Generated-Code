import java.util.Scanner;

public class CompareStringBuffer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string and string buffer from the user
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        System.out.println("Enter a string buffer: ");
        StringBuffer stringBuffer = new StringBuffer(scanner.nextLine());

        // Compare the string and string buffer
        boolean areEqual = string.equals(stringBuffer.toString());

        // Print the result
        if (areEqual) {
            System.out.println("The string and string buffer are equal.");
        } else {
            System.out.println("The string and string buffer are not equal.");
        }
    }
}
