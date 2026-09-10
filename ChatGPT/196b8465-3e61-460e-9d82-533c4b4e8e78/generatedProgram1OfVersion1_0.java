public class Rational {
    private int numerator;
    private int denominator;

    // Constructors
    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    public Rational(int wholeNumber) {
        numerator = wholeNumber;
        denominator = 1;
    }

    // Private method to normalize the sign of the rational number
    private void normalize() {
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
    }

    // Static methods for arithmetic operations
    public static Rational add(Rational r1, Rational r2) {
        int newNumerator = (r1.numerator * r2.denominator) + (r2.numerator * r1.denominator);
        int newDenominator = r1.denominator * r2.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public static Rational subtract(Rational r1, Rational r2) {
        int newNumerator = (r1.numerator * r2.denominator) - (r2.numerator * r1.denominator);
        int newDenominator = r1.denominator * r2.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public static Rational multiply(Rational r1, Rational r2) {
        int newNumerator = r1.numerator * r2.numerator;
        int newDenominator = r1.denominator * r2.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public static Rational divide(Rational r1, Rational r2) {
        int newNumerator = r1.numerator * r2.denominator;
        int newDenominator = r1.denominator * r2.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    // Accessor and mutator methods
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        normalize();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
        normalize();
    }

    // Method to check if two rational numbers are equal
    public boolean equals(Rational other) {
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    // toString method to represent the rational number as a string
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Non-static methods for arithmetic operations
    public void add(Rational other) {
        int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        normalize();
    }

    public void subtract(Rational other) {
        int newNumerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        normalize();
    }

    public void multiply(Rational other) {
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
        normalize();
    }

    public void divide(Rational other) {
        this.numerator *= other.denominator;
        this.denominator *= other.numerator;
        normalize();
    }

    // Test program
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(-3, 4);

        // Static method calls
        Rational result1 = Rational.add(r1, r2);
        System.out.println("Addition: " + result1.toString());

        Rational result2 = Rational.subtract(r1, r2);
        System.out.println("Subtraction: " + result2.toString());

        Rational result3 = Rational.multiply(r1, r2);
        System.out.println("Multiplication: " + result3.toString());

        Rational result4 = Rational.divide(r1, r2);
        System.out.println("Division: " + result4.toString());

        // Non-static method calls
        r1.add(r2);
        System.out.println("After adding r2 to r1: " + r1.toString());

        r1.subtract(r2);
        System.out.println("After subtracting r2 from r1: " + r1.toString());

        r1.multiply(r2);
        System.out.println("After multiplying r2 to r1: " + r1.toString());

        r1.divide(r2);
        System.out.println("After dividing r2 from r1: " + r1.toString());

        // Test equals method
        Rational r3 = new Rational(-2, 4);
        System.out.println("r1 equals to r3? " + r1.equals(r3));
    }
}
