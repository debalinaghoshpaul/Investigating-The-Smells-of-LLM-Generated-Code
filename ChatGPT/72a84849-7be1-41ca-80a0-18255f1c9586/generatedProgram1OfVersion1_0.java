import java.util.Scanner;

public class DivisibleBy3And5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the upper limit from the user
        System.out.println("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        // Print the numbers divisible by 3
        System.out.println("Numbers divisible by 3: ");
        for (int i = 1; i <= upperLimit; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        // Print the numbers divisible by 5
        System.out.println("\nNumbers divisible by 5: ");
        for (int i = 1; i <= upperLimit; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        // Print the numbers divisible by both 3 and 5
        System.out.println("\nNumbers divisible by both 3 and 5: ");
        for (int i = 1; i <= upperLimit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
