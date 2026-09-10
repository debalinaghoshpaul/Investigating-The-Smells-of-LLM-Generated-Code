import java.util.Scanner;

public class PoundsKilograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pounds: ");
        double pounds = scanner.nextDouble();
        System.out.print("Enter kilograms: ");
        double kilograms = scanner.nextDouble();

        double poundsToKilogram = pounds / kilograms;
        double kilogramsToPound = kilograms / pounds;

        System.out.println("Pounds = " + pounds);
        System.out.println("Kilograms = " + kilograms);
        System.out.println("Pounds = " + poundsToKilogram);
        System.out.println("Kilograms = " + kilogramsToPound);
    }
}

// 