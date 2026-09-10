public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    public Rational(int wholeNumber) {
        this.numerator = wholeNumber;
        this.denominator = 1;
    }

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

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

    private void normalize() {
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    public boolean equals(Rational other) {
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);

        Rational sum = Rational.add(r1, r2);
        System.out.println("Sum: " + sum.toString());

        Rational difference = Rational.subtract(r1, r2);
        System.out.println("Difference: " + difference.toString());

        Rational product = Rational.multiply(r1, r2);
        System.out.println("Product: " + product.toString());

        Rational quotient = Rational.divide(r1, r2);
        System.out.println("Quotient: " + quotient.toString());
    }
}
