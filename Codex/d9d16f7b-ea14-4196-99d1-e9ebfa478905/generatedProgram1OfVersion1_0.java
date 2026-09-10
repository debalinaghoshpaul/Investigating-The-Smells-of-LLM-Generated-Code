import java.util.Scanner;

public class ConvertToLowercase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read input string
        System.out.print("Input a String: ");
        String str = input.nextLine();

        // Convert string to lowercase
        String lowercaseStr = str.toLowerCase();

        // Print the lowercase string
        System.out.println(lowercaseStr);
    }
}
