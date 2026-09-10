import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
            System.out.println("The number is a perfect square.");
        } else {
            System.out.println("The number is not a perfect square.");
        }
    }
}
// 