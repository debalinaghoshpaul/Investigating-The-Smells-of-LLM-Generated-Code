public class PrimeNumberCounter {
    public static void main(String[] args) {
        int limit = 100; // Change this to your desired positive number

        int count = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("The number of prime numbers less than " + limit + " is: " + count);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
