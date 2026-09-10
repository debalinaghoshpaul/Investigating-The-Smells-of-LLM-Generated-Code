import java.util.ArrayList;
import java.util.Scanner;

class Waypoint {
    double x;
    double y;
    int timestamp;

    public Waypoint(double x, double y, int timestamp) {
        this.x = x;
        this.y = y;
        this.timestamp = timestamp;
    }
}

public class GPSWaypoints {
    public static void main(String[] args) {
        ArrayList<Waypoint> waypoints = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Read waypoints from user input
        System.out.println("Enter waypoints (x y timestamp), enter 'q' to quit:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            String[] values = input.split(" ");
            double x = Double.parseDouble(values[0]);
            double y = Double.parseDouble(values[1]);
            int timestamp = Integer.parseInt(values[2]);
            waypoints.add(new Waypoint(x, y, timestamp));
        }

        // Calculate total distance and average speed
        double totalDistance = 0.0;
        int totalTime = waypoints.get(waypoints.size() - 1).timestamp - waypoints.get(0).timestamp;
        for (int i = 1; i < waypoints.size(); i++) {
            Waypoint prev = waypoints.get(i - 1);
            Waypoint curr = waypoints.get(i);
            double distance = Math.sqrt(Math.pow(curr.x - prev.x, 2) + Math.pow(curr.y - prev.y, 2));
            totalDistance += distance;
        }
        double averageSpeed = totalDistance / (totalTime / 3600.0);

        System.out.println("Total distance traveled: " + totalDistance + " miles");
        System.out.println("Average speed: " + averageSpeed + " miles per hour");
    }
}