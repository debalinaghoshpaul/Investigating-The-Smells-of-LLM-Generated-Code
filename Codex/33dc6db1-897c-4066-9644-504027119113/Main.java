abstract class Payment {
    public abstract String getDescription();
}

class CreditCard extends Payment {
    private String cardNumber;
    private String expirationDate;

    public CreditCard(String cardNumber, String expirationDate) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    public String getDescription() {
        return "Credit Card: " + cardNumber + ", Expiration Date: " + expirationDate;
    }
}

class Cash extends Payment {
    private double amount;

    public Cash(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return "Cash: $" + amount;
    }
}

class Check extends Payment {
    private String checkNumber;

    public Check(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getDescription() {
        return "Check: " + checkNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCard("1234567890", "12/23");
        Payment cash = new Cash(50.0);
        Payment check = new Check("987654321");

        System.out.println(creditCard.getDescription());
        System.out.println(cash.getDescription());
        System.out.println(check.getDescription());
    }
}
