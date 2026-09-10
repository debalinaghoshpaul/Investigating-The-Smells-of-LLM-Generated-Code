import java.util.*;

public class SecondsConverter {

    public static void main(String[] args) {
        // Get the input seconds from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seconds:");
        int seconds = scanner.nextInt();
        scanner.close();

        // Convert the seconds to hours, minutes, and seconds
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        // Print the result
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
