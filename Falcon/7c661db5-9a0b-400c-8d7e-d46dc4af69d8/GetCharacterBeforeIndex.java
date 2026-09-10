import java.util.Scanner;

public class GetCharacterBeforeIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Get the index
        System.out.println("Enter the index: ");
        int index = scanner.nextInt();

        // Get the character before the index
        char ch = str.charAt(index - 1);

        // Print the character
        System.out.println("The character before the index is: " + ch);
    }
}
