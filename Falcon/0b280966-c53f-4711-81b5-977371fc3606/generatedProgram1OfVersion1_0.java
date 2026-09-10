import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = str.length();
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = Math.max(dp[i - 1], 1 + dp[i - 2]);
            }
        }
        System.out.println(dp[n - 1]);
    }
}

// 