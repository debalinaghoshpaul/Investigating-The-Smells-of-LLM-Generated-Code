import java.util.Scanner;

public class CheckVowelString {

    public static boolean checkVowelString(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        boolean isVowelString = checkVowelString(str);

        if (isVowelString) {
            System.out.println("The string contains only vowels.");
        } else {
            System.out.println("The string does not contain only vowels.");
        }
    }
}
