// BankAccount.java
// BankAccount Class

class BankAccount {
  private String accountNumber;
  private double balance;

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}

// Main.java
// Main Class

public class Main {
  public static void main(String[] args) {
    // Create an instance of BankAccount
    BankAccount account = new BankAccount();

    // Set values using setter methods
    account.setAccountNumber("SB-09876");
    account.setBalance(2000.0);

    // Get values using getter methods
    String accountNumber = account.getAccountNumber();
    double balance = account.getBalance();

    // Print the values
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Balance: " + balance);
  }
}
