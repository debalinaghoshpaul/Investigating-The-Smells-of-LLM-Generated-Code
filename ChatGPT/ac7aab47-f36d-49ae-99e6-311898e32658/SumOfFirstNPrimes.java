
public class SumOfFirstNPrimes {

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

    public static int sumOfFirstNPrimes(int n) {
        int count = 0;
        int sum = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = sumOfFirstNPrimes(n);
        System.out.println("Sum of the first " + n + " prime numbers is: " + sum);

        scanner.close();
    }
}
