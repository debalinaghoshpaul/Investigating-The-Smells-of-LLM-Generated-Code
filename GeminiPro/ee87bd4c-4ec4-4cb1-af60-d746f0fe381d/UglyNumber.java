import java.util.Scanner;

public class UglyNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int number = input.nextInt();

        if (isUgly(number)) {
            System.out.println(number + " is an ugly number.");
        } else {
            System.out.println(number + " is not an ugly number.");
        }
    }

    public static boolean isUgly(int number) {
        if (number <= 0) {
            return false;
        }

        while (number % 2 == 0) {
            number /= 2;
        }
        while (number % 3 == 0) {
            number /= 3;
        }
        while (number % 5 == 0) {
            number /= 5;
        }

        return number == 1;
    }
}
