import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(compareStrings(str1, str2));
    }

    public static int compareStrings(String str1, String str2) {
        if (str1.length()!= str2.length()) {
            return str1.length() - str2.length();
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i)!= str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }

        return str1.length() - str2.length();
    }
}

