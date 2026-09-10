public class Money {
    private int dollars;
    private int cents;
    
    // Constructors
    public Money() {
        this.dollars = 0;
        this.cents = 0;
    }
    
    public Money(int dollars) {
        this.dollars = dollars;
        this.cents = 0;
    }
    
    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }
    
    // Accessor and Mutator methods
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
    
    // Method to add money
    public void add(Money m) {
        this.dollars += m.getDollars();
        this.cents += m.getCents();
        if (this.cents >= 100) {
            this.dollars += this.cents / 100;
            this.cents = this.cents % 100;
        }
    }
    
    // Method to subtract money
    public void minus(Money m) {
        this.dollars -= m.getDollars();
        this.cents -= m.getCents();
        if (this.cents < 0) {
            this.dollars--;
            this.cents += 100;
        }
    }
    
    // Method to check if two Money objects are equal
    public boolean equals(Money m) {
        return (this.dollars == m.getDollars() && this.cents == m.getCents());
    }
    
    // toString method to print the amount of money
    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" : "") + cents;
    }
    
    public static void main(String[] args) {
        Money m1 = new Money(10, 50);
        Money m2 = new Money(5, 25);
        
        System.out.println("Initial values:");
        System.out.println("m1: " + m1);
        System.out.println("m2: " + m2);
        
        m1.add(m2);
        
        System.out.println("\nValues after adding m2 to m1:");
        System.out.println("m1: " + m1);
        System.out.println("m2: " + m2);
        
        m2.minus(new Money(2, 75));
        
        System.out.println("\nValues after subtracting $2.75 from m2:");
        System.out.println("m1: " + m1);
        System.out.println("m2: " + m2);
    }
}
