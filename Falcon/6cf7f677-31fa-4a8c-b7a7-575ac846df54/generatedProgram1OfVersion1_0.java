import java.util.Scanner;

public class RoundFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a float number: ");
        double num = scanner.nextDouble();
        System.out.println("The rounded number is: " + round(num));
    }

    public static double round(double num) {
        return Math.round(num * 100) / 100.0;
    }
}

