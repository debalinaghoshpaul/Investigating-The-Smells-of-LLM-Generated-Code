import java.util.stream.IntStream;

public class PrimeNumberSum {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        
        int sum = IntStream.rangeClosed(start, end)
                .filter(PrimeNumberSum::isPrime)
                .sum();
        
        System.out.println("Sum of prime numbers between " + start + " and " + end + " is: " + sum);
    }
    
    public static boolean isPrime(int number) {
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
