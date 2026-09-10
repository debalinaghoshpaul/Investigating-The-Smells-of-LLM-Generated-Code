import java.util.Scanner;

public class SwapLastTwoChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(swapLastTwoChars(str));
    }

    public static String swapLastTwoChars(String str) {
        int len = str.length();
        if (len < 2) {
            return str;
        }
        char temp = str.charAt(len - 2);
        str = str.substring(0, len - 1) + temp + str.substring(len - 1);
        return swapLastTwoChars(str);
    }
}

// 