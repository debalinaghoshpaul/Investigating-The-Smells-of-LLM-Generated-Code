import java.util.Scanner;

public class SubstringCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string and the two substrings to search for
        System.out.println("Enter the input string:");
        String inputString = scanner.nextLine();

        System.out.println("Enter the first substring to search for:");
        String substring1 = scanner.nextLine();

        System.out.println("Enter the second substring to search for:");
        String substring2 = scanner.nextLine();

        // Count the number of times each substring appears in the input string
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.substring(i).startsWith(substring1)) {
                count1++;
            }
            if (inputString.substring(i).startsWith(substring2)) {
                count2++;
            }
        }

        // Print the results
        System.out.println("The first substring appears " + count1 + " times in the input string.");
        System.out.println("The second substring appears " + count2 + " times in the input string.");
    }
}
