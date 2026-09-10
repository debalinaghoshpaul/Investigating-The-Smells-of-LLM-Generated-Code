import java.util.Scanner;

public class SpeedConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the distance in meters
        System.out.print("Input distance in meters: ");
        double distance = input.nextDouble();

        // Get the time taken in hours, minutes, and seconds
        System.out.print("Input hours: ");
        int hours = input.nextInt();

        System.out.print("Input minutes: ");
        int minutes = input.nextInt();

        System.out.print("Input seconds: ");
        int seconds = input.nextInt();

        // Convert the time to seconds
        double timeInSeconds = hours * 3600 + minutes * 60 + seconds;

        // Calculate the speed in meters per second
        double speedInMetersPerSecond = distance / timeInSeconds;

        // Convert the speed to kilometers per hour
        double speedInKmPerHour = speedInMetersPerSecond * 3.6;

        // Convert the speed to miles per hour
        double speedInMilesPerHour = speedInMetersPerSecond * 2.237;

        // Display the speed in meters per second, kilometers per hour, and miles per hour
        System.out.println("Your speed in meters/second is " + speedInMetersPerSecond);
        System.out.println("Your speed in km/h is " + speedInKmPerHour);
        System.out.println("Your speed in miles/h is " + speedInMilesPerHour);
    }
}
