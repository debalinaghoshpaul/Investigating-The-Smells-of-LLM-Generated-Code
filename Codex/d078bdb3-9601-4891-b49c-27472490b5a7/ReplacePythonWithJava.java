import java.util.Scanner;

public class ReplacePythonWithJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Replace "Python" with "Java" and "code" with "coding"
        String outputString = inputString.replaceAll("Python", "Java").replaceAll("code", "coding");

        // Print the output string
        System.out.println("Output string: " + outputString);
    }
}
