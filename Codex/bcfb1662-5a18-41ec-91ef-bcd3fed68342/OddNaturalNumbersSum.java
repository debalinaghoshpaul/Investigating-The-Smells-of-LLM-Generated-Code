import java.util.Scanner;

public class OddNaturalNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        System.out.println("The odd numbers are:");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int oddNumber = 2 * i - 1;
            System.out.println(oddNumber);
            sum += oddNumber;
        }
        
        System.out.println("The sum of odd natural numbers up to " + n + " terms is: " + sum);
    }
}
