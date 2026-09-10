import java.util.Scanner;

public class FutureInvestmentValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input from the user
        System.out.println("Input the investment amount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.println("Input the rate of interest: ");
        double interestRate = scanner.nextDouble();

        System.out.println("Input number of years: ");
        int years = scanner.nextInt();

        // Calculate the future investment value
        double futureValue = calculateFutureValue(investmentAmount, interestRate, years);

        // Print the output
        System.out.println("The future investment value is: " + futureValue);
    }

    public static double calculateFutureValue(double investmentAmount, double interestRate, int years) {
        // Convert the interest rate to a monthly rate
        double monthlyInterestRate = interestRate / 12 / 100;

        // Calculate the future value
        double futureValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);

        return futureValue;
    }
}
