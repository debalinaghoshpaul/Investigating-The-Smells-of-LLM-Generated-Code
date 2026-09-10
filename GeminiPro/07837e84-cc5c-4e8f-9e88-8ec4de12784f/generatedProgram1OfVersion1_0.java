import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input integer
        int n = scanner.nextInt();

        // Check if the number is a power of two using bitwise AND operator
        boolean isPowerOfTwo = (n & (n - 1)) == 0;

        // Print the result
        System.out.println(isPowerOfTwo);
    }
}
