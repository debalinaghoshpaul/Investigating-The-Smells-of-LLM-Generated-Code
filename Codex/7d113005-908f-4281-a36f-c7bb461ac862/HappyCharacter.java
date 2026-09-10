import java.util.Scanner;

public class HappyCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("Enter a character to check: ");
        char ch = scanner.nextLine().charAt(0);

        boolean isHappy = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                if (i > 0 && str.charAt(i - 1) == ch) {
                    isHappy = true;
                    break;
                } else if (i < str.length() - 1 && str.charAt(i + 1) == ch) {
                    isHappy = true;
                    break;
                }
            }
        }

        if (isHappy) {
            System.out.println("The character is happy.");
        } else {
            System.out.println("The character is not happy.");
        }
    }
}
