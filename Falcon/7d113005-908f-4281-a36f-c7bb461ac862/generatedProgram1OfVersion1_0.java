import java.util.Scanner;

public class CheckHappy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch = str.charAt(0);
        if (str.length() > 1) {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    if (str.charAt(i - 1) == ch) {
                        if (str.charAt(i - 2) == ch) {
                            if (str.charAt(i - 3) == ch) {
                                if (str.charAt(i - 4) == ch) {
                                    System.out.println(ch + " is happy");
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (str.charAt(0) == ch) {
                System.out.println(ch + " is happy");
            }
        }
    }
}

// 