import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter from the alphabet: ");
        char letter = scanner.next().charAt(0);
        if (Character.isUpperCase(letter)) {
            System.out.println("Vowel");
        } else if (Character.isLowerCase(letter)) {
            System.out.println("Consonant");
        } else {
            System.out.println("Input letter is not a letter or a string of length > 1");
        }
    }
}
// 