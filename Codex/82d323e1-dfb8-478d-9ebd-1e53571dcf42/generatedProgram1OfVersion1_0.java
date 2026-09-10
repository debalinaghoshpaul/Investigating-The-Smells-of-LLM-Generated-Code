import java.util.Scanner;

public class PQBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the string has pq-balance
        boolean hasPQBalance = true;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'p' && input.charAt(i + 1) != 'q') {
                hasPQBalance = false;
                break;
            }
        }

        // Print the result
        if (hasPQBalance) {
            System.out.println("The string has pq-balance.");
        } else {
            System.out.println("The string does not have pq-balance.");
        }
    }
}
