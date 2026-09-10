class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

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

class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 100.0;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance should be maintained.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount(500.0);
        account.deposit(200.0);
        account.withdraw(300.0);
        System.out.println("Balance: " + account.getBalance());
    }
}