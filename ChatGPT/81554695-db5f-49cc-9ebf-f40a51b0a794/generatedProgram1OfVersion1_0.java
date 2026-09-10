public class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money(int dollars) {
        this(dollars, 0);
    }

    public Money() {
        this(0, 0);
    }

    public Money add(Money money) {
        int totalCents = this.dollars * 100 + this.cents + money.dollars * 100 + money.cents;
        int newDollars = totalCents / 100;
        int newCents = totalCents % 100;
        return new Money(newDollars, newCents);
    }

    public Money minus(Money money) {
        int totalCents = this.dollars * 100 + this.cents - money.dollars * 100 - money.cents;
        int newDollars = totalCents / 100;
        int newCents = totalCents % 100;
        return new Money(newDollars, newCents);
    }

    public boolean equals(Money money) {
        return (this.dollars == money.dollars && this.cents == money.cents);
    }

    public String toString() {
        return "$" + this.dollars + "." + String.format("%02d", this.cents);
    }

    public Money add(Money money1, Money money2) {
        return money1.add(money2);
    }

    public Money minus(Money money1, Money money2) {
        return money1.minus(money2);
    }

    public static void main(String[] args) {
        Money money1 = new Money(10, 50);
        Money money2 = new Money(5, 25);

        Money resultAdd = money1.add(money2);
        Money resultMinus = money1.minus(money2);

        System.out.println("Money 1: " + money1);
        System.out.println("Money 2: " + money2);
        System.out.println("Money 1 + Money 2: " + resultAdd);
        System.out.println("Money 1 - Money 2: " + resultMinus);

        System.out.println("Using static add method: " + money1.add(money1, money2));
        System.out.println("Using static minus method: " + money1.minus(money1, money2));
    }
}
