import java.util.ArrayList;
import java.util.List;

public class NarcissisticNumbers {

    public static void main(String[] args) {
        List<Integer> narcissisticNumbers = findNarcissisticNumbers(1, 1000);
        System.out.println("The narcissistic numbers between 1 and 1000 are: " + narcissisticNumbers);
    }

    public static List<Integer> findNarcissisticNumbers(int start, int end) {
        List<Integer> narcissisticNumbers = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            int sum = 0;
            int numDigits = (int) Math.floor(Math.log10(i)) + 1;

            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, numDigits);
                temp /= 10;
            }

            if (sum == i) {
                narcissisticNumbers.add(i);
            }
        }

        return narcissisticNumbers;
    }
}
