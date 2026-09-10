import java.util.*;

public class MaxDistinctPrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the lower range limit: ");
        int lowerLimit = scanner.nextInt();
        
        System.out.print("Enter the upper range limit: ");
        int upperLimit = scanner.nextInt();
        
        int maxDistinctPrimeFactors = 0;
        int numberWithMaxDistinctPrimeFactors = 0;
        
        for (int i = lowerLimit; i <= upperLimit; i++) {
            int distinctPrimeFactors = getDistinctPrimeFactors(i);
            
            if (distinctPrimeFactors > maxDistinctPrimeFactors) {
                maxDistinctPrimeFactors = distinctPrimeFactors;
                numberWithMaxDistinctPrimeFactors = i;
            }
        }
        
        System.out.println("Number with the maximum number of distinct prime factors: " + numberWithMaxDistinctPrimeFactors);
    }
    
    private static int getDistinctPrimeFactors(int number) {
        Set<Integer> primeFactors = new HashSet<>();
        
        while (number % 2 == 0) {
            primeFactors.add(2);
            number /= 2;
        }
        
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }
        
        if (number > 2) {
            primeFactors.add(number);
        }
        
        return primeFactors.size();
    }
}
