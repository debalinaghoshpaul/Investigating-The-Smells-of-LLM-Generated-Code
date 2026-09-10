import java.util.Scanner;

public class Prefix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Check if the prefix appears somewhere else in the string
        boolean found = false;
        for (int i = 1; i < str.length(); i++) {
            if (str.substring(0, i).equals(str.substring(i))) {
                found = true;
                break;
            }
        }

        // Print the result
        if (found) {
            System.out.println("The prefix appears somewhere else in the string.");
        } else {
            System.out.println("The prefix does not appear somewhere else in the string.");
        }
    }
}
