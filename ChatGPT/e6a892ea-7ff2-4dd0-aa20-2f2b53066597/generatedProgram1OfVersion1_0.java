import java.util.Scanner;

public class LifeSubstringCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Count the number of occurrences of the substring "life" and "li?e"
        int lifeCount = 0;
        int lifeAnyCount = 0;
        for (int i = 0; i < inputString.length() - 2; i++) {
            if (inputString.substring(i, i + 3).equals("life")) {
                lifeCount++;
            }
            if (inputString.substring(i, i + 3).matches("li[a-z]e")) {
                lifeAnyCount++;
            }
        }

        // Print the results
        System.out.println("The substring \"life\" appears " + lifeCount + " times.");
        System.out.println("The substring \"li?e\" appears " + lifeAnyCount + " times.");
    }
}
