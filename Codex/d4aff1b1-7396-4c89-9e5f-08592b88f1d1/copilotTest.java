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
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(double initialBalance, double limit) {
        super(initialBalance);
        withdrawalLimit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal limit exceeded");
        }
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalFee;

    public CheckingAccount(double initialBalance, double fee) {
        super(initialBalance);
        withdrawalFee = fee;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= withdrawalFee;
    }
}

public class copilotTest {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 500);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Balance: " + savingsAccount.balance);

        CheckingAccount checkingAccount = new CheckingAccount(2000, 10);
        checkingAccount.withdraw(100);
        System.out.println("Checking Account Balance: " + checkingAccount.balance);
    }
}
