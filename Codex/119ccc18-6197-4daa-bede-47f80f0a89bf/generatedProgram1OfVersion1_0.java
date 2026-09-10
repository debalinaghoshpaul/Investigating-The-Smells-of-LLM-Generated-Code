import java.util.Scanner;

public class CreateString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the two input strings
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        // Create a new string to store the result
        String result = "";

        // Iterate over the two input strings and append each character to the result string
        for (int i = 0; i < str1.length(); i++) {
            result += str1.charAt(i);
        }

        for (int i = 0; i < str2.length(); i++) {
            result += str2.charAt(i);
        }

        // Print the result string
        System.out.println("The combined string is: " + result);
    }
}
