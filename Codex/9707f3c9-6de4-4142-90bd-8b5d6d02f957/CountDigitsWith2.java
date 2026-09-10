import java.util.Scanner;

public class CountDigitsWith2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        int number = input.nextInt();

        int count = 0;
        while (number > 0) {
            if (number % 10 == 2) {
                count++;
            }
            number /= 10;
        }

        System.out.println("The number of digits with the value 2 is: " + count);
    }
}
