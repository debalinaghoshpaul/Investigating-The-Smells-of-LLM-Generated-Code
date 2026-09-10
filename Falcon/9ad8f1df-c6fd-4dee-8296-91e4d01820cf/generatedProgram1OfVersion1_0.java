import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(str.length() - 1);
        if (ch1 == ch2) {
            System.out.println("The character immediately before and after the character is the same.");
        } else {
            System.out.println("The character immediately before and after the character is not the same.");
        }
    }
}

// 