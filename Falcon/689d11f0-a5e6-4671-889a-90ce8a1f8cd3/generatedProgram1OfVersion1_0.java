import java.util.Scanner;

public class PrimeNumberPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }
        System.out.println("The position of the prime number is: " + count);
    }
}

// 