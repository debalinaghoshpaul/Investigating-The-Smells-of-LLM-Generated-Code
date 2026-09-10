import java.util.ArrayList;
import java.util.List;

// Bank class
class Bank {
    private List<Account> accounts;

    // Constructor
    public Bank() {
        this.accounts = new ArrayList<>();
    }

    // Add account to the bank
    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}

// Account Interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

// Savings Account Class
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    // Constructor
    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
    }

    @Override
    public double calculateInterest() {
        return this.balance * this.interestRate;
    }

    @Override
    public double viewBalance() {
        return this.balance;
    }
}

// Current Account Class
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else if (amount <= this.balance + this.overdraftLimit) {
            this.balance -= amount;
            this.overdraftLimit -= amount - this.balance;
        }
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public double viewBalance() {
        return this.balance;
    }
}

// Test cases
public class BankSystemTest {

    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank();

        // Create accounts
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500, 1000);

        // Add accounts to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Deposit and withdraw money from the accounts
        savingsAccount.deposit(500);
        currentAccount.withdraw(300);

        // Calculate interest for the savings account
        double savingsAccountInterest = savingsAccount.calculateInterest();

        // View balances
        double savingsAccountBalance = savingsAccount.viewBalance();
        double currentAccountBalance = currentAccount.viewBalance();

        // Print the results
        System.out.println("Savings Account Balance: " + savingsAccountBalance);
        System.out.println("Savings Account Interest: " + savingsAccountInterest);
        System.out.println("Current Account Balance: " + currentAccountBalance);
    }
}
