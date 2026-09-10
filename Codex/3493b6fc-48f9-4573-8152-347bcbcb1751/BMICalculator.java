import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();

        // Convert weight from pounds to kilograms
        double weightInKg = weight * 0.45359237;

        // Convert height from inches to meters
        double heightInM = height * 0.0254;

        // Calculate BMI
        double bmi = weightInKg / (heightInM * heightInM);

        System.out.println("Body Mass Index is " + bmi);
    }
}
