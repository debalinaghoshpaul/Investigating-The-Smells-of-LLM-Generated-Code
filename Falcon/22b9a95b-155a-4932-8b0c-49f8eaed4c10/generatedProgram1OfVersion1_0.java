// BankAccount.java
public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}

// SavingsAccount.java
public class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= this.getBalance() - 100) {
            super.withdraw(amount);
        }
    }
}

// Main.java
public class Main {

    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount bankAccount = new BankAccount(1000);

        // Deposit 500 into the BankAccount
        bankAccount.deposit(500);

        // Withdraw 300 from the BankAccount
        bankAccount.withdraw(300);

        // Get the balance of the BankAccount
        double bankAccountBalance = bankAccount.getBalance();

        // Print the balance of the BankAccount
        System.out.println("Bank Account Balance: " + bankAccountBalance); // Expected output: 1200

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(1000);

        // Deposit 500 into the SavingsAccount
        savingsAccount.deposit(500);

        // Withdraw 300 from the SavingsAccount
        savingsAccount.withdraw(300);

        // Get the balance of the SavingsAccount
        double savingsAccountBalance = savingsAccount.getBalance();

        // Print the balance of the SavingsAccount
        System.out.println("Savings Account Balance: " + savingsAccountBalance); // Expected output: 1200

        // Withdraw 700 from the SavingsAccount
        savingsAccount.withdraw(700);

        // Get the balance of the SavingsAccount
        savingsAccountBalance = savingsAccount.getBalance();

        // Print the balance of the SavingsAccount
        System.out.println("Savings Account Balance: " + savingsAccountBalance); // Expected output: 1200

        // Corner case: Withdraw more than the available balance
        savingsAccount.withdraw(1500);

        // Get the balance of the SavingsAccount
        savingsAccountBalance = savingsAccount.getBalance();

        // Print the balance of the SavingsAccount
        System.out.println("Savings Account Balance: " + savingsAccountBalance); // Expected output: 1200
    }
}
