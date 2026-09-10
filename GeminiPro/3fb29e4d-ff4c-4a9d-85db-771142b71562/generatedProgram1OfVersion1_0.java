import java.util.*;

public class MaxDistinctPrimeFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the range from the user
        System.out.println("Enter the starting number of the range:");
        int start = scanner.nextInt();

        System.out.println("Enter the ending number of the range:");
        int end = scanner.nextInt();

        // Find the number with the maximum number of distinct prime factors
        int maxCount = 0;
        int maxNumber = 0;
        for (int i = start; i <= end; i++) {
            int count = countDistinctPrimeFactors(i);
            if (count > maxCount) {
                maxCount = count;
                maxNumber = i;
            }
        }

        // Print the result
        System.out.println("The number with the maximum number of distinct prime factors is: " + maxNumber);
        System.out.println("Number of distinct prime factors: " + maxCount);
    }

    public static int countDistinctPrimeFactors(int number) {
        int count = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }
        }
        return count;
    }
}
