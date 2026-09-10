
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the two floating-point numbers from the user
        System.out.print("Input a floating-point number: ");
        double number1 = input.nextDouble();

        System.out.print("Input another floating-point number: ");
        double number2 = input.nextDouble();

        // Round the numbers to three decimal places
        double roundedNumber1 = Math.round(number1 * 1000.0) / 1000.0;
        double roundedNumber2 = Math.round(number2 * 1000.0) / 1000.0;

        // Compare the rounded numbers
        if (roundedNumber1 == roundedNumber2) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
    }
}