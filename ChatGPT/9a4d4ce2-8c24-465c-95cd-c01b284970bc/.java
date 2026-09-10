    private int dollars;
    private int cents;

    public Money() {
        this.dollars = 0;
        this.cents = 0;
    }

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money(int dollars) {
        this.dollars = dollars;
        this.cents = 0;
    }

    public static Money add(Money m1, Money m2) {
        int totalCents = m1.cents + m2.cents;
        int extraDollars = totalCents / 100;
        int totalDollars = m1.dollars + m2.dollars + extraDollars;
        int remainingCents = totalCents % 100;

        return new Money(totalDollars, remainingCents);
    }

    public static Money minus(Money m1, Money m2) {
        int totalCents1 = m1.dollars * 100 + m1.cents;
        int totalCents2 = m2.dollars * 100 + m2.cents;
        
        if (totalCents1 < totalCents2) {
            System.out.println("Error: Cannot subtract larger amount from a smaller one");
            return new Money();
        }
        
        int diffCents = totalCents1 - totalCents2;
        int diffDollars = diffCents / 100;
        int remainingCents = diffCents % 100;
        
        return new Money(diffDollars, remainingCents);
    }

    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    public boolean equals(Money m) {
        return this.dollars == m.dollars && this.cents == m.cents;
    }

    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }

    public static void main(String[] args) {
        Money m1 = new Money(5, 75);
        Money m2 = new Money(3, 50);

        Money sum = Money.add(m1, m2);
        Money difference = Money.minus(m1, m2);

        System.out.println("m1: " + m1);
        System.out.println("m2: " + m2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
