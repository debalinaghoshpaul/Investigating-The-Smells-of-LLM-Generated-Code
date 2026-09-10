// Java program to print odd numbers from 1 to 99

public class PrintOddNumbers {

    public static void main(String[] args) {
        // Iterate over numbers from 1 to 99
        for (int i = 1; i <= 99; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                // Print the number
                System.out.println(i);
            }
        }
    }
}
