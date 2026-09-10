import java.util.Scanner;

public class NaturalNumbersAndSum {

    public static void main(String[] args) {
        // Get the input from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = scanner.nextInt();
        scanner.close();

        // Calculate the sum of the first n natural numbers.
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Display the first n natural numbers and their sum.
        System.out.println("The first " + n + " natural numbers are : ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("The Sum of Natural Number upto " + n + " terms : " + sum);
    }
}
