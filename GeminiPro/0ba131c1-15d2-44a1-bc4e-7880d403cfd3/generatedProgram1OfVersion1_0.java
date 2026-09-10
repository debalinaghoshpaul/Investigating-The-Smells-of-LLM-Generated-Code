import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Input the string: ");
        String inputString = scanner.nextLine();

        // Count the number of vowels in the string
        int vowelCount = countVowels(inputString);

        // Print the number of vowels
        System.out.println("Number of vowels in the string: " + vowelCount);
    }

    public static int countVowels(String inputString) {
        int vowelCount = 0;

        // Iterate over the string and check each character
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}
