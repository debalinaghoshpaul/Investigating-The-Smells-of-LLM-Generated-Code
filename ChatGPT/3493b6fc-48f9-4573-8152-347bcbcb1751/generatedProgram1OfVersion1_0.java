import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.println("Body Mass Index is " + bmi);
    }

    public static double calculateBMI(double weight, double height) {
        double bmi = (weight / (height * height)) * 703;
        return bmi;
    }
}
