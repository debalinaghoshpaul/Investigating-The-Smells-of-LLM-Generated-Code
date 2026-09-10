import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        int number = 36;
        List<Integer> primeFactors = getPrimeFactors(number);
        
        System.out.println("Prime factors of " + number + ":");
        for (int factor : primeFactors) {
            System.out.println(factor);
        }
    }
    
    public static List<Integer> getPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        
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
        
        return primeFactors;
    }
}
