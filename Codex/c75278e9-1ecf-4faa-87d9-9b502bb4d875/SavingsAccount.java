public class SavingsAccount {
    public static double calculateAmount(double principal, double interestRate, int years) {
        // Base case: if there are no more years left, return the principal amount
        if (years == 0) {
            return principal;
        }
        
        // Recursive case: calculate the amount after one year and recursively call the function for the remaining years
        double amountAfterOneYear = principal * (1 + interestRate);
        return calculateAmount(amountAfterOneYear, interestRate, years - 1);
    }
    
    public static void main(String[] args) {
        double principal = 1000; // initial amount saved
        double interestRate = 0.1; // interest rate per year (10%)
        int years = 3; // number of years
        
        double amount = calculateAmount(principal, interestRate, years);
        System.out.println("Amount after " + years + " years: $" + amount);
    }
}
