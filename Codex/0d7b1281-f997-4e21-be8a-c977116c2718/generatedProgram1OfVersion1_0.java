import java.time.LocalTime;

public class TimeInfo {
    public static void main(String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Print the current time
        System.out.println("Current Time: " + currentTime);

        // Get the hour, minute, and second of the current time
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();

        // Print the hour, minute, and second
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
    }
}