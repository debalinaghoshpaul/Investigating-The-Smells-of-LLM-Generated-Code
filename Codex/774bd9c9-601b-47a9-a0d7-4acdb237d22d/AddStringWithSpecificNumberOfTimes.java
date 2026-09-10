import java.util.Scanner;

public class AddStringWithSpecificNumberOfTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string and the number of times to add it
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("Enter the number of times to add the string: ");
        int n = scanner.nextInt();

        // Add the string the specified number of times
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }

        // Print the result
        System.out.println("The result is: " + result);
    }
}
