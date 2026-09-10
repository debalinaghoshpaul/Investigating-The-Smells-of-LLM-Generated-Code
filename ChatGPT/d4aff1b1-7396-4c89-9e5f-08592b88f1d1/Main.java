//BankAccount.java
class BankAccount {
  private double balance;

  public BankAccount(double initialBalance) {
    this.balance = initialBalance;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("Insufficient funds.");
    }
  }
}
//SavingsAccount.java

class SavingsAccount extends BankAccount {
  private double withdrawalLimit;

  public SavingsAccount(double initialBalance, double withdrawalLimit) {
    super(initialBalance);
    this.withdrawalLimit = withdrawalLimit;
  }

  @Override
  public void withdraw(double amount) {
    if (amount <= withdrawalLimit) {
      super.withdraw(amount);
    } else {
      System.out.println("Withdrawal limit exceeded.");
    }
  }
}
//CheckingAccount.java
class CheckingAccount extends BankAccount {
  private double overdraftFee;

  public CheckingAccount(double initialBalance, double overdraftFee) {
    super(initialBalance);
    this.overdraftFee = overdraftFee;
  }

  @Override
  public void withdraw(double amount) {
    if (amount <= getBalance()) {
      super.withdraw(amount);
    } else {
      System.out.println("Overdraft fee applied.");
      super.withdraw(amount + overdraftFee);
    }
  }
}
//Main.java
public class Main {
  public static void main(String[] args) {
    BankAccount savingsAccount = new SavingsAccount(2000, 650);
    BankAccount checkingAccount = new CheckingAccount(1000, 100);

    withdrawFromAccount(savingsAccount, 300);
    withdrawFromAccount(checkingAccount, 250);

    System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
    System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
  }

  public static void withdrawFromAccount(BankAccount account, double amount) {
    account.withdraw(amount);
  }
}
