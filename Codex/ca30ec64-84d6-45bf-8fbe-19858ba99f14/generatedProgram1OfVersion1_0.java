import java.time.LocalTime;
import java.time.ZoneOffset;

public class Test {
    public static void main(String[] args) {
        int offset = 256; // Time zone offset to GMT

        // Get the current time in GMT
        LocalTime currentTime = LocalTime.now(ZoneOffset.ofTotalSeconds(offset * 60));

        // Format and print the current time
        System.out.println("Current time is " + currentTime);
    }
}