import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance;
    private Lock lock;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    public void deposit(int amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println("Deposit: " + amount + ", Current Balance: " + balance);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(int amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal: " + amount + ", Current Balance: " + balance);
            } else {
                System.out.println("Insufficient funds for withdrawal: " + amount);
            }
        } finally {
            lock.unlock();
        }
    }
}

public class BankAccountThreads {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100);
            }
        });

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(200);
            }
        });

        depositThread.start();
        withdrawThread.start();
    }
}
