public class SavingsAccount {
    public static double calculateBalance(double initialDeposit, double interestRate, int numYears) {
        if (numYears == 0) {
            return initialDeposit;
        } else {
            double balance = calculateBalance(initialDeposit, interestRate, numYears - 1);
            return balance * (1 + interestRate);
        }
    }

    public static void main(String[] args) {
        double initialDeposit = 1000.0;
        double interestRate = 0.10;
        int numYears = 2;

        double finalBalance = calculateBalance(initialDeposit, interestRate, numYears);
        System.out.println("Final balance after " + numYears + " years: $" + finalBalance);
    }
}
