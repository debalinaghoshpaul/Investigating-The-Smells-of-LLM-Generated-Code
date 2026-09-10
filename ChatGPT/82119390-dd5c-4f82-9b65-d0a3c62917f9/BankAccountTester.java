import java.util.Scanner;

// Abstract class BankAccount with abstract methods deposit() and withdraw()
abstract class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

// Subclass SavingsAccount that extends the BankAccount class
class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in your account.");
        }
    }
}

// Subclass CurrentAccount that extends the BankAccount class
class CurrentAccount extends BankAccount {
    double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("You have exceeded your overdraft limit.");
        } else {
            System.out.println("Insufficient funds in your account.");
        }
    }
}

// Main class to test the BankAccount, SavingsAccount, and CurrentAccount classes
public class BankAccountTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(123456, 1000.0, 0.05);

        // Create a CurrentAccount object
        CurrentAccount currentAccount = new CurrentAccount(654321, 2000.0, 500.0);

        // Deposit and withdraw money from the SavingsAccount
        System.out.println("Savings Account:");
        System.out.println("Current balance: $" + savingsAccount.getBalance());
        System.out.print("Enter the amount to deposit: $");
        double depositAmount = scanner.nextDouble();
        savingsAccount.deposit(depositAmount);
        System.out.println("New balance: $" + savingsAccount.getBalance());
        System.out.print("Enter the amount to withdraw: $");
        double withdrawAmount = scanner.nextDouble();
        savingsAccount.withdraw(withdrawAmount);
        System.out.println("New balance: $" + savingsAccount.getBalance());

        // Deposit and withdraw money from the CurrentAccount
        System.out.println("\nCurrent Account:");
        System.out.println("Current balance: $" + currentAccount.getBalance());
        System.out.print("Enter the amount to deposit: $");
        depositAmount = scanner.nextDouble();
        currentAccount.deposit(depositAmount);
        System.out.println("New balance: $" + currentAccount.getBalance());
        System.out.print("Enter the amount to withdraw: $");
        withdrawAmount = scanner.nextDouble();
        currentAccount.withdraw(withdrawAmount);
        System.out.println("New balance: $" + currentAccount.getBalance());

        // Test corner cases
        System.out.println("\nCorner cases:");
        System.out.println("Savings Account:");
        // Try to withdraw more money than the balance
        savingsAccount.withdraw(savingsAccount.getBalance() + 1);
        // Try to deposit a negative amount
        savingsAccount.deposit(-100.0);
        System.out.println("New balance: $" + savingsAccount.getBalance());
        System.out.println("Current Account:");
        // Try to withdraw more money than the balance and overdraft limit
        currentAccount.withdraw(currentAccount.getBalance() + currentAccount.overdraftLimit + 1);
        // Try to deposit a negative amount
        currentAccount.deposit(-200.0);
        System.out.println("New balance: $" + currentAccount.getBalance());
    }
}
