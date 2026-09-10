import java.util.Scanner;

public class GoodString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String str = scanner.nextLine();

        // Check if "good" appears starting at index 0 or 1
        boolean isGood = str.startsWith("good") || str.startsWith("good", 1);

        // Print the result
        System.out.println(isGood);
    }
}
