import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get weight in pounds from the user
        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();

        // Get height in inches from the user
        System.out.print("Input height in inches: ");
        double height = input.nextDouble();

        // Calculate BMI
        double bmi = weight * 703 / (height * height);

        // Print BMI
        System.out.println("Body Mass Index is " + bmi);
    }
}
