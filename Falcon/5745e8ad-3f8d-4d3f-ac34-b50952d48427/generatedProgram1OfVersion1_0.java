import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        Set<Integer> seen = new HashSet<>();

        while (count < 10) {
            if (isHappy(number, seen)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    private static boolean isHappy(int number, Set<Integer> seen) {
        if (number == 1) {
            return true;
        }

        if (seen.contains(number)) {
            return false;
        }

        seen.add(number);

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }

        return isHappy(sum, seen);
    }
}
