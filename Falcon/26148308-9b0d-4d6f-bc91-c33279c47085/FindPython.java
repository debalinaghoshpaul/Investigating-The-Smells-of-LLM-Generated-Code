import java.util.Scanner;

public class FindPython {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the word "Python" appears in the input string.
        if (inputString.toLowerCase().contains("python")) {
            // If the word "Python" appears in the input string, print "Java".
            System.out.println("Java");
        } else {
            // If the word "Python" does not appear in the input string, print "C++".
            System.out.println("C++");
        }
    }
}
