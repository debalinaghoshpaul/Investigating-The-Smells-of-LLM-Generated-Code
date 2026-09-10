import java.util.*;

public class HappyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (isHappy(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }

    public static boolean isHappy(int number) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (number != 1) {
            int sumOfSquares = 0;
            while (number > 0) {
                int digit = number % 10;
                sumOfSquares += digit * digit;
                number /= 10;
            }

            if (seenNumbers.contains(sumOfSquares)) {
                return false;
            }

            seenNumbers.add(sumOfSquares);
            number = sumOfSquares;
        }

        return true;
    }
}
