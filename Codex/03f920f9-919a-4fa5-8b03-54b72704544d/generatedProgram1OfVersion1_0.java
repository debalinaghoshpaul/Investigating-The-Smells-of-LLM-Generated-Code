import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than ten billion: ");
        long number = scanner.nextLong();
        scanner.close();

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits in the number: " + count);
    }
}