import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the investment amount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.print("Input the rate of interest: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Input number of years: ");
        int numberOfYears = scanner.nextInt();

        double futureValue = calculateFutureValue(investmentAmount, interestRate, numberOfYears);
        System.out.println("Future investment value: " + futureValue);

        scanner.close();
    }

    public static double calculateFutureValue(double investmentAmount, double interestRate, int numberOfYears) {
        double monthlyInterestRate = interestRate / 12 / 100;
        int numberOfMonths = numberOfYears * 12;

        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);
        return futureValue;
    }
}