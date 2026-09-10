import java.util.Scanner;

public class DivisibleRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input values
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int p = scanner.nextInt();

        // Calculate the number of integers in the range x..y that are divisible by p
        int count = 0;
        for (int i = x; i <= y; i++) {
            if (i % p == 0) {
                count++;
            }
        }

        // Print the result
        System.out.println(count);
    }
}
