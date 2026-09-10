import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        reverseString(str);
        System.out.println(str);
    }

    public static void reverseString(String str) {
        if (str.length() == 0) {
            return;
        }
        reverseString(str.substring(1));
        reverseString(str.substring(0, 1));
        System.out.println(str);
    }
}

