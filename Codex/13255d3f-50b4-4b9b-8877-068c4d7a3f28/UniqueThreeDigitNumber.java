import java.util.HashSet;
import java.util.Set;

public class UniqueThreeDigitNumber {

    public static void main(String[] args) {
        Set<Integer> uniqueThreeDigitNumbers = new HashSet<>();
        int count = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && j != k && k != i) {
                        int threeDigitNumber = i * 100 + j * 10 + k;
                        uniqueThreeDigitNumbers.add(threeDigitNumber);
                        count++;
                    }
                }
            }
        }

        for (int threeDigitNumber : uniqueThreeDigitNumbers) {
            System.out.println(threeDigitNumber);
        }

        System.out.println("Total number of the three-digit-number is " + count);
    }
}
