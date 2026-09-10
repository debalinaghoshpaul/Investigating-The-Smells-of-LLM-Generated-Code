import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] arr = new int[str.length()];
        int maxLen = 0;
        for (int i = 0; i < str.length(); i++) {
            arr[i] = 1;
            if (str.charAt(i) == str.charAt(i + 1)) {
                arr[i] = 2;
            } else {
                arr[i] = 1;
            }
            if (arr[i] > maxLen) {
                maxLen = arr[i];
            }
        }
        System.out.println(maxLen);
    }
}

// 