import java.util.Scanner;

public class StringInterleave {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input strings.
        System.out.println("Enter the first string: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = scanner.nextLine();
        System.out.println("Enter the interleave string: ");
        String s3 = scanner.nextLine();

        // Check if the strings interleave.
        boolean interleaved = isInterleave(s1, s2, s3);

        // Print the result.
        if (interleaved) {
            System.out.println("The strings interleave.");
        } else {
            System.out.println("The strings do not interleave.");
        }
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        // Check if the lengths of the strings are valid.
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        // Create a 2D array to store the results of the interleave check.
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];

        // Initialize the first row and column of the DP array.
        dp[0][0] = true;
        for (int i = 1; i <= s1.length(); i++) {
            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        }
        for (int j = 1; j <= s2.length(); j++) {
            dp[0][j] = dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }

        // Fill in the rest of the DP array.
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }

        // Return the result of the interleave check.
        return dp[s1.length()][s2.length()];
    }
}
