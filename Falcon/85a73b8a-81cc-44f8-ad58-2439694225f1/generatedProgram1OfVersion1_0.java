import java.util.Scanner;

public class NextSmallestPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("The next smallest palindrome is: " + nextSmallestPalindrome(str));
    }

    public static String nextSmallestPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!= str.charAt(str.length() - 1 - i)) {
                sb.append(str.charAt(i));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}

