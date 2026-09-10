public class FiniteFloatingPointCheck {
    public static void main(String[] args) {
        double num1 = 10.5;
        float num2 = Float.POSITIVE_INFINITY;

        if (Double.isFinite(num1)) {
            System.out.println(num1 + " is a finite floating-point value");
        } else {
            System.out.println(num1 + " is not a finite floating-point value");
        }

        if (Float.isFinite(num2)) {
            System.out.println(num2 + " is a finite floating-point value");
        } else {
            System.out.println(num2 + " is not a finite floating-point value");
        }
    }
}
