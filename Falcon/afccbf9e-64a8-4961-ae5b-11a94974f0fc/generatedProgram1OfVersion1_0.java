import java.util.Scanner;

public class AverageSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double miles = 24;
        double minutes = 40;
        double seconds = 35;
        double km_per_hour = (double)miles / (double)minutes / (double)seconds;
        System.out.println("Average speed in kilometers per hour: " + km_per_hour);
    }
}

