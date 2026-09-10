import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        int len = str.length();
        int start = 0;
        int end = len - 1;
        while (start < end) {
            if (str.charAt(start)!= str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

