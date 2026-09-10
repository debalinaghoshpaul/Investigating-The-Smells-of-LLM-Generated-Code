import java.util.Scanner;

public class SubstringBetweenToast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the first and last occurrence of the substring "toast"
        int firstIndex = inputString.indexOf("toast");
        int lastIndex = inputString.lastIndexOf("toast");

        // Check if the substring "toast" exists in the input string
        if (firstIndex == -1 || lastIndex == -1) {
            System.out.println("The substring \"toast\" does not exist in the input string.");
        } else {
            // Get the substring between the first and last occurrence of "toast"
            String substring = inputString.substring(firstIndex + 5, lastIndex);

            // Print the substring
            System.out.println("The substring between the first and last occurrence of \"toast\" is: " + substring);
        }
    }
}
