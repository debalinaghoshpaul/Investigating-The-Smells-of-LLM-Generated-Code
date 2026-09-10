import java.util.Scanner;

public class DistanceBetweenTwoPointsOnEarth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the latitude and longitude of the two points
        System.out.print("Input the latitude of coordinate 1: ");
        double latitude1 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double longitude1 = input.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double latitude2 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double longitude2 = input.nextDouble();

        // Convert the latitude and longitude to radians
        latitude1 = Math.toRadians(latitude1);
        longitude1 = Math.toRadians(longitude1);
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);

        // Calculate the distance between the two points
        double distance = 6371.01 * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));

        // Print the distance
        System.out.println("The distance between those points is: " + distance + " km");
    }
}
