import java.util.ArrayList;
import java.util.List;

public class LychrelNumbers {

    public static void main(String[] args) {
        // Find the number of seed Lychrel number candidates and related numbers for n in the range 1..10000 inclusive.
        int count = 0;
        List<Integer> seedLychrelNumbers = new ArrayList<>();
        List<Integer> lychrelRelatedNumbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            if (isLychrelNumber(i)) {
                count++;
                seedLychrelNumbers.add(i);
                lychrelRelatedNumbers.addAll(findLychrelRelatedNumbers(i));
            }
        }

        // Print the results.
        System.out.println(count + " Lychrel seeds: " + seedLychrelNumbers);
        System.out.println(lychrelRelatedNumbers.size() + " Lychrel related " + count + " Lychrel palindromes: " + lychrelRelatedNumbers);
    }

    /**
     * Determines if the given number is a Lychrel number.
     *
     * @param n The number to check.
     * @return True if the number is a Lychrel number, false otherwise.
     */
    public static boolean isLychrelNumber(int n) {
        // Set the iteration limit to 500.
        int iterationLimit = 500;

        // Iterate until the number becomes a palindrome or the iteration limit is reached.
        while (iterationLimit > 0) {
            // Reverse the number.
            int reversedNumber = reverseNumber(n);

            // Add the number and its reverse.
            n += reversedNumber;

            // Check if the number is a palindrome.
            if (n == reversedNumber) {
                return false;
            }

            // Decrement the iteration limit.
            iterationLimit--;
        }

        // The number is a Lychrel number.
        return true;
    }

    /**
     * Reverses the given number.
     *
     * @param n The number to reverse.
     * @return The reversed number.
     */
    public static int reverseNumber(int n) {
        int reversedNumber = 0;
        while (n > 0) {
            reversedNumber = reversedNumber * 10 + n % 10;
            n /= 10;
        }
        return reversedNumber;
    }

    /**
     * Finds all of the Lychrel related numbers for the given seed Lychrel number.
     *
     * @param seedLychrelNumber The seed Lychrel number.
     * @return A list of all of the Lychrel related numbers for the given seed Lychrel number.
     */
    public static List<Integer> findLychrelRelatedNumbers(int seedLychrelNumber) {
        // Create a list to store the Lychrel related numbers.
        List<Integer> lychrelRelatedNumbers = new ArrayList<>();

        // Iterate over all of the numbers from the seed Lychrel number to 10000.
        for (int i = seedLychrelNumber; i <= 10000; i++) {
            // Check if the number is a Lychrel number.
            if (isLychrelNumber(i)) {
                // Add the number to the list of Lychrel related numbers.
                lychrelRelatedNumbers.add(i);
            }
        }

        // Return the list of Lychrel related numbers.
        return lychrelRelatedNumbers;
    }

}
