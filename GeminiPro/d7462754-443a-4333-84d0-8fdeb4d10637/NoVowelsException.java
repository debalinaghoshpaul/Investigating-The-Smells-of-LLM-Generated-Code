import java.util.Scanner;

public class NoVowelsException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        try {
            if (!containsVowels(str)) {
                throw new NoVowelsException("The string does not contain any vowels.");
            }
        } catch (NoVowelsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean containsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}

class NoVowelsException extends Exception {

    public NoVowelsException(String message) {
        super(message);
    }
}
