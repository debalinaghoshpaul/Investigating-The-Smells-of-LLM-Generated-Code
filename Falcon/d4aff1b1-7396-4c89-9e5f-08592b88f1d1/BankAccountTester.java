// Base class BankAccount
class BankAccount {
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private double withdrawalLimit;  // Maximum amount that can be withdrawn per transaction
    private double withdrawalFee;   // Fee charged for each withdrawal

    public SavingsAccount(double balance, double withdrawalLimit, double withdrawalFee) {
        super(balance);
        this.withdrawalLimit = withdrawalLimit;
        this.withdrawalFee = withdrawalFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit) {
            super.withdraw(amount + withdrawalFee);  // Charge withdrawal fee
        } else {
            System.out.println("Withdrawal amount exceeds the withdrawal limit.");
        }
    }
}

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    private double overdraftLimit;  // Maximum amount that can be overdrawn from the account
    private double overdraftFee;   // Fee charged for overdrawing the account

    public CheckingAccount(double balance, double overdraftLimit, double overdraftFee) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
        this.overdraftFee = overdraftFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            super.withdraw(amount);
        } else if (amount <= balance + overdraftLimit) {
            super.withdraw(amount + overdraftFee);  // Charge overdraft fee
        } else {
            System.out.println("Withdrawal amount exceeds the overdraft limit.");
        }
    }
}

// Test cases
public class BankAccountTester {

    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 500.0, 2.0);

        // Test deposit and withdraw methods
        savingsAccount.deposit(500.0);
        System.out.println("Savings Account Balance after deposit: " + savingsAccount.getBalance());  // Expected: 1500.0
        savingsAccount.withdraw(200.0);
        System.out.println("Savings Account Balance after withdrawal within limit: " + savingsAccount.getBalance());  // Expected: 1298.0
        savingsAccount.withdraw(600.0);
        System.out.println("Savings Account Balance after withdrawal exceeding limit: " + savingsAccount.getBalance());  // Expected: 1298.0

        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount(1000.0, 500.0, 10.0);

        // Test deposit and withdraw methods
        checkingAccount.deposit(500.0);
        System.out.println("Checking Account Balance after deposit: " + checkingAccount.getBalance());  // Expected: 1500.0
        checkingAccount.withdraw(200.0);
        System.out.println("Checking Account Balance after withdrawal within limit: " + checkingAccount.getBalance());  // Expected: 1300.0
        checkingAccount.withdraw(600.0);
        System.out.println("Checking Account Balance after withdrawal exceeding limit: " + checkingAccount.getBalance());  // Expected: 1210.0

        // Corner cases
        savingsAccount.withdraw(0.0);  // Withdrawal amount of 0
        checkingAccount.withdraw(0.0);  // Withdrawal amount of 0
        SavingsAccount savingsAccount2 = new SavingsAccount(-100.0, 500.0, 2.0);  // Negative initial balance
        CheckingAccount checkingAccount2 = new CheckingAccount(-100.0, 500.0, 10.0);  // Negative initial balance
    }
}
