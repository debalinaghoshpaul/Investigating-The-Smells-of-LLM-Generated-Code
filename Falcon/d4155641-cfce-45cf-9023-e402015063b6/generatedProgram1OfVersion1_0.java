import java.util.Scanner;

public class AverageSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = 0;
        double time = 0;
        double speed = 0;

        System.out.print("Enter distance: ");
        distance = scanner.nextDouble();

        System.out.print("Enter time: ");
        time = scanner.nextDouble();

        System.out.print("Enter speed: ");
        speed = scanner.nextDouble();

        double averageSpeed = (distance / time);

        System.out.println("Average speed in miles per hour: " + averageSpeed);
    }
}

