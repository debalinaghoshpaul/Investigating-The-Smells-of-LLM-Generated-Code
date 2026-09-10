import java.util.Scanner;

public class SpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        int distance = scanner.nextInt();
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        double metersPerSecond = (double)distance / (double)hours / 3600;
        double kilometersPerHour = (double)distance / (double)minutes / 60;
        double milesPerHour = (double)distance / (double)seconds / 60;

        System.out.println("Your speed in meters/second is: " + metersPerSecond);
        System.out.println("Your speed in km/h is: " + kilometersPerHour);
        System.out.println("Your speed in miles/h is: " + milesPerHour);
    }
}

