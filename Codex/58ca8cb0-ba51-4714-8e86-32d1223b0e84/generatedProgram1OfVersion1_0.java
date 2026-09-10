public class Test {
    public static void main(String[] args) {
        double number = 3.14; // Replace with your desired number

        if (Double.isFinite(number)) {
            System.out.println("The number is a finite floating-point value.");
        } else {
            System.out.println("The number is not a finite floating-point value.");
        }
    }
}