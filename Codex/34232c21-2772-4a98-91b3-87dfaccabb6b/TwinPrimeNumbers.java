public class TwinPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Twin Prime Numbers less than 100:");
        findTwinPrimes(100);
    }

    public static void findTwinPrimes(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

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
