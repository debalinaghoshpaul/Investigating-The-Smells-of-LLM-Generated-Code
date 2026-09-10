import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input distance in meters
        System.out.print("Input distance in meters: ");
        double distance = input.nextDouble();

        // Input time in hours, minutes, and seconds
        System.out.print("Input hour: ");
        int hours = input.nextInt();
        System.out.print("Input minutes: ");
        int minutes = input.nextInt();
        System.out.print("Input seconds: ");
        int seconds = input.nextInt();

        // Calculate total time in seconds
        int totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        // Calculate speed in meters per second
        double speedInMetersPerSecond = distance / totalTimeInSeconds;

        // Calculate speed in kilometers per hour
        double speedInKilometersPerHour = (distance / 1000) / (totalTimeInSeconds / 3600);

        // Calculate speed in miles per hour
        double speedInMilesPerHour = (distance / 1609) / (totalTimeInSeconds / 3600);

        // Display the results
        System.out.println("Your speed in meters/second is " + speedInMetersPerSecond);
        System.out.println("Your speed in km/h is " + speedInKilometersPerHour);
        System.out.println("Your speed in miles/h is " + speedInMilesPerHour);

        input.close();
    }
}
