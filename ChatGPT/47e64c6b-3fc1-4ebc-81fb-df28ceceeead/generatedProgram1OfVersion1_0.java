
public class SpeedConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        double distance = input.nextDouble();

        System.out.print("Input hour: ");
        int hour = input.nextInt();

        System.out.print("Input minutes: ");
        int minutes = input.nextInt();

        System.out.print("Input seconds: ");
        int seconds = input.nextInt();

        // Calculate total time in seconds
        int totalTimeSeconds = hour * 3600 + minutes * 60 + seconds;

        // Calculate speed in meters/second
        double speedMetersSecond = distance / totalTimeSeconds;

        // Calculate speed in km/h
        double speedKmH = (distance / 1000) / (totalTimeSeconds / 3600);

        // Calculate speed in miles/h
        double speedMilesH = (distance / 1609) / (totalTimeSeconds / 3600);

        System.out.println("Your speed in meters/second is " + speedMetersSecond);
        System.out.println("Your speed in km/h is " + speedKmH);
        System.out.println("Your speed in miles/h is " + speedMilesH);
    }
}