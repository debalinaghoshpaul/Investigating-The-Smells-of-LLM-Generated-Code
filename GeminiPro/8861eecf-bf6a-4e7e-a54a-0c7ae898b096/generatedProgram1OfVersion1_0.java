import java.util.Scanner;

public class RemoveCharacterFromString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Find the substring of length three starting with 'z' and ending with 'g'
        int startIndex = str.indexOf("zg");
        if (startIndex == -1) {
            System.out.println("Substring not found");
        } else {
            // Remove the 2nd character from the substring
            String newStr = str.substring(0, startIndex + 1) + str.substring(startIndex + 2);

            // Print the new string
            System.out.println("New string: " + newStr);
        }
    }
}
