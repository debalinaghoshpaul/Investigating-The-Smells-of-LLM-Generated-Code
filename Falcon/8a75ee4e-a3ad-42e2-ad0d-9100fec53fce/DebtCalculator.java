import java.util.*;

public class DebtCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the loan amount
        System.out.println("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        // Get the number of months
        System.out.println("Enter the number of months: ");
        int numMonths = scanner.nextInt();

        // Initialize the debt amount
        double debtAmount = loanAmount;

        // Calculate the debt amount for each month
        for (int i = 1; i <= numMonths; i++) {
            // Add 4% interest to the debt amount
            debtAmount += (debtAmount * 0.04);
            
            // Round the debt amount to the nearest 1000
            debtAmount = Math.round(debtAmount / 1000.0) * 1000.0;
            
            // Print the debt amount for each month
            System.out.println("Month " + i + ": $" + debtAmount);
        }
    }
}
