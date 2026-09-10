import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if (str1.length() > str2.length()) {
            str1 = str1.substring(0, str2.length());
        }

        if (str1.length() < str2.length()) {
            str2 = str2.substring(0, str1.length());
        }

        System.out.println(str1 + str2);
    }
}

// 