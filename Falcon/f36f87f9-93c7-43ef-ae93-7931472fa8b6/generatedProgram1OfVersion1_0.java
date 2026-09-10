import java.util.Scanner;

public class CheckFirstTwoCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length() > 0) {
            if (str.charAt(0) == str.charAt(str.length() - 2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("Empty string");
        }
    }
}

// 