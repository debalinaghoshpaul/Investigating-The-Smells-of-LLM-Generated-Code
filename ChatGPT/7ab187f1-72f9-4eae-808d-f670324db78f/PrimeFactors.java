import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("The prime factors of " + number + " are: ");
        for (int i = 2; i <= number / 2; i++) {
            while (number % i == 0) {
                System.out.println(i);
                number /= i;
            }
        }

        if (number > 1) {
            System.out.println(number);
        }
    }
}
