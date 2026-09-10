import java.util.*;

public class StringManipulation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the main string from the user
        System.out.print("Enter the main string: ");
        String mainString = input.nextLine();

        // Get the string to be removed from the user
        System.out.print("Enter the string to be removed: ");
        String removeString = input.nextLine();

        // Create a new string without the removed string
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < mainString.length(); i++) {
            if (!mainString.substring(i, i + removeString.length()).equals(removeString)) {
                newString.append(mainString.charAt(i));
            }
        }

        // Print the new string
        System.out.println("The string after removing the given string is: " + newString);
    }
}
