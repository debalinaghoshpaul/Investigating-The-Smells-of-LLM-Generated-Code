
public class GoldbachNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input of even number from user
        System.out.print("Enter an even number (greater than or equal to 4 and less than or equal to 50000): ");
        int n = sc.nextInt();

        if (n < 4 || n % 2 != 0 || n > 50000) {
            System.out.println("Invalid input. Please enter a valid even number.");
        } else {
            int count = findGoldbachPartitions(n);
            System.out.println("Number of Goldbach partitions for " + n + " are: " + count);
        }

        sc.close();
    }

    // Function to find Goldbach Partitions for a given even number
    public static int findGoldbachPartitions(int n) {
        int count = 0;

        for (int i = 2; i <= n/2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(i + " + " + (n - i));
                count++;
            }
        }

        return count;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
} 

In this program, we first take an even number input from the user within the specified range. Then, we check if the input is a valid even number. If it is a valid even number, we call the findGoldbachPartitions() method to find the Goldbach partitions for the given number.

The findGoldbachPartitions() method iterates through numbers from 2 to n/2 and checks if both the number and its complement (n - number) are prime numbers. If they are prime numbers, it prints the Goldbach partition and increments the count.

The isPrime() method is used to check if a given number is prime or not.

Finally, the program prints the total number of Goldbach partitions for the given even number.
