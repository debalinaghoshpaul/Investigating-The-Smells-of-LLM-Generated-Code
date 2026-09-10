import java.util.Scanner;

public class FourSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int n = scanner.nextInt();

        // Initialize the count of combinations to 0
        int count = 0;

        // Iterate over all possible values of a, b, c, and d
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 0; d <= 9; d++) {
                        // Check if the sum of a, b, c, and d equals n
                        if (a + b + c + d == n) {
                            // Increment the count of combinations
                            count++;
                        }
                    }
                }
            }
        }

        // Print the count of combinations
        System.out.println(count);
    }
}
