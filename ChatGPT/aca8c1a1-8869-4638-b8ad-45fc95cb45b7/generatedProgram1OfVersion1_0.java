import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String userInput = input.nextLine();

        if(userInput.length() != 1 || !Character.isLetter(userInput.charAt(0))) {
            System.out.println("Error: Please enter a single alphabet character.");
        } else {
            char ch = Character.toLowerCase(userInput.charAt(0));
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }

        input.close();
    }
}
