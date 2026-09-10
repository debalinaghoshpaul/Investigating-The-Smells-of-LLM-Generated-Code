import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Getters and setters for account details

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. New balance: " + balance);
    }

    // Method to withdraw money from the account

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to add an account to the bank

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    // Method to remove an account from the bank

    public void removeAccount(Account account) {
        accounts.remove(account);
        System.out.println("Account removed successfully.");
    }

    // Other methods to perform operations on accounts

    // ...

}

public class Main {
    public static void main(String[] args) {
        // Create a bank object
        Bank bank = new Bank();

        // Create some accounts
        Account account1 = new Account("A001", "John Doe", 1000.0);
        Account account2 = new Account("A002", "Jane Smith", 2000.0);

        // Add accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);

        // Perform operations on accounts
        account1.deposit(500.0);
        account2.withdraw(1000.0);

        // Remove an account from the bank
        bank.removeAccount(account1);
    }
}
