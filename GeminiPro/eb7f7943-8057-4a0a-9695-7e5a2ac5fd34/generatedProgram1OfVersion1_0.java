import java.time.LocalTime;
import java.util.Scanner;

public class AddHoursToCurrentTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Get the number of hours to add
        System.out.print("Enter the number of hours to add: ");
        int hoursToAdd = input.nextInt();

        // Add the hours to the current time
        LocalTime newTime = currentTime.plusHours(hoursToAdd);

        // Print the new time
        System.out.println("The new time is: " + newTime);
    }
}
