import java.util.Scanner;

public class DuckNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid input: number must be non-negative");
            return;
        }

        boolean isDuckNumber = false;
        while (number > 0) {
            if (number % 10 == 0) {
                isDuckNumber = true;
            }
            number /= 10;
        }

        if (isDuckNumber) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not a duck number");
        }
    }
}
