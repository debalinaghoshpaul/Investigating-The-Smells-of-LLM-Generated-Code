import java.util.Scanner;

public class SeparateConsonantsVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Separate the consonants and vowels
        String consonants = "";
        String vowels = "";
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (isVowel(ch)) {
                vowels += ch;
            } else {
                consonants += ch;
            }
        }

        // Print the separated consonants and vowels
        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
