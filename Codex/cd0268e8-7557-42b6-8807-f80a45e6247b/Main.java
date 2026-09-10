import java.util.ArrayList;
import java.util.List;

// Account interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

// SavingsAccount class implementing Account interface
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void calculateInterest() {
        balance += balance * interestRate;
    }

    @Override
    public void viewBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }

    public void transferToCurrent(double amount, CurrentAccount currentAccount) {
        if(balance >= amount) {
            balance -= amount;
            currentAccount.deposit(amount);
        } else {
            System.out.println("Insufficient funds in Savings Account");
        }
    }
}

// CurrentAccount class implementing Account interface
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Exceeded overdraft limit");
        }
    }

    @Override
    public void calculateInterest() {
        // Current Account does not earn interest
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Account Balance: " + balance);
    }
}

// Bank class
class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

// Main class to test the banking system
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500, 1000);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        savingsAccount.deposit(200);
        savingsAccount.calculateInterest();
        savingsAccount.viewBalance();

        currentAccount.withdraw(700);
        currentAccount.viewBalance();

        savingsAccount.transferToCurrent(300, currentAccount);

        currentAccount.viewBalance();
    }
}
