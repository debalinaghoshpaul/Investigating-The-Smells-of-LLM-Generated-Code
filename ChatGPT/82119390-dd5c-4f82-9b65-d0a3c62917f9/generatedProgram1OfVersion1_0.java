// Abstract class BankAccount
abstract class BankAccount {
    protected double balance;
    
    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

// SavingsAccount class extending BankAccount
class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// CurrentAccount class extending BankAccount
class CurrentAccount extends BankAccount {

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Savings Account
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(2000);

        // Creating Current Account
        CurrentAccount currentAccount = new CurrentAccount(2000);
        currentAccount.deposit(1000);
        currentAccount.withdraw(3000);
    }
}
