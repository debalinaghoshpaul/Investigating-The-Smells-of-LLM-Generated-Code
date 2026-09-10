import java.util.Scanner;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void displayFraction() {
        System.out.println(this.numerator + " / " + this.denominator);
    }

    public boolean equals(Fraction other) {
        int gcd = gcd(this.numerator, this.denominator);
        int reducedNumerator = this.numerator / gcd;
        int reducedDenominator = this.denominator / gcd;

        gcd = gcd(other.numerator, other.denominator);
        int otherReducedNumerator = other.numerator / gcd;
        int otherReducedDenominator = other.denominator / gcd;

        return reducedNumerator == otherReducedNumerator && reducedDenominator == otherReducedDenominator;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numerator and denominator of the fraction:");
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();

        Fraction fraction = new Fraction(numerator, denominator);

        boolean continueProgram = true;
        while (continueProgram) {
            System.out.println("Enter the numerator and denominator of the target fraction:");
            int targetNumerator = scanner.nextInt();
            int targetDenominator = scanner.nextInt();
            Fraction targetFraction = new Fraction(targetNumerator, targetDenominator);

            if (fraction.equals(targetFraction)) {
                System.out.println("Fractions are identical.");
            } else {
                System.out.println("Fractions are not identical.");
            }

            System.out.println("Do you want to continue? (yes/no)");
            String choice = scanner.next();

            if (choice.equals("no")) {
                continueProgram = false;
            }
        }
    }
}
